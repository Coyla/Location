package epsi.location.dao;

import epsi.location.entity.Client;
import epsi.location.entity.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by work on 11/06/2017.
 */
@Repository
public class VoitureDao implements MongoDao<Voiture>{
    @Autowired
    private MongoTemplate mongoTemplate;

    public VoitureDao(){

    }

    @Override
    public ArrayList<Voiture> findAll() {
        return (ArrayList<Voiture>)mongoTemplate.findAll(Voiture.class,"voiture");
    }

    @Override
    public Voiture find(String id) {
        return mongoTemplate.findById(id, Voiture.class,"voiture");
    }

    @Override
    public boolean create(Voiture obj) {
        mongoTemplate.save(obj,"voiture");
        return true;
    }

    @Override
    public boolean delete(Voiture obj) {
        return false;
    }

    @Override
    public boolean update(Voiture obj) {
        return false;
    }
}
