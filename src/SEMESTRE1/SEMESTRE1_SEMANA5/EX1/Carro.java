package SEMESTRE1.SEMESTRE1_SEMANA5.EX1;

public class Carro {
    private  String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
    }

    public void acelerar(double valor) {
        if (valor > 0) {
            this.velocidade += valor;
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            this.velocidade -= valor;
            if (this.velocidade < 0) {
                this.velocidade = 0.0;
            }
        }
    }

    public String obterInfo() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Ano: " + ano +
                ", Velocidade: " + velocidade + " km/h";
    }

    public void parar() {
        this.velocidade = 0.0;
    }
}
