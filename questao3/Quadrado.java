package questao3;

class Quadrado extends Quadrilatero {
    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }
    public double calcularArea() {
        return lado1 * lado1;
    }
}