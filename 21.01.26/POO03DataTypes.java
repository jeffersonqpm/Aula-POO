// Declara a classe chamada POO02DataTypes
class POO03DataTypes {
    // public é uma keyword que modifica o acesso ao escopo da função main
    // static é uma keyword que declara o método main como estático, com isso não é preciso criar o
    // objeto instanciando a classe, e o método main executa diretamente
    // main é uma keyword que define o ponto de início do programa
    // String args[], neste caso, é utilizado para acessar argumentos via linha de comando
    public static void main(String args[]) {
        // println é um método para imprimir valores em tela, é membro de out que por sua vez faz
        // parte do pacote System do java
        System.out.println("Trabalhando com tipos de dados primitivos em Java");

        // Data Type Tamanho Descrição
        // byte 1 byte Armazena números inteiros de -128 até 127 (255)
        byte varByte = -128;
        System.out.println("varByte: " + varByte);
        // short 2 bytes Armazena números inteiros de -32,768 até 32,767 (65535)
        short varShort = -32768;
        System.out.println("varShort: " + varShort);
        // int 4 bytes Armazena números inteiros de -2,147,483,648 até 2,147,483,647 (4294967295)
        // long 8 bytes Armazena números inteiros de -9,223,372,036,854,775,808 até
        // 9,223,372,036,854,775,807
        // float 4 bytes Armazena números reais, ou ponto flutuante, com 6 ou 7 casas decimais
        // double 8 bytes Armazena números reais, ou ponto flutuante, com até 15 casas decimais
        // boolean 1 bit Armazena apenas os valores lógicos booleanos de true ou false
        // char 2 bytes Armazena um único caractere, letra ou valores ASCII
    }
}
