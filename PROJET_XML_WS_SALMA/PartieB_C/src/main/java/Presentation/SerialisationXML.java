package Presentation;

import Metier.Operation;
import Metier.Releve;
import Metier.TypeOperation;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
public class SerialisationXML {
    public static void main(String[] args) throws Exception {


        Releve releve=new Releve("011112222333344445555666","2021/1/1",14500);
        // Création des opérations
        Operation op1 = new Operation();
        op1.setType(TypeOperation.CREDIT);
        op1.setDate("2021/1/1");
        op1.setMontant(9000);
        op1.setDescription("Vers Espèce");

        Operation op2 = new Operation();
        op2.setType(TypeOperation.DEBIT);
        op2.setDate("2021/1/1");
        op2.setMontant(3400);
        op2.setDescription("Chèque Guichet");

        Operation op3 = new Operation();
        op3.setType(TypeOperation.DEBIT);
        op3.setDate("2021/1/1");
        op3.setMontant(120);
        op3.setDescription("Prélèvement Assurance");

        Operation op4 = new Operation();
        op4.setType(TypeOperation.CREDIT);
        op4.setDate("2021/1/1");
        op4.setMontant(70000);
        op4.setDescription("Virement");

        // Ajout des opérations à la liste des opérations du relevé
        releve.addOperation(op1);
        releve.addOperation(op2);
        releve.addOperation(op3);
        releve.addOperation(op4);



        // Sérialisation de l'objet Releve en XML
        JAXBContext context = JAXBContext.newInstance(Releve.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(releve, new File("releve.xml"));





    }
}