package br.com.fiap;

public class UsaRadio {
    public static void main(String[] args) {
        Radio radio01 = new Radio(); // declarando e instanciando
        radio01.estacao = 89.1f;
        radio01.volume = 5;
        radio01.trocarEstacao(92.5f);
        radio01.aumentarVolume();
        radio01.aumentarVolume();
        radio01.aumentarVolume();
        System.out.println("Volume atual: " + radio01.volume + "\nEstação atual: " + radio01.estacao);

    }
}
