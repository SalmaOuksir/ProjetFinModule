package Presentation;

import Metier.Releve;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.SchemaOutputResolver;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class GenerateReleveXMLSchema {
    public static void main(String[] args) throws Exception {
        // Génération du schéma XML
        JAXBContext context = JAXBContext.newInstance(Releve.class);
        context.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) {
                return new StreamResult(new File("releve.xsd"));
            }
        });
    }
}
