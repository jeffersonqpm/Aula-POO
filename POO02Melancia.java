// Crie uma classe chamada Melancia que representa uma melancia em um sistema de inventário.
// Defina o nome do produto "Melancia" e inicialize a quantidade com o valor arbitrário 15, mas pode
// ser qualquer outro.
// A partir da classe Produto
public class POO02Melancia {
    public static void main(String[] args) {
        POO02ProdutoRefatorado melancia = new POO02ProdutoRefatorado();
        melancia.defineNome("Melancia");
        // Inicializa a quantidade com 15
        for (int i = 0; i < 15; i++) {
            melancia.adicionaProduto();
        }

        System.out.println("Detalhes iniciais da Melancia:");
        melancia.exibirDetalhes();

        // Retira 3 unidades
        melancia.retiraProduto();
        melancia.retiraProduto();
        melancia.retiraProduto();

        System.out.println("Detalhes após retirar 3 unidades:");
        melancia.exibirDetalhes();

        // Adiciona 5 unidades
        for (int i = 0; i < 5; i++) {
            melancia.adicionaProduto();
        }

        System.out.println("Detalhes após adicionar 5 unidades:");
        melancia.exibirDetalhes();
    }

}
