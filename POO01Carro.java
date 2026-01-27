// Modificar de acesso padrão
// Operador de definição de classe
// Essa é a classe mais abstrata e genérica que representa um carro
public class POO01Carro {
    // Aqui temos o conjunto de propriedades que definem um carro genérico
    public String modelo;
    public String fabricante;
    public int anoDeFabricacao;

    // Construtor para inicializar as propriedades do carro
    // Obrigatoriamente é público e possui o mesmo nome da classe
    public POO01Carro(String modelo, String fabricante, int anoDeFabricacao) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
    }

}
