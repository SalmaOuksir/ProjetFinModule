package Metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
    @XmlAttribute
    private TypeOperation Type;
    @XmlAttribute
    private String date;
    @XmlAttribute
    private double montant;
    @XmlAttribute
    private String description;

    public Operation() {
    }

    public Operation(TypeOperation type, String date, double montant, String description) {
        Type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    public TypeOperation getType() {
        return Type;
    }

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public String getDescription() {
        return description;
    }

    public void setType(TypeOperation type) {
        Type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Operation{" +
                "Type=" + Type +
                ", date=" + date +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }
}
