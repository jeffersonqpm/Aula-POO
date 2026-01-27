// Crie a classe com Camel Case
// Lembre-se de salvar o arquivo no formato NomeClasse.java
class POO04DataTypes {
    public static void main(String[] args) {
        int N1; // Declaração da variável
        int varA = 10; // Declaração e inicialização de variável
        int varB; // Declaração da variável
        N1 = 10; // Inicializar a variável, atribuir valor inicial
        // Declaração e inicialização
        byte A1 = 0; // Declaração e inicialização de variável
        boolean D; // Declaração de variável

        // Acessando o valor, imprimindo em tela
        System.out.println(N1);
        System.out.println(A1);
        System.out.println(D = true);
        // Atribuo o valor de varA para varB
        // Haverá um clone do objeto varA feito em varB
        // São dois objetos distintos
        varB = varA;
        System.out.println(varB);

        // Type Casting, widening, alargamento
        int menor1 = 1853674;
        double maior1 = (double) menor1;
        System.out.println(menor1);
        System.out.println(maior1);

        // Type Casting, narrowing, estreitamento
        int maior2 = 1253684;
        short menor2 = (short) maior2;
        System.out.println(maior2);
        System.out.println(menor2);
    }

}
