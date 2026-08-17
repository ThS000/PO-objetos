package SEMESTRE1.SEMESTRE1_SEMANA6.EX1;

public class Main {
    static void main() {

                Produto produto1 = new Produto("Notebook", 3000, 5, "Notebook 512gb");
                Produto produto2 = new Produto("Mouse", 50, 20, "Mouse azul");
                Produto produto3 = new Produto("Teclado", 150, 10, "Teclado mecânico");

                produto1.venderProduto(2);
                produto2.venderProduto(5);
                produto3.venderProduto(3);

                produto1.adicionarEstoque(1);

                produto1.exibirInformacoes();
                System.out.println("Valor total: R$ " + produto1.obterValorTotal());

                System.out.println();

                produto2.exibirInformacoes();
                System.out.println("Valor total: R$ " + produto2.obterValorTotal());

                System.out.println();

                produto3.exibirInformacoes();
                System.out.println("Valor total: R$ " + produto3.obterValorTotal());
            }
        }
