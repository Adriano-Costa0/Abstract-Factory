package src;

import src.classes.LactaLeite;
import src.classes.Oreo;
import src.classes.OuroBranco;
import src.classes.SonhoDeValsa;
import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public class FactoryLacta extends AbstractEggFactory {

    @Override
    public OvoPequeno criarOvoPequeno() {
        return new LactaLeite();
    }

    @Override
    public OvoMedio criarOvoMedio() {
        return new Oreo();
    }

    @Override
    public OvoGrande criarOvoGrande() {
        return new SonhoDeValsa();
    }

    public OvoGrande criarNovoOvoGrande(){
        return new OuroBranco();
    }

}
