package epsi.location.service;

import epsi.location.dao.VoitureDao;
import epsi.location.entity.Client;
import epsi.location.entity.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by work on 11/06/2017.
 */
@Service
public class VoitureService {
    @Autowired
    private VoitureDao voitureDao;
    public VoitureService(){

    }

    public void create(Voiture voiture){
        voitureDao.create(voiture);
    }

    public Voiture getVoitureById(String id){
        return voitureDao.find(id);
    }

    public boolean isVoitureExist(Voiture voiture){
        boolean exist = true;
        Voiture voitureFound = getVoitureById(voiture.getId());
        if (voitureFound == null){
            exist = false;
        }
        return exist;
    }

    public ArrayList<Voiture> getAllVoiture(){
        return voitureDao.findAll();
    }

}
