package SEMESTRE1.SEMESTRE1_SEMANA6.EX1;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;
    private String descricao;

    public Produto(String nome, double preco, int estoque, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void venderProduto(int qtd) {
        if (qtd > 0 && qtd <= estoque) {
            estoque -= qtd;
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            estoque += qtd;
        } else {
            System.out.println("A quantidade deve ser maior que zero.");
        }
    }

    public double obterValorTotal() {
        return preco * estoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("Descrição: " + descricao);
    }
}
