package ru.enai.bank.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.enai.bank.domain.Client;
import ru.enai.bank.repositories.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    ClientRepository clientRepository;

    protected ClientService(@Qualifier("clientRepository") ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    protected Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    protected List<Client> getClient() {
        return clientRepository.findAll();
    }

    protected Client getClient(Long id) {
        return clientRepository.findById(id).orElse(null); //TODO NPE fix
    }

    protected String deleteClientById(Long id) {
        clientRepository.deleteById(id);
        return "Client has delete id = " + id;
    }

    protected String deleteClientBySurNameFirstNameLastName(Client client) {
        String surName = client.getSurName();
        String firstName = client.getFirstName();
        Client findClient = clientRepository.findBySurNameAndFirstName(surName, firstName);
        clientRepository.delete(findClient);
        return "Client has delete";
    }

    protected Client updateClient(Client client) {
        Client clientUpdate = clientRepository.findById(client.getId()).orElseThrow();
        clientUpdate.setEmail(client.getEmail());
        clientUpdate.setPassportNumber(client.getPassportNumber());
        clientUpdate.setPhoneNumber(client.getPhoneNumber());
        clientUpdate.setSurName(client.getSurName());
        clientUpdate.setFirstName(client.getFirstName());
        clientUpdate.setLastName(client.getLastName());
        return clientRepository.save(clientUpdate);
    }
}