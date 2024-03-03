package src;

import src.classes.Alpino;
import src.classes.Bis;
import src.classes.Classic;
import src.classes.KitKat;
import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public class FactoryNestle extends AbstractEggFactory {
    @Override
    public OvoPequeno criarOvoPequeno() {
        return new Classic();
    }

    @Override
    public OvoMedio criarOvoMedio() {
        return new KitKat();
    }

    @Override
    public OvoGrande criarOvoGrande() {
        return new Alpino();
    }

    public OvoPequeno criarNovoOvoPequeno(){
        return new Bis();
    }
}
