package org.example;

import proxy.ReleveService;
import proxy.ReleveServiceService;

public class Client {
    public static void main(String[] args) throws Exception {
        ReleveService stub=new ReleveServiceService().getReleveServicePort();
        System.out.println(stub.getReleve());
    }
}