public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    // Construtor
    public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;  // Item disponível por padrão
    }

    // Getters e Setters (Encapsulamento)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Método abstrato para exibir informações, implementado de forma diferente em subclasses
    public abstract void exibirInformacoes();

    // Método abstrato para emprestar item, implementado de forma diferente em subclasses
    public abstract void emprestarItem();

    // Método para simular a pesquisa de um item
    public boolean pesquisarItem(String titulo) {
        return this.titulo.equalsIgnoreCase(titulo);
    }
}
