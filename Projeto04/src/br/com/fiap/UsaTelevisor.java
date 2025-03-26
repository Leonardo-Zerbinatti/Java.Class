package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor01 = new Televisor(); // declarando e instanciando
        televisor01.volume = 8;
        televisor01.canal = 124;
        televisor01.diminuirVolume();
        televisor01.diminuirVolume();
        televisor01.trocarCanal(254);
        System.out.println("Volume atual: " + televisor01.volume + "\nCanal atual: " + televisor01.canal);
    }
}
