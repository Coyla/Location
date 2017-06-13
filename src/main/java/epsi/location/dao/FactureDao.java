package epsi.location.dao;

import epsi.location.entity.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by work on 13/06/2017.
 */
@Repository
public class FactureDao implements MongoDao<Facture> {
    @Autowired
    private MongoTemplate mongoTemplate;
    public FactureDao() {
    }

    @Override
    public ArrayList<Facture> findAll() {
        return (ArrayList<Facture>)mongoTemplate.findAll(Facture.class,"facture");
    }

    @Override
    public Facture find(String id) {
        return mongoTemplate.findById(id,Facture.class);
    }

    @Override
    public boolean create(Facture obj) {
        return false;
    }

    @Override
    public boolean delete(Facture obj) {
        return false;
    }

    @Override
    public boolean update(Facture obj) {
        return false;
    }
}
