package br.com.fiap3espa.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface Operations {
    @WebMethod
    String showName();

    @WebMethod
    String showSymbol();

    @WebMethod
    double calculate(double a, double b);

    @WebMethod
    String showMessage(double a, double b);
}
