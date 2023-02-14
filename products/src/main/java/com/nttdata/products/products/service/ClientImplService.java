package com.nttdata.products.products.service;

import com.nttdata.products.products.model.Client;
import com.nttdata.products.products.repository.ClientRepository;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientImplService implements ClientService {

    // llamamos al repositorio , aqui nos va entregar y asemos uso del patron sigglenton
    @Autowired
    private ClientRepository clientRepository;
    // para hacer injeccion de dependencias
    @Override
    public List<Client> listAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
    //aqui se esta buscando el Cliente con findById, si no lo encuentra me manda una exception
    @Override
    public Client obtainClient(Integer idClient) {
        return clientRepository.findById(idClient).orElse(null); //.orElseThrow(() -> {throw new RuntimeException();});
    }
    @Override
    public Client updateClient(Client client) {
        Client client2 = obtainClient(client.getIdClient());
        if (client2 != null) {
            clientRepository.save(client);
        }
        return client;
    }

    @Override
 public int deleteClient(Integer id) {
        Client client = obtainClient(id);
        if (client != null) {
            clientRepository.delete(client);
            return 1;
        }
        return 0;
    }

}



