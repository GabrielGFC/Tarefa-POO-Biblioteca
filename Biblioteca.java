import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<ItemBiblioteca> itens;

    public Biblioteca() {
        itens = new ArrayList<>();
    }

    // Método para adicionar um item à biblioteca
    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
        System.out.println("Item adicionado com sucesso: " + item.getTitulo());
    }

    // Método para pesquisar um item pelo título
    public ItemBiblioteca pesquisarItem(String titulo) {
        for (ItemBiblioteca item : itens) {
            if (item.pesquisarItem(titulo)) {
                return item;
            }
        }
        return null;
    }

    // Método para listar todos os itens disponíveis
    public void listarItens() {
        for (ItemBiblioteca item : itens) {
            item.exibirInformacoes();
        }
    }
}
