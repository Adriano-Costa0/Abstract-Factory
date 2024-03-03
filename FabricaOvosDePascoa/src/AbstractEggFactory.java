package src;

import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public abstract class AbstractEggFactory {
    public abstract OvoPequeno criarOvoPequeno();

    public abstract OvoMedio criarOvoMedio();

    public abstract OvoGrande criarOvoGrande();
}
