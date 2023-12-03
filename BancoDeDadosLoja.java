import java.util.ArrayList;

public class BancoDeDadosLoja {

    ArrayList<ItemDaLoja> InventarioDaLoja = new ArrayList<>();

    BancoDeDadosLoja(){
        ItemDaLoja granadaM67 = new ItemDaLoja();
        granadaM67.nome = "Granada M-67";
        granadaM67.valor = 925.99;
        granadaM67.id = 85;
        InventarioDaLoja.add(granadaM67);
        ItemDaLoja misselBalisticoPadrao = new ItemDaLoja();
        misselBalisticoPadrao.nome = "Míssel Balístico R-7-1";
        misselBalisticoPadrao.valor = 1825.99;
        misselBalisticoPadrao.id = 93;
        InventarioDaLoja.add(misselBalisticoPadrao);
    }
}
