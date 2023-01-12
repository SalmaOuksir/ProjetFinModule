package Metier;
import jakarta.jws.WebMethod;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name = "releve")
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlAttribute
    private String RIB;
    private String DateReleve;
    private double Solde;
    @XmlElement(name = "operation")
    private List<Operation> operations=new ArrayList<>();

    public Releve() {
    }

    public Releve(String RIB) {
        this.RIB = RIB;
    }

    public Releve(String RIB, String dateReleve, double solde) {
        this.RIB = RIB;
        DateReleve = dateReleve;
        this.Solde = solde;
    }

    public String getRIB() {
        return RIB;
    }

    public String getDateReleve() {
        return DateReleve;
    }

    public double getSolde() {
        return Solde;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public void setDateReleve(String dateReleve) {
        DateReleve = dateReleve;
    }

    public void setSolde(double Solde) {
        this.Solde = Solde;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
    public void addOperation(Operation o){
        operations.add(o);
    }
    @Override
    public String toString() {
        return
                "RIB='" + RIB + '\n' +
                "DateReleve=" + DateReleve +'\n'+
                "montant=" + Solde +'\n';
    }

}
