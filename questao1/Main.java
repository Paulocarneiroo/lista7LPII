public class Main {
    public static void main(String[] args) {
        LojaShopping loja1 = new LojaShopping(1, "123456789", "Loja 1", "Endereço 1", "Gerente 1");
        LojaShopping loja2 = new LojaShopping(2, "987654321", "Loja 2", "Endereço 2", "Gerente 2");
        LojaShopping loja3 = new LojaShopping(3, "567891234", "Loja 3", "Endereço 3", "Gerente 3");

    
        loja1.registra_abertura_dia();
        loja2.registra_abertura_dia();
        loja3.registra_abertura_dia();

    
        System.out.println("\nDados da Loja 1:");
        loja1.mostrarDados();
        System.out.println("\nDados da Loja 2:");
        loja2.mostrarDados();
        System.out.println("\nDados da Loja 3:");
        loja3.mostrarDados();
    }
}