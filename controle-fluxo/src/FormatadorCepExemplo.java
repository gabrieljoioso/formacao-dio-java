
// Definição da classe de exceção para CEP inválido
class CepInvalidoException extends Exception {
    // Construtor padrão sem argumentos
    public CepInvalidoException() {
        super("CEP inválido!");
    }

    // Construtor com uma mensagem personalizada
    public CepInvalidoException(String message) {
        super(message);
    }
}

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        // Retorna o CEP formatado se estiver correto
        return cep.substring(0, 5) + "-" + cep.substring(5);
    }
}
