package epsi.location.dao;

import epsi.location.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class ClientDao implements MongoDao<Client> {
    @Autowired
    private MongoTemplate mongoTemplate;
    public ClientDao(){

    }
    @Override
    public ArrayList<Client> findAll(){
        Collection<Client> clients = mongoTemplate.findAll(Client.class);
        return (ArrayList<Client>)clients;
    }
    @Override
    public Client find(String id) {
        return mongoTemplate.findById(id, Client.class,"client");
    }

    @Override
    public boolean create(Client obj) {
        mongoTemplate.save(obj,"client");
        return true;
    }

    @Override
    public boolean delete(Client obj) {
        return false;
    }

    @Override
    public boolean update(Client obj) {
        return false;
    }
}
