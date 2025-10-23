public class Areas {
    private double base;
    private double altura;
    private double lado;
    private double radio;

    // Getters y Setters
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    // Métodos de área
    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public double areaCircunferencia(double radio) {
        double PI = 3.1416;
        return PI * radio * radio;
    }

    public double areaTrianguloRectangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
