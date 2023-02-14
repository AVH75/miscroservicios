package com.nttdata.products.products.controller;


import com.nttdata.products.products.model.Client;
import com.nttdata.products.products.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
@RequiredArgsConstructor
public class ClientController {
    // boy a llamar a la interfaz de servicio
    @Autowired
    private final ClientService clientService;

    @GetMapping(value = "/list")
    public List<Client> list(){
        return clientService.listAllClient();
    }

    @PostMapping(value = "/save")
    public Client save(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @PutMapping(value = "update/{idce}")
    public  Client updateClient(@PathVariable("idce") Integer idce,@RequestBody Client client){
        return clientService.updateClient(client);

    }
@DeleteMapping(value = "/delete/{idce}")
    public int delete(@PathVariable ("idce")Integer idce ){
    return clientService.deleteClient(idce);
}

    }



