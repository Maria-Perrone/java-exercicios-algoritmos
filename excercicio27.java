package excercicios;

import java.util.Scanner;

/**
 *
 * @author adm
 */
public class excercicio27 {

    public static void main(String[] args) {
        int totalNumeros = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite números inteiros (digite 0 para sair):");

        while (true) {
            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            totalNumeros++;

            if (numero > 0) {
                System.out.println("O número é positivo.");
            } else {
                System.out.println("O número é negativo.");
            }

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }
        System.out.println("Total de números digitados: " + totalNumeros);
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }

}
