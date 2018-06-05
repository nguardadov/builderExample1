package com.guardado.com.guardado.builder;

public class Auto {

   private String marca;
   private String modelo;
   private int anio;

    public Auto() {
    }

    private Auto(Builder b) {
        this.marca = b.marcaa;
        this.modelo = b.modeloo;
        this.anio = b.anioo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }

    //create builder
    public static class Builder
    {
        private String marcaa;
        private String modeloo;
        private int anioo;

        public Builder(String marcaa, String modeloo, int anioo) {
            this.marcaa = marcaa;
            this.modeloo = modeloo;
            this.anioo = anioo;
        }

        public Auto build()
        {
            return  new Auto(this);
        }
    }
}
