package org.example;

public class Pessoa {
    private double peso;
    private double altura;
    private String sexo;

    public Pessoa() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;

        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo != null) {
            this.sexo = sexo;
        }
    }

}