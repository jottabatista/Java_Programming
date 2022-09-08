import entities.Produtos;

import java.util.ArrayList;

public class FarmaciaRemedio {

    public static void main(String[] args) {

        Produtos dorflex = new Produtos("Dorflex", 150.00, 20, 10.50);
        System.out.println(dorflex.getQntdCapsulas());

        Produtos dipirona = new Produtos("Dipirona", 500.00, 6, 7.00);
        System.out.println(dipirona.getNomePrincialSubstancia());

        Produtos coristina = new Produtos("Coristina", 100.00, 4, 10.00);
        System.out.println(coristina.getNomePrincialSubstancia());

        var lista_de_produtos = new ArrayList<Produtos>();
        lista_de_produtos.add(dorflex);
        lista_de_produtos.add(dipirona);
        lista_de_produtos.add(coristina);
        System.out.println(lista_de_produtos);

    }

}



