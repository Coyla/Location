package epsi.location.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by work on 11/06/2017.
 */
@Document(collection = "voiture")
public class Voiture {
    @Id  private String id;
    private String immatricule;

    public Voiture(String id, String immatricule) {
        this.id = id;
        this.immatricule = immatricule;
    }
    public Voiture(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImmatricule() {
        return immatricule;
    }

    public void setImmatricule(String immatricule) {
        this.immatricule = immatricule;
    }
}
