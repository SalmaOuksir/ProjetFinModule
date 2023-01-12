package Metier.server;
import Metier.ReleveService;
import jakarta.xml.ws.Endpoint;
public class ReleveServiceServer {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8080/",new ReleveService());
        System.out.println("web service déployé sur http://0.0.0.0:8080/");
    }

}
