import java.util.ArrayList;
import java.util.Scanner;

public class Loja extends BancoDeDadosLoja{

    ArrayList<ItemDoCarrinho> ListaDeCompra = new ArrayList<>();

    int opcaoSelecionada;
    Double ValorTotalDaCompra;
    int indexProdutoRemocao;
    Scanner entrada = new Scanner(System.in);
    int x = 0;

    Loja() {
        
        do {
            System.out.println("Selecione uma das opcoes: ");
            System.out.println("1 - Ver itens disponíveis");
            System.out.println("2 - Ver carrinho de compras");
            System.out.println("3 - Adicionar ao carrinho");
            System.out.println("4 - Finalizar compra");
            System.out.println("5 - Cadastrar produto");
            System.out.println("6 - Remover produto");
            System.out.println("7 - Sair");
            opcaoSelecionada = entrada.nextInt();
            //----------------------------------------------------------------------
            // Aqui exibe a lista dos itens na vitrine. ->
            if (opcaoSelecionada == 1) {
                for (ItemDaLoja i : InventarioDaLoja) {
                    System.out.println("===========Vitrine===========");
                    System.out.println("Nome:" + i.nome);
                    System.out.println("Valor:" + i.valor);
                    System.out.println("Codigo:" + i.id);
                    System.out.println("ID:" + x);
                    x++;
                    System.out.println("=============================");
                }
                x = 0;
                if(InventarioDaLoja.size() == 0){
                    System.out.println("========Vitrine vazia========");
                    System.out.println("=============================");
                }
            //----------------------------------------------------------------------
            // Aqui exibe a lista do carrinho de compras. ->
            } else if (opcaoSelecionada == 2) {
                for (ItemDoCarrinho i : ListaDeCompra) {
                    System.out.println("=====Carrinho de Compras=====");
                    System.out.println("Nome:" + i.nome);
                    System.out.println("Valor:" + i.valor);
                    System.out.println("Codigo:" + i.id);
                    System.out.println("ID:" + x);
                    x++;
                    System.out.println("Quantidade: " + i.quantEscolhida);
                    System.out.println("=============================");
                }
                x=0;
                if(ListaDeCompra.size() == 0){
                    System.out.println("=====Carrinho de Compras=====");
                    System.out.println("=============================");
                }
            //----------------------------------------------------------------------
            // Aqui adiciona item ao carrinho. ->
            } else if (opcaoSelecionada == 3) {
                ItemDoCarrinho itemDoCarrinho = new ItemDoCarrinho();
                System.out.print("Informe o código do produto: ");
                itemDoCarrinho.id = entrada.nextInt();
                for (ItemDaLoja i : InventarioDaLoja) {
                    if(itemDoCarrinho.id == i.id){
                        itemDoCarrinho.nome = i.nome;
                        itemDoCarrinho.valor = i.valor;
                    }
                }
                System.out.print("Informe a quantidade do produto: ");
                itemDoCarrinho.quantEscolhida = entrada.nextInt();
                ListaDeCompra.add(itemDoCarrinho);
            //----------------------------------------------------------------------
            // Aqui informa valor total. ->
            } else if (opcaoSelecionada == 4) {
                for (ItemDoCarrinho i : ListaDeCompra) {
                    ValorTotalDaCompra += i.valor;
                }
                System.out.print("Valor total parcelado: R$" + ValorTotalDaCompra);
                System.out.print("Valor total à vista: R$" + ValorTotalDaCompra*0.9);
                opcaoSelecionada = 6;
            //----------------------------------------------------------------------
            // Aqui cadastra de um novo item. ->
            } else if (opcaoSelecionada == 5) {
                ItemDaLoja itemLoja = new ItemDaLoja();
                System.out.print("Informe o nome do produto: ");
                itemLoja.nome = entrada.nextLine();
                itemLoja.nome = entrada.nextLine();
                System.out.print("Informe o valor do produto: ");
                itemLoja.valor = entrada.nextDouble();
                InventarioDaLoja.add(itemLoja);
                itemLoja.id = InventarioDaLoja.size() - 1;
            //----------------------------------------------------------------------
            // Aqui remove um item da vitrine. ->
            } else if (opcaoSelecionada == 6) {
                System.out.println("Informe o ID do produto");
                indexProdutoRemocao = entrada.nextInt();
                for (int i = 0; i < InventarioDaLoja.size(); i++) {
                    InventarioDaLoja.remove(indexProdutoRemocao);
                    System.out.println("Produto removido com sucesso.");
                }
            } else if(opcaoSelecionada < 1 || opcaoSelecionada > 7){
                System.out.println("Opção inválida!");
            }
        } while (opcaoSelecionada != 7);
        System.out.println("Obrigado, volte sempre!");
        entrada.close();
    }
}
