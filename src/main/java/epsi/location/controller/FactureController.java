package epsi.location.controller;

import epsi.location.entity.Client;
import epsi.location.entity.Facture;
import epsi.location.service.ClientService;
import epsi.location.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by work on 10/06/2017.
 */
@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired
    private FactureService factureService;
    @RequestMapping(value = "/all")
    public @ResponseBody  ArrayList<Facture> getAllFacture(){
        return  factureService.getAllFacture();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public @ResponseBody Facture getFacture(@PathVariable String id){
        return factureService.getFactureById(id);
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody String createFacture(@RequestBody Facture facture){
        if(factureService.isFactureExiste(facture)){
            return "existe";
        }
        else{
            factureService.createFacture(facture);
            return "creation";
        }
    }
}
