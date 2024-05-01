public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        double saldo = 35.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Valor sacado com sucesso!\nNovo saldo de R$" + saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        } 
    }
}
