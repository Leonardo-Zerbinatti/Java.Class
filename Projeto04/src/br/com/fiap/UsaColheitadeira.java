package br.com.fiap;

public class UsaColheitadeira {
    public static void main(String[] args) {
        Colheitadeira colheitadeira01 = new Colheitadeira(); // declarando e instanciando
        colheitadeira01.motor = "Desligado";
        colheitadeira01.plataformaDeCorte = "Desligado";
        colheitadeira01.velocidade = 0;
        colheitadeira01.estadoMotor("Ligado");
        colheitadeira01.estadoplataformadeCorte("Ligado");
        System.out.println("Motor: " + colheitadeira01.motor);
        System.out.println("Platafor de Corte: " + colheitadeira01.plataformaDeCorte);
        colheitadeira01.velocidade = 0;
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        colheitadeira01.aumentarVelocidade();
        System.out.println("Velocidade da Colheitadeira: " + colheitadeira01.velocidade);




    }
}
