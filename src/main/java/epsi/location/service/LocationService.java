package epsi.location.service;

import epsi.location.dao.LocationDao;
import epsi.location.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by work on 11/06/2017.
 */
@Service
public class LocationService {
    @Autowired
    private LocationDao locationDao;

    public LocationService(){

    }
    public ArrayList<Location> getAllLocation(){
        return locationDao.findAll();
    }
    public Location getLocationByid(String id){
        return locationDao.find(id);
    }
    public void createLocation(Location location){
        locationDao.create(location);
    }
    public boolean isLocationExist(Location location){
        boolean exist = true;
        if(getLocationByid(location.getId()) == null)
            exist = false;
        return exist;
    }
    public boolean paidLocation(Location location){
        locationDao.update(location);
        return true;
    }

}
