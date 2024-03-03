package src.classes;

import src.interfaces.OvoGrande;

public class Alpino implements OvoGrande {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Alpino ------\n");
        System.out.println("Tipo de chocolate: Chocolate ao leite");
        System.out.println("Recheado: Nao");
        System.out.println("Fabricante: Nestle");
        System.out.println("Tamanho: G");
        System.out.println("C/Brinde: Nao");
    }

}