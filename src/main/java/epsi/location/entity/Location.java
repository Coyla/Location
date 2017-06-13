package epsi.location.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by work on 11/06/2017.
 */
@Document(collection = "location")
public class Location {
    @Id private String id;
    @Field("voiture")
    private Voiture voiture;
    @Field("client")
    private Client client;
    private String status;
    @Field("facture")
    private Facture facture;
    private String date;


    public Location(String id, Voiture voiture) {
        this.id = id;
        this.voiture = voiture;
    }
    public Location(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
