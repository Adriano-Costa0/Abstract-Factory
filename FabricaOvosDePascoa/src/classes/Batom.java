package src.classes;

import src.interfaces.OvoPequeno;

public class Batom implements OvoPequeno {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Batom ------\n");
        System.out.println("Tipo de chocolate: Chocolate ao leite");
        System.out.println("Recheado: Sim");
        System.out.println("Fabricante: Garoto");
        System.out.println("Tamanho: P");
        System.out.println("C/Brinde: Sim");
    }

}
