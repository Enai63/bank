package ru.enai.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ru.enai.bank.domain.Client;
@Repository("clientRepository")
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findBySurNameAndFirstName(String surName, String firstName);
}
