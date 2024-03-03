package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import src.interfaces.OvoGrande;
import src.interfaces.OvoMedio;
import src.interfaces.OvoPequeno;

public class Main {

    public static void main(String[] args) throws IOException {

        AbstractEggFactory lacta = new FactoryLacta();
        AbstractEggFactory garoto = new FactoryGaroto();
        AbstractEggFactory nestle = new FactoryNestle();

        AbstractEggFactory ferreiro = new FactoryFerreiroRocher();
        AbstractEggFactory hersheys = new FactoryHersheys();

        Map<String, String> products = new HashMap<String, String>();

        products.put("001", "Alpino");
        products.put("002", "Classic");
        products.put("003", "Kit Kat");
        products.put("011", "Crocante");
        products.put("012", "Talento");
        products.put("013", "Baton ao leite");
        products.put("021", "Lacta ao leite");
        products.put("022", "Oreo");
        products.put("023", "Sonho de Valsa");

        products.put("004", "Bis");
        products.put("014", "Caribe");
        products.put("024", "Ouro Branco");

        products.put("031", "Hershey's 137g");
        products.put("032", "Hershey's 255g");
        products.put("033", "Hershey's 336g");

        products.put("041", "Ferreiro Rocher 137g");
        products.put("042", "Ferreiro Rocher 255g");
        products.put("043", "Ferreiro Rocher 366g");

        String fabrics[] = { "Nestle", "Garoto", "Lacta", "Hershey's", "Ferreiro" };

        System.out.println("----- Distribuidora de Egss -----\n");
        System.out.println("Temos ovos das seguintes fabricas: ");
        for (String fabric : fabrics) {
            System.out.println("[+] " + fabric);
        }

        System.out.println("\nInforme o codigo do produto desejado: \n");

        for (String key : products.keySet()) {
            System.out.println("[" + key + "] " + products.get(key));
        }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String code = reader.readLine();

        if (products.containsKey(code)) {

            switch (code) {
                case "001":
                    OvoGrande alpino = nestle.criarOvoGrande();
                    alpino.imprimirInfoProduto();
                    break;
                case "002":
                    OvoPequeno classic = nestle.criarOvoPequeno();
                    classic.imprimirInfoProduto();
                    break;
                case "003":
                    OvoMedio kitKat = nestle.criarOvoMedio();
                    kitKat.imprimirInfoProduto();
                    break;
                case "004":
                    OvoPequeno bis = ((FactoryNestle) nestle).criarNovoOvoPequeno();
                    bis.imprimirInfoProduto();
                    break;
                case "011":
                    OvoMedio crocante = garoto.criarOvoMedio();
                    crocante.imprimirInfoProduto();
                    break;
                case "012":
                    OvoGrande talento = garoto.criarOvoGrande();
                    talento.imprimirInfoProduto();
                    break;
                case "013":
                    OvoPequeno batom = garoto.criarOvoPequeno();
                    batom.imprimirInfoProduto();
                    break;
                case "014":
                    OvoMedio caribe = ((FactoryGaroto) garoto).criarNovoOvoMedio();
                    caribe.imprimirInfoProduto();
                    break;
                case "021":
                    OvoPequeno lactaLeite = lacta.criarOvoPequeno();
                    lactaLeite.imprimirInfoProduto();
                    break;
                case "022":
                    OvoMedio oreo = lacta.criarOvoMedio();
                    oreo.imprimirInfoProduto();
                    break;
                case "023":
                    OvoGrande sonhoDeValsa = lacta.criarOvoGrande();
                    sonhoDeValsa.imprimirInfoProduto();
                    break;
                case "024":
                    OvoGrande ouroBranco = ((FactoryLacta) lacta).criarNovoOvoGrande();
                    ouroBranco.imprimirInfoProduto();
                    break;
                case "031":
                    OvoPequeno hersheysPequeno = hersheys.criarOvoPequeno();
                    hersheysPequeno.imprimirInfoProduto();
                    break;
                case "032":
                    OvoMedio hersheysMedio = hersheys.criarOvoMedio();
                    hersheysMedio.imprimirInfoProduto();
                    break;
                case "033":
                    OvoGrande hersheysGrande = hersheys.criarOvoGrande();
                    hersheysGrande.imprimirInfoProduto();
                    break;
                case "041":
                    OvoPequeno ferreiroPequeno = ferreiro.criarOvoPequeno();
                    ferreiroPequeno.imprimirInfoProduto();
                    break;
                case "042":
                    OvoMedio ferreiroMedio = ferreiro.criarOvoMedio();
                    ferreiroMedio.imprimirInfoProduto();
                    break;
                case "043":
                    OvoGrande ferreiroGrande = ferreiro.criarOvoGrande();
                    ferreiroGrande.imprimirInfoProduto();
                    break;

                default:
                    break;
            }

        } else {
            System.err.println("\n Codigo invalido !!!\n");
        }

    }
}