public class Pessoa {
    private double peso;
    private double altura;
    private String sexo;

    public Pessoa(double peso, double altura, String sexo){
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        if (peso > 0){
            this.peso = peso;

        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        if (altura > 0){
            this.altura = altura;
        }
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        if (sexo != null){
            this.sexo = sexo;
        }
    }

    public String calcularImc(){
        double imc = peso / (altura * altura);

        if (sexo.equals("F")){

            if (imc < 19.1){
                return "abaixo do peso";
            }

            else if (imc < 25.8){
                return "no peso normal";
            }

            else if (imc < 27.3){
                return "maginalmente acima do peso";
            }

            else if (imc < 32.3){
                return "acima do peso ideal";
            }

            else {
                return "obeso";
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
