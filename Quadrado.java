public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        // Usa o método sobrecarregado da superclasse
        return super.area(this.lado);
    }
}