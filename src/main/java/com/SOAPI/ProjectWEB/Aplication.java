package com.SOAPI.ProjectWEB;

import jakarta.xml.ws.Endpoint;
import com.SOAPI.ProjectWEB.CertidaoImplement;

public class Aplication {
    public static void main(String[] args) {
        CertidaoImplement certidaoNascimento = new CertidaoImplement();
        Endpoint.publish("http://localhost:8085/servico/certidao", certidaoNascimento);
        System.out.println("Serviço publicado com sucesso");
    }

}
