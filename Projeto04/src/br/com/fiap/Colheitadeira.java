package br.com.fiap;

public class Colheitadeira {
    // atributos
    public int velocidade;
    public String motor;
    public String plataformaDeCorte;
    //métodos
    public void aumentarVelocidade() {
        velocidade++;
    }
    public void diminuirVelocidade() {
        velocidade--;
    }
    public void estadoMotor(String energiaam) {
        motor = energiaam;
    }
    public void estadoplataformadeCorte(String energiaap) {
        plataformaDeCorte = energiaap;

    }
}
