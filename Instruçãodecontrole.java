package instrucoesdecontrole;

import java.util.Scanner;

public class InstrucoesDeControle {
    
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        
        float media;
        System.out.println("Digite a média: ");
        media = in.nextFloat();
        if (media > 7) {
            System.out.println("Aprovado");
        } 
        else if (media > 5){
            System.out.println("Fazer AF");
        }
        else {
            System.out.println("Reprovado");
            System.out.println("\n\n");
        }
        String situacao;
        situacao = media > 7 ? "Aprovado" : (media > 5 ? "Fazer AF" : "Reprovado");
        
        // Menu com Switch case
        int a;
        System.out.println("Digite uma das opções\n1. Calcular Média\n2. Situação do Aluno\n3. Sair");
        a = in.nextInt();

        switch(a) {
            case 1:
                System.out.println(media); break;
            case 2: 
                System.out.println(situacao);
            case 3:
                System.out.println("Obrigado!");
        }
    }
}
