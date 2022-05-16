package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {

    private Map<String, Produto> catalogo;


    public ProdutoRepository() {
        this.catalogo = new HashMap<String, Produto>();

    }

    public String cadastraProduto(Produto p) { // retornar id do produto cadastrado
        catalogo.put(p.getId(), p);
        return "o produto " + p.getId() + "foi cadastrado com sucesso.";
    }

    public void atualizaNome(String id, String nome) {
        Produto p = catalogo.get(id);
        p.setNome(nome);
        atualizarProduto(p);
    }

    public void atualizaFabricante(String id, String fabricante) {
        Produto p = catalogo.get(id);
        p.setFabricante(fabricante);
        atualizarProduto(p);
    }

    public void atualizarProduto(Produto produto) {
        catalogo.put(produto.getId(), produto);
    }

    public String removeProduto(String id) {
        catalogo.remove(id);
        return "O produto de ID: " + id + "foi removido.";
    }

    public String recuperarProduto(String id) {
        Produto p = catalogo.get(id);
        return p.toString();
    }

    public List<Produto> getProdutoByName(String nome) {
      List<Produto> produtos = new ArrayList<Produto>();
      for (Produto p: catalogo.values()) {
          if (p.getNome().contains(nome)) {
              produtos.add(p);
          }
        }
        return produtos;
    }

    public String listarProdutos() {
        return "";
    }

}
