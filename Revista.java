public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);  // Chama o construtor da classe base
        this.edicao = edicao;
    }

    // Getter e Setter para edição
    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Revista: " + getTitulo() + " - " + getAutor() + " (" + getAnoPublicacao() + ") - Edição: " + edicao);
    }

    @Override
    public void emprestarItem() {
        if (isDisponivel()) {
            System.out.println("A revista "" + getTitulo() + "" foi emprestada.");
            setDisponivel(false);  // Marca como não disponível
        } else {
            System.out.println("A revista "" + getTitulo() + "" não está disponível para empréstimo.");
        }
    }
}
