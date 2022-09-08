package entities;

public class TestCarro {

    public static void main(String[] args) {

       Carro siena = new Carro();
       siena.setCor("Preto");

       siena.setModelo("Siena");

       siena.setVelocidadeAtual(0);

       siena.setVelocidadeMaxima(180);

       siena.setLigado(false);
        System.out.println(siena.getLigado());

        siena.ligar();
        siena.acelerar(120);
        System.out.println();



    }




}
