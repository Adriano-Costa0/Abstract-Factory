package src.classes;

import src.interfaces.OvoPequeno;

public class Classic implements OvoPequeno {

    @Override
    public void imprimirInfoProduto() {
        System.out.println("\n------ Classic ------\n");
        System.out.println("Tipo de chocolate: Chocolate meio amargo");
        System.out.println("Recheado: Sim");
        System.out.println("Fabricante: Nestle");
        System.out.println("Tamanho: P");
        System.out.println("C/Brinde: Sim");
    }

}
