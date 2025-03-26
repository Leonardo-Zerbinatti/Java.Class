package br.com.fiap;

public class UsaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado arCondicionado01 = new ArCondicionado(); //declarando e instanciando
        arCondicionado01.temperatura = 18;
        arCondicionado01.modo = "aquecer";
        arCondicionado01.aumentarTemperatura();
        arCondicionado01.aumentarTemperatura();
        arCondicionado01.aumentarTemperatura();
        arCondicionado01.aumentarTemperatura();
        arCondicionado01.aumentarTemperatura();
        arCondicionado01.aumentarTemperatura();
        System.out.println("Temperatura do ArCondicionado modo aquecer: " + arCondicionado01.temperatura);
        arCondicionado01.temperatura = 21;
        arCondicionado01.modo = "resfriar";
        arCondicionado01.diminuirTemperatura();
        arCondicionado01.diminuirTemperatura();
        arCondicionado01.diminuirTemperatura();
        System.out.println("Temperatura do ArCondicionado modo resfriar: " + arCondicionado01.temperatura);
    }
}
