public class Main {
    public static void main(String[] args) {
        // Criando a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando itens para adicionar à biblioteca
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "Romance");
        Revista revista1 = new Revista("National Geographic", "Vários Autores", 2023, 787);
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "Fábula");

        // Adicionando os itens à biblioteca
        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(revista1);
        biblioteca.adicionarItem(livro2);

        // Listando os itens da biblioteca
        System.out.println("\nItens da Biblioteca:");
        biblioteca.listarItens();

        // Pesquisando um item
        System.out.println("\nPesquisando por 'Dom Quixote':");
        ItemBiblioteca itemPesquisado = biblioteca.pesquisarItem("Dom Quixote");
        if (itemPesquisado != null) {
            itemPesquisado.exibirInformacoes();
        } else {
            System.out.println("Item não encontrado.");
        }

        // Emprestando e devolvendo um item
        System.out.println("\nEmprestando 'Dom Quixote':");
        livro1.emprestarItem();

        System.out.println("\nTentando emprestar 'Dom Quixote' novamente:");
        livro1.emprestarItem();

        System.out.println("\nDevolvendo 'Dom Quixote':");
        livro1.setDisponivel(true);
        livro1.emprestarItem();
    }
}
