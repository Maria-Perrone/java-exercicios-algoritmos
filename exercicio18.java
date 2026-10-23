package excercicios;

import java.util.Scanner;

/**
 *
 * @author Maria Perrone
 */
public class exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade das maças: ");
        int unidades = sc.nextInt();
        double valorUnit = 0;

        if (unidades < 12) {
            valorUnit = 0.30;
        } else {
            valorUnit = 0.25;
        }
        System.out.println("O valor é de : " + (unidades * valorUnit));
    }
}
