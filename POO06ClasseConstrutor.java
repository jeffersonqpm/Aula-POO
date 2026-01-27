public class POO06ClasseConstrutor {
    public static void main(String[] args) {
        // Criando uma instância da classe Construtor
        Construtor obj = new Construtor();

        Construtor objComParametro = new Construtor("Olá, Mundo!");
    }
}


class Construtor {
    // Construtor padrão para a classe Construtor
    public Construtor() {
        System.out.println("Construtor padrão chamado.");
    }
    // Construtor com parâmetro, utilizando sobrecarga de construtores
    public Construtor(String mensagem) {
        System.out.println("Construtor com parâmetro chamado: " + mensagem);
    }
}
