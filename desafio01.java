package excercicios;
/**
 *
 * @author Maria Perrone
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class desafio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //dados
        double carga = 100;
        
        DecimalFormat df = new DecimalFormat("0.0'%'"); //formatador
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           ===================================
                           DESAFIO 01
                           ====================================
                           """);
        //imput dados
        System.out.println("Insira o nome do(a) aluno(a): ");
        String aluno = sc.nextLine();

        System.out.println("Quantas horas de aula o(a) aluno(a) participou? ");
        double hrs = sc.nextDouble();

        System.out.println("Informe qual nota final do(a) aluno(a) : " + aluno);
        double nota = sc.nextDouble();

        //testes logicos
        
        if (hrs  < 0.75) {
            System.out.println("Certificado negado! frequencia de: " + df.format(hrs)
                    + " insuficientes");
        } else if (nota < 50) {
            System.out.println("Certificado negado! Nota abaixo da média ");
        } else {
            System.out.println("Aprovado para certificação, com a frequêAncia em "
                    + df.format(hrs));
        }
    }
}
