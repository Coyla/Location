package epsi.location.controller;

import epsi.location.entity.Voiture;
import epsi.location.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by work on 11/06/2017.
 */
@RestController
@RequestMapping("/voiture")
public class VoitureController {
    @Autowired
    private VoitureService voitureService;

    public VoitureController() {

    }

    @RequestMapping(value = "/all")
    public
    @ResponseBody
    ArrayList<Voiture> getAllVoiture() {
        ArrayList<Voiture> clients = voitureService.getAllVoiture();
        return clients;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    Voiture getVoiture(@PathVariable String id) {
        return voitureService.getVoitureById(id);

    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public
    @ResponseBody
    String createVoiture(@RequestBody Voiture voiture) {
        if (voitureService.isVoitureExist(voiture)) {
            return "existe";
        } else {
            voitureService.create(voiture);
            return "creation";
        }
    }
}
