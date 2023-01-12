package Presentation;

import Metier.Operation;
import Metier.Releve;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class DeserialisationXML {

    public static void main(String[] args) throws Exception {
        // Désérialisation du fichier XML en objet Releve
        JAXBContext context = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        System.out.println(releve);
        for (Operation op : releve.getOperations()) {
            System.out.println(op.toString());
        }


    }
}
