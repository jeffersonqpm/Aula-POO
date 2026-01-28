
public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== Testando Formas Geométricas ===\n");

 
        Triangulo tri = new Triangulo(10.0, 5.0);
        
        System.out.println("--- Triângulo ---");

        System.out.println("Área (atributos internos): " + tri.area());
    
        System.out.println("Área (sobrecarga 2 parâmetros): " + tri.area(8.0, 4.0));

        System.out.println("\n--- Quadrado ---");

        Quadrado quad = new Quadrado(6.0);
        
     
        System.out.println("Área (atributo interno): " + quad.area());
        
     
        System.out.println("Área (sobrecarga 1 parâmetro): " + quad.area(10.0));
    }
}


class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
   
        return super.area(this.lado);
    }
}