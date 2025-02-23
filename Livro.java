public class Livro extends ItemBiblioteca {
    private String genero;

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        super(titulo, autor, anoPublicacao);  // Chama o construtor da classe base
        this.genero = genero;
    }

    // Getter e Setter para o gênero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Livro: " + getTitulo() + " - " + getAutor() + " (" + getAnoPublicacao() + ") - Gênero: " + genero);
    }

    @Override
    public void emprestarItem() {
        if (isDisponivel()) {
            System.out.println("O livro "" + getTitulo() + "" foi emprestado.");
            setDisponivel(false);  // Marca como não disponível
        } else {
            System.out.println("O livro "" + getTitulo() + "" não está disponível para empréstimo.");
        }
    }
}
