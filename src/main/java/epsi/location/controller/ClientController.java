package epsi.location.controller;

import com.sun.tools.javac.util.List;
import epsi.location.entity.Client;
import epsi.location.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by work on 10/06/2017.
 */
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @RequestMapping(value = "/all")
    public @ResponseBody  ArrayList<Client> getAllClient(){
        ArrayList<Client> clients= clientService.getAllClient();
        return clients;
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public @ResponseBody Client getClient(@PathVariable String id){
        Client client = clientService.getClientById(id);
        return client;
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody String createClient (@RequestBody Client client){
        if(clientService.isClientExiste(client)){
            return "existe";
        }
        else{
            clientService.createClient(client);
            return "creation";
        }
    }
}
