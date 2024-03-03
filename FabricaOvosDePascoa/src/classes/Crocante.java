package src.classes;

import src.interfaces.OvoMedio;

public class Crocante implements OvoMedio {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Crocante ------\n");
        System.out.println("Tipo de chocolate: Chocolate com nozes");
        System.out.println("Recheado: Nao");
        System.out.println("Fabricante: Garoto");
        System.out.println("Tamanho: M");
        System.out.println("C/Brinde: Nao");
    }

}
