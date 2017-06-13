package epsi.location.controller;

import epsi.location.entity.Client;
import epsi.location.entity.Location;
import epsi.location.entity.Voiture;
import epsi.location.service.ClientService;
import epsi.location.service.LocationService;
import epsi.location.service.VoitureService;
import org.omg.CORBA.Object;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by work on 11/06/2017.
 */
@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private VoitureService voitureService;
    public LocationController(){

    }
    /**
     * obtenir toutes les locations
     * @return
     */
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public   ResponseEntity<ArrayList<Location>> getAllLocation(){
        return new ResponseEntity<ArrayList<Location>>(locationService.getAllLocation(), HttpStatus.OK);
    }

    /**
     * obtenir une location avec id
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Location getLocation(@PathVariable String id){
        return locationService.getLocationByid(id);
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createLocation(@RequestBody Location location){
        Location location1 = location;
        String message = "";
        //verification client exist
        if(locationService.isLocationExist(location)){
            message =" existe";
        }
        else{
            //do verifi cation voiture client exist
            locationService.createLocation(location);
        }
        //verification voiture exist
        return message;
    }
    /**
     * modification de la facture
     * @param prix
     * @param id
     * @return
     */
    @RequestMapping(value = "/payer/{id}",method = RequestMethod.GET,params = {"prix"})
    public String payerLocation(@RequestParam(value = "prix") String prix, @PathVariable String id) {
        Location location = locationService.getLocationByid(id);
        if(location == null){
            return "no location found";
        }
        else {
            location.getFacture().setPrixPayee(prix);
            locationService.paidLocation(location);//update location
            return "updated ok";
        }
    }
    /**
     * obtien la location d'un client
     * @param id
     * @return
     */
    @RequestMapping(value = "/client/{id}",method = RequestMethod.GET)
    public Location getLocationByClient(@PathVariable String id){
        Location location = new Location();
        ArrayList<Location> locations = locationService.getAllLocation();
        for (Location locationList:locations
             ) {
            if(locationList.getClient() != null){
                if(locationList.getClient().getId().equals(id)) {
                    location = locationList;
                }
            }
        }
        return location;
    }
}
