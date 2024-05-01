public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"William", "JONAS", "John", "MARCOS"};
        
        for (int x=0; x<alunos.length; x++){ // enquanto x for menor que o tamanho de alunos x++
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        
        System.out.println("\nUsando o for each\n"); //  a cada iteração de alunos, o aluno atual do indice atual vai atualizar a aluno
        for (String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
    
}
