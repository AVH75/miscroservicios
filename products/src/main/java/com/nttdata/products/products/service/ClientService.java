package com.nttdata.products.products.service;

import com.nttdata.products.products.model.Client;
import jdk.jfr.Category;

import java.util.List;
import java.util.Optional;

public interface ClientService {
 public List<Client>listAllClient();
    Client saveClient(Client client);

   Client obtainClient(Integer idClient);

    Client updateClient(Client client);
   int deleteClient (Integer id);

}
