import java.util.ArrayList;
import java.util.List;

//Criar objeto produto
class produto{
    private String nome;
    private Double preço;
    private int quantidadeDeEstoque;

//Metodo contrutor do objeto produto
    public produto(String nome, Double preço, int quantidadeDeEstoque){
        this.nome = nome;
        this.preço = preço;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

// Mudar e visualizar valores das atributos do objeto produto
    public void setNome(String nome) {
            this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreço(Double preço) {
            this.preço = preço;
    }

    public Double getPreço(){
        return this.preço; 
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
            this.quantidadeDeEstoque = quantidadeDeEstoque ;
    }

    public int getQuantidadeDeEstoque(){
        return this.quantidadeDeEstoque;   
    }

//metodo para comprar 
    public void comprar (int quantidadeDeCompra){
        if (this.quantidadeDeEstoque >= quantidadeDeCompra){
            this.quantidadeDeEstoque = quantidadeDeEstoque - quantidadeDeCompra;
            System.out.println("Produto " + nome + " Comprado com sucesso!");
        
        }else{
            System.out.println("Produto "+ nome + " Possui apenas " + quantidadeDeEstoque + " unidades!");
        }
    }  

//Metodo para repor estoque
    public void reporEstoque (int quantidadeDeReposiçao){
        this.quantidadeDeEstoque += quantidadeDeReposiçao;
        System.out.println("Adicionado " + quantidadeDeReposiçao + " "+ nome +" com sucesso!" );
    }

//metodo para visualizar info do objeto produto
    public void mostrarInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Valor: R$ " + preço);
            System.out.println("Quantidade disponivel: " + quantidadeDeEstoque + " unidades");
            System.out.println("");
    }
}

//Criar objeto loja 
class Loja{
    List<produto> listaDeProduto = new ArrayList<>();

//Metodo para adicionar produto
    public void  adicionarProduto(produto produto){
        listaDeProduto.add(produto);
    }
//Metodo para mostrar produtos da loja 
    public void mostrarProdutos(){
        System.out.println("Produtos em estoque");
        System.out.println("");
        for(produto produto:listaDeProduto){
            produto.mostrarInfo();
        } 
    }

}

//Classe publica
public class GerenciaLoja{
    public static void main(String[] args){
    }
}





    

