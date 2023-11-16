package Aplicacaoo;

import com.SOAPI.ProjectWEB.ProjetoAula1.CertidaoImplement;
import jakarta.xml.ws.Endpoint;

public class Aplication {
    public static void main(String[] args) {
        CertidaoImplement certidaoNascimento = new CertidaoImplement();
        Endpoint.publish("http://localhost:8085/servico/certidao", certidaoNascimento);
        System.out.println("Serviço publicado com sucesso");

    }

}
