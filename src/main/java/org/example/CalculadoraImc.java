package org.example;

public class CalculadoraImc {
    public String calcularImc(Pessoa pessoa){
        double imc = pessoa.getPeso() / (pessoa.getAltura()* pessoa.getAltura());

        if (pessoa.getSexo().equals("F")) {
            if (imc < 19.1) {
                return "abaixo do peso";
            } else if (imc < 25.8) {
                return "no peso normal";
            } else if (imc < 27.3) {
                return "marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "acima do peso ideal";
            } else {
                return "obesa";
            }
        }

        else {
                if (imc < 20.7){
                    return "abaixo do peso";
                }
                else if (imc < 26.4){
                    return "no peso normal";
                }
                else if (imc < 27.8){
                    return "marginalmente acima do peso";
                }
                else if (imc < 31.1){
                    return "acima do peso";
                }
                else {
                    return "obeso";
                }
        }




    }
}
