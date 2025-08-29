package br.com.fiap3espa.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap3espa.service.Operations")
public class Sum implements Operations {
    @Override
    public String showName() {
        return "SOMA";
    }

    @Override
    public String showSymbol() {
        return "+";
    }

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }

    @Override
    public String showMessage(double a, double b) {
        return "O resultado da " + showName() + " ( " + a + " " + showSymbol() + " " + b + " ) é: " + calculate(a, b) ;
    }
}
