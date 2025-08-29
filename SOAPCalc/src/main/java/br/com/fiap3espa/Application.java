package br.com.fiap3espa;

import br.com.fiap3espa.service.Sum;
import jakarta.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        System.out.println("Publicando api...");
        Endpoint.publish("http://localhost:8080/calculator/sum", new Sum());
        System.out.println("API publicada com sucesso");
    }
}
