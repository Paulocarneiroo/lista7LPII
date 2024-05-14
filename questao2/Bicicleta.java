package questao2;

class Bicicleta extends Veiculo {
    
    @Override
    public float acelerar(float velocidade) {
        return velocidade;
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}