package src.classes;

import src.interfaces.OvoGrande;

public class SonhoDeValsa implements OvoGrande {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Sonho de Valsa ------\n");
        System.out.println("Tipo de chocolate: Chocolate com amendoas");
        System.out.println("Recheado: Sim");
        System.out.println("Fabricante: Lacta");
        System.out.println("Tamanho: G");
        System.out.println("C/Brinde: Nao");
    }

}