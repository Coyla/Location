package epsi.location.service;

import epsi.location.dao.ClientDao;
import epsi.location.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by work on 10/06/2017.
 */
@Service
public class ClientService {

    @Autowired
    private ClientDao clientDao;

    public ClientService(){

    }
    public ArrayList<Client> getAllClient(){
        return clientDao.findAll();

    }
    public void createClient(Client client){
        clientDao.create(client);

    }
    public Client getClientById(String idClient){
        return clientDao.find(idClient);


    }
    public boolean isClientExiste(Client client){
        boolean exist = true;
        Client clientFound = getClientById(client.getId());
        if (clientFound == null){
            exist = false;
        }
        return exist;
    }
}
