package com.guardado.com.guardado.builder;

public class Director {
    
    public Auto getSedan(String marca, String modelo, int anio)
    {
        return new Auto.Builder(marca,modelo,anio).build();
    }
}
