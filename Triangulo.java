
public class Triangulo extends FormaGeometrica {
    

    private double base;
    private double altura;


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

   
    @Override
    public double area() {
        return (this.base * this.altura) / 2;
    }

   
    public double area(double base, double altura) {
        return (base * altura) / 2;
    }
}