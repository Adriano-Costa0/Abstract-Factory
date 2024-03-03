package src;

import src.classes.Batom;
import src.classes.Caribe;
import src.classes.Crocante;
import src.classes.Talento;
import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public class FactoryGaroto extends AbstractEggFactory {

    @Override
    public OvoPequeno criarOvoPequeno() {
        return new Batom();
    }

    @Override
    public OvoMedio criarOvoMedio() {
       return new Crocante();
    }

    @Override
    public OvoGrande criarOvoGrande() {
        return new Talento();
    }

    public OvoMedio criarNovoOvoMedio(){
        return new Caribe();
    }



    
}
