public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 8;

        if (nota >= 7){
            System.out.println("Parabéns, você foi aprovado!");
        }
        else if (nota >= 5 && nota < 7){
            System.out.println("Necessário fazer a prova de recuperação!");
        }
        else{
            System.out.println("Nao foi dessa vez! Você foi reprovado!");
        }
        
    }
    
}
