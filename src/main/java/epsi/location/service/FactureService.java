package epsi.location.service;

import epsi.location.dao.FactureDao;
import epsi.location.entity.Client;
import epsi.location.entity.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by work on 13/06/2017.
 */
@Service
public class FactureService {
    @Autowired
    private FactureDao factureDao;

    public FactureService() {
    }

    public ArrayList<Facture> getAllFacture(){
        return factureDao.findAll();

    }
    public void createFacture(Facture facture){
        factureDao.create(facture);

    }
    public Facture getFactureById(String idClient){
        return factureDao.find(idClient);
    }
    public boolean isFactureExiste(Facture facture){
        boolean exist = true;
        Facture factureFound = getFactureById(facture.getId());
        if (factureFound== null){
            exist = false;
        }
        return exist;
    }
}
