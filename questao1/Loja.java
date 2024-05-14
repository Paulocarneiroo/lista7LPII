public abstract class Loja {
    protected int identificador;
    protected String cnpj;
    protected String razaoSocial;
    protected boolean aberta;

    
    public Loja(int identificador, String cnpj, String razaoSocial) {
        this.identificador = identificador;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getStatus() {
        return aberta ? "Aberta" : "Fechada";
    }
}

