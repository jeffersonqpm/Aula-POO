// Crie uma classe chamada Produto que representa um produto em um sistema de inventário.
// Propriedades: private nome (String) e private quantidade (int).
// Crie o método construtor, vazio
// Crie um método int chamado retiraProduto(), sem parametros, que reduz a quantidade do produto em
// 1 unidade e retorna a nova quantidade.
// Crie um método int chamado adicionaProduto(), sem parametros, que aumenta a quantidade do produto
// em 1 unidade e retorna a nova quantidade.
public class POO02ProdutoRefatorado {
    private String nome;
    private int quantidade;

    // Construtor vazio
    public POO02ProdutoRefatorado() {
        //
    }

    // Novo método para definir o nome do produto
    public String defineNome(String novoNome) {
        this.nome = novoNome;
        return nome;
    }

    // Método para retirar um produto
    public int retiraProduto() {
        if (quantidade > 0) {
            // quantidade = quantidade - 1;
            quantidade--;
        }
        return quantidade;
    }

    // Método para adicionar um produto
    public int adicionaProduto() {
        // quantidade = quantidade + 1;
        quantidade++;
        return quantidade;
    }

    // Método para adicionar um produto
    public int adicionaProduto(int novaQuantidade) {
        // quantidade = quantidade + novaQuantidade;
        quantidade += novaQuantidade;
        return quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Quantidade em Estoque: " + quantidade);
    }
}
