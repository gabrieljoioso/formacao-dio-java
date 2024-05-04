package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"GABRIEL", "RODRIGO", "FERNANDO", "MARCIO", "ALESSANDRA"};
        
        for(String candidato : candidatos){
            entrarEmContato(candidato);
        }

        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecionarCandidatos();
        //imprimirCandidatos();
        
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO O RESULTADOS DOS DEMAIS CANDIDATOS");
        }
    } 

    static void selecionarCandidatos(){
        String[] candidatos = {"GABRIEL", "RODRIGO", "FERNANDO", "MARCIO", "ALESSANDRA", "ALINE", "RAFAEL", "DANIELA", "JOSÉ", "AMANDA", "GIOVANNA", "CAIO", "FELIPE", "MARCIO", "ALESSANDRA", "ALINE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void imprimirCandidatos(){
        String[] candidatos = {"GABRIEL", "RODRIGO", "FERNANDO", "MARCIO", "ALESSANDRA"};
        System.out.println("Imprimindo a lista de cadidatos informando o indice de elemento.");

        // For tradicional
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
        }

        // Foreach
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVAS");
        }
        else{
            System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " ATINGIDA");
        }

    }

}
