import java.util.ArrayList;

public class BancoDeDadosLoja {

    ArrayList<ItemDaLoja> InventarioDaLoja = new ArrayList<>();

    ItemDaLoja granadaM67 = new ItemDaLoja();
    ItemDaLoja semtex = new ItemDaLoja();

    BancoDeDadosLoja(){

        granadaM67.nome = "Granada M-67";
        granadaM67.valor = 925.99;
        InventarioDaLoja.add(granadaM67);
        granadaM67.id = 67;

        semtex.nome = "Semtex";
        semtex.valor = 1825.99;
        InventarioDaLoja.add(semtex);
        semtex.id = 76;
    }
}
