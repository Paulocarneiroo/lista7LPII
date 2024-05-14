package questao2;

class Automovel extends Veiculo {
    @Override
    public float acelerar(float velocidade) {
        return velocidade;
    }

    @Override
    public void parar() {
        System.out.println("O automóvel parou.");
    }
    
    public void trocarOleo(float litros) {
        System.out.println("Óleo trocado: " + litros + " litros.");
    }
}