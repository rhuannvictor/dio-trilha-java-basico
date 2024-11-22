package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
        System.out.println("FIM");
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"JOAO","FELIPE","MARIA","PEDRO","MANU","JUAN","JOAQUIM","SOFIA","JOANA","ISABEL"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("o candidato " + candidato + " solicitou esse valor de salário: R$" +salarioPretendido);
            if (salarioBase <= salarioPretendido) {
                candidatosSelecionados++;       
                System.out.println("O candidato" + candidato + " foi selecionado para a vaga");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
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
            System.out.println("AGUARDAR RESPOSTA DOS DEMAIS CANDIDATOS");
        }
    }
}
