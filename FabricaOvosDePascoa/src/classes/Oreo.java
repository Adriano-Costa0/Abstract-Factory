package src.classes;

import src.interfaces.OvoMedio;

public class Oreo implements OvoMedio {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Oreo ------\n");
        System.out.println("Tipo de chocolate: Chocolate ao leite com bolacha");
        System.out.println("Recheado: Sim");
        System.out.println("Fabricante: Lacta");
        System.out.println("Tamanho: M");
        System.out.println("C/Brinde: Nao");
    }

}
