package com.sda.palpuscas.hibernate3;

import com.sda.palpuscas.hibernate3.model.Client;
import com.sda.palpuscas.hibernate3.repository.ClientRepository;
import com.sda.palpuscas.hibernate3.utils.SessionManager;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        ClientRepository clientRepository = new ClientRepository();
        Client client1 = new Client("Ion","Ionescu","ion@gmail.com",Date.valueOf("1998-11-24"));
        Client client2 = new Client("Paul","Puscas","paul@gmail.com",Date.valueOf("1980-06-10"));
        clientRepository.save(client1);
        clientRepository.save(client2);

        clientRepository.findAll().forEach(client -> System.out.println(client));

//       SessionManager.shutDown();
    }
}
