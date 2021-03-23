package ru.enai.bank.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Client> clients;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Credit> credits;

    public Bank() {
    }

    public Bank(Long id, String name, List<Client> clients, List<Credit> credits) {
        this.id = id;
        this.name = name;
        this.clients = clients;
        this.credits = credits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Client> getClients() {
        return clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }
}
