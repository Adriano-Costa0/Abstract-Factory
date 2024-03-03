package src.classes;

import src.interfaces.OvoMedio;

public class KitKat implements OvoMedio {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Kit Kat ------\n");
        System.out.println("Tipo de chocolate: Chocolate com wafer");
        System.out.println("Recheado: Sim");
        System.out.println("Fabricante: Nestle");
        System.out.println("Tamanho: M");
        System.out.println("C/Brinde: Sim");
    }

}
