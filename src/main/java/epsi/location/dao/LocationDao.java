package epsi.location.dao;

import epsi.location.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by work on 11/06/2017.
 */
@Repository
public class LocationDao implements MongoDao<Location>{
    @Autowired
    private MongoTemplate mongoTemplate;
    public LocationDao(){

    }

    @Override
    public ArrayList<Location> findAll() {
        return (ArrayList<Location>)mongoTemplate.findAll(Location.class);
    }

    @Override
    public Location find(String id) {
        return mongoTemplate.findById(id,Location.class,"location");
    }

    @Override
    public boolean create(Location obj) {
        mongoTemplate.save(obj,"location");
        return true;
    }

    @Override
    public boolean delete(Location obj) {
        return false;
    }

    @Override
    public boolean update(Location obj) {
        mongoTemplate.save(obj,"location");
        return true;
    }
}
