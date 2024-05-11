public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo", 10),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 11),
    MINAS_GERAIS ("MG", "Minas Gerais", 12),
    PARANA ("PR", "Paraná", 13),
    SANTA_CATARINA ("SC", "Santa Catarina", 14),
    RONDONIA ("RO", "Rondônia", 15),
    ACRE ("AC", "Acre", 16),
    AMAZONAS ("AM", "Amazonas", 17),
    RORAIMA ("RR", "Roraima", 18),
    PARA ("PA", "Pará", 19),
    TOCANTINS ("TO", "Tocantins", 20),
    GOIAS ("GO", "Goiás", 21);


    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public int getIbge() {
        return ibge;
    }

}
