package com.SOAPI.ProjectWEB.ProjetoAula1;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)


public interface CertidaoDeNascimento {
    public int calcularIdade(String idade);
    public String diaDoNascimento(String idade);
}
