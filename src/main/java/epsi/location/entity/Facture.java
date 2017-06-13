package epsi.location.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by work on 11/06/2017.
 */
@Document(collection = "facture")
public class Facture {

    @Id private String id;
    private String date;
    private String prixDemandee;
    private String prixPayee;

    public Facture() {
    }

    public Facture(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrixDemandee() {
        return prixDemandee;
    }

    public void setPrixDemandee(String prixDemandee) {
        this.prixDemandee = prixDemandee;
    }

    public String getPrixPayee() {
        return prixPayee;
    }

    public void setPrixPayee(String prixPayee) {
        this.prixPayee = prixPayee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
