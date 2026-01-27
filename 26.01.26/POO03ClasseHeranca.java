// Essa é a classe principal do programa.
// É aqui que o Java começa a executar tudo.
public class POO03ClasseHeranca {

    // O método main é o ponto de partida do programa.
    // Tudo começa a rodar por aqui.
    public static void main(String[] args) {

        // Aqui estamos criando um objeto do tipo Animal.
        // É como se estivéssemos "criando um animal" dentro do programa.
        Animal animalGenerico = new Animal();

        // Estamos mandando o animal comer.
        // Passamos a comida "ração" como informação.
        animalGenerico.comer("ração");

        // Aqui exibimos na tela se o animal está vivo.
        // A variável "vivo" pertence ao animal.
        System.out.println("O animal está vivo? " + animalGenerico.vivo);


        // Agora estamos criando um objeto do tipo Cachorro.
        // Cachorro é um tipo especial de Animal (herda de Animal).
        Cachorro cachorro = new Cachorro();

        // Mostra o nome do cachorro na tela.
        System.out.println("Nome do doguinho: " + cachorro.nome);

        // Mostra se o cachorro está vivo.
        // Mesmo sendo Cachorro, ele também tem a variável "vivo",
        // porque herdou isso da classe Animal.
        System.out.println("Doguinho vive? " + cachorro.vivo);

        // Mandamos o cachorro latir.
        // Esse comportamento existe só na classe Cachorro.
        cachorro.Latir();

        // Mandamos o cachorro comer.
        // Esse método não está na classe Cachorro diretamente,
        // mas ele herdou da classe Animal.
        cachorro.comer("Ração");
    }

}


// Classe Animal: representa um animal genérico.
class Animal {

    // Essa variável diz se o animal está vivo ou não.
    // Começa como true (verdadeiro).
    public Boolean vivo = true;

    // Método que representa o animal comendo.
    // Recebe como informação o nome do alimento.
    public void comer(String alimento) {

        // Mostra na tela o que o animal está comendo.
        System.out.println("O animal está comendo " + alimento);
    }
}


// Classe Cachorro: é um tipo de Animal.
// A palavra "extends" significa HERANÇA.
// Ou seja, Cachorro herda tudo que Animal tem.
class Cachorro extends Animal {

    // Nome do cachorro.
    public String nome = "Rex";

    // Método que faz o cachorro latir.
    public void Latir() {

        // Mostra o som do latido na tela.
        System.out.println("Au Au!");
    }
}
