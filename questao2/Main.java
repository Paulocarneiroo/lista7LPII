package questao2;

public class Main {
    public static void main(String[] args) {
        Veiculo bicicleta = new Bicicleta();
        Veiculo automovel = new Automovel();

        float velocidadeBicicleta = bicicleta.acelerar(20);
        System.out.println("A bicicleta está a " + velocidadeBicicleta + " km/h.");
        bicicleta.parar();

        float velocidadeAutomovel = automovel.acelerar(60);
        System.out.println("O automóvel está a " + velocidadeAutomovel + " km/h.");
        automovel.parar();

        ((Automovel) automovel).trocarOleo(4.5f);
    }
}