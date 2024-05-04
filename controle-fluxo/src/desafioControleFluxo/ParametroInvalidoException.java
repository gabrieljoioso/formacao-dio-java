package desafioControleFluxo;

class ParametrosInvalidosException extends Exception {
    // Construtor padrão sem argumentos
    public ParametrosInvalidosException() {
        super("Parametros Invalidos!");
    }

    // Construtor com uma mensagem personalizada
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
