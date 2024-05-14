class LojaShopping extends Loja implements Registro {
    private String endereco;
    private String gerente;

    public LojaShopping(int identificador, String cnpj, String razaoSocial, String endereco, String gerente) {
        super(identificador, cnpj, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    public void mostrarDados() {
        System.out.println("Identificador: " + super.identificador);
        System.out.println("CNPJ: " + super.cnpj);
        System.out.println("Razão Social: " + super.razaoSocial);
        System.out.println("Endereço: " + endereco);
        System.out.println("Gerente: " + gerente);
        System.out.println("Status: " + getStatus());
    }

    @Override
    public void registra_abertura_dia() {
        if (!aberta) {
            aberta = true;
            System.out.println("Loja aberta.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }

    @Override
    public void registra_fechamento_dia() {
        if (aberta) {
            aberta = false;
            System.out.println("Loja fechada.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }
}
