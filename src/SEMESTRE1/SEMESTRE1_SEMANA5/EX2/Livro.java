package SEMESTRE1.SEMESTRE1_SEMANA5.EX2;

public class Livro {
     String titulo;
     String autor;
     int numPaginas;
     boolean estaDisponivel;

    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.estaDisponivel = true;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.numPaginas);
        System.out.println("Disponível: " + (this.estaDisponivel ? "Sim" : "Não"));




    }

}
