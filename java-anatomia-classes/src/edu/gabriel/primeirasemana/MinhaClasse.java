package edu.gabriel.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Gabriel";
        String segundoNome = "Joioso";
        String [] emails = {"aluno@gmail.com", "blabla@gmail.com"};

        String nomeCompleto = concatenarNome(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    // Metodo que faz a concatenacao de dois valores
    public static String concatenarNome(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);  

    }

    // Metodo que pode disparar exceção
    public double dividir(int dividendo, int divisor) throws Exception {
        double resultado = dividendo / divisor;
        return resultado;
    }

    // Metodo privado, não pode ser visto por outras classes, void não retorna nada
    private void metodoPrivado() {

    }

    // Metodo com finalidade de gravar info de cliente, mas faça uma classe para isso, exemplo abaixo
    public void gravarClienteErrado(String nome, String cpf, Integer id) {

    }

    // Show! cria a classe com todas as caracteriscias
    public void gravarClienteCorreto(Cliente cliente) {

    }

}
