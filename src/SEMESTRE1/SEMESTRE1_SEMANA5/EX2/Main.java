package SEMESTRE1.SEMESTRE1_SEMANA5.EX2;

public class Main {
    static void main(String[] args) {

        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 310);
        Livro livro2 = new Livro("Uma Breve História do Tempo", "Stephen Hawking", 256);

        // Alterando o estado do primeiro livro
        livro1.estaDisponivel = false;

        // Apenas chamando as funções para exibir os dados
        System.out.println("DETALHES DOS LIVROS");
        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}

