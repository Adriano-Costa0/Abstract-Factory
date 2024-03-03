package src.classes;

import src.interfaces.OvoPequeno;

public class LactaLeite implements OvoPequeno {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Lacta Leite ------\n");
        System.out.println("Tipo de chocolate: Chocolate ao leite");
        System.out.println("Recheado: Nao");
        System.out.println("Fabricante: Lacta");
        System.out.println("Tamanho: P");
        System.out.println("C/Brinde: Sim");
    }

}
