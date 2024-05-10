public class SistemaCadastro {
    public static void main(String[] args) {

        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Gabriel", "04538845300");

        //definimos o endereço de gabriel
        marcos.setEndereco("RUA DAS MARIAS");

        //imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
