package excercicios;

import java.util.Scanner;

/**
 *
 * @author Maria Perrone
 */
public class exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // abertura da conta
        double saldo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor a ser depositado: ");
        double deposito = sc.nextDouble();
        //calculo novo saldo
        saldo += deposito;

        //saque
        System.out.println("Informe o valor do saque: ");
        double saque = sc.nextDouble();

        if (saldo >= saque) {
            System.out.println("Saque efetuado com sucesso");
            saldo -= saque;
        } else {
            System.out.println("Operação negada, saque maior que o valor disponivel "
                    + "\n saldo disponivel é de : " + saldo);
        }

    }

}
