package Metier;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlTransient;

import java.io.File;


@WebService
public class ReleveService {
    @WebMethod
    @XmlTransient
    public Releve getReleve() throws Exception {
        //return new Releve("34134245",new Date("10-10-2022"),2347.54,new Operations(new Date("10-10-2022"),new Date("10-10-2022"),ListOperations()));

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));

        return releve;




    }

}