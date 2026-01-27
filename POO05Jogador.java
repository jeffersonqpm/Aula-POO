/**
 * Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de
 * nascimento, nacionalidade altura e peso. Crie um método para imprimir os dados do jogador, na
 * forma: DADOS DO JOGADOR Nome: Posição: Nascimento: Nacionalidade: Altura: Peso:
 */
public class POO05Jogador {

    public static void main(String[] args) {
        String nome = "Rivaldo";
        String posicao = "Atacante";
        String nascimento = "32/02/1972";
        String nacionalidade = "Meus país, Pernambuco";
        float altura = 1.75f;
        float peso = 70.5f;
        System.out.println("DADOS DO JOGADOR");
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Nascimento: " + nascimento);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
}
