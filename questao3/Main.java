package questao3;

public class Main {
    public static void main(String[] args) {
        
        System.out.println();
        FormaGeometrica retangulo = new Retangulo(5, 3);
        FormaGeometrica quadrado = new Quadrado(4);
        FormaGeometrica circulo = new Circulo(2);

        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}