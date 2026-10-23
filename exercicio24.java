
package excercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Maria perrone
 */
public class exercicio24 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vlPagar = 0;
        boolean resposta = true;
        
        //Instanciar classe Scanner e DecimalFormat
        DecimalFormat df = new DecimalFormat ("R$ #,##0.00");
        Scanner sc = new Scanner (System.in);
        System.out.println("PET SHOP");
        //Menu opções
        System.out.println("""
                           1- Clínica Geral
                           2- Dermatologia
                           3- Odontologia
                           4 -Banho e tosa
                           """);
        //capturar resposta do usuario
        int opcaoAtd = sc.nextInt();
        //switch
        switch (opcaoAtd){
            case 1 -> {
            vlPagar = 100;
        }
            case 2 -> {
            vlPagar = 150;
            }
            case 3 -> {
            vlPagar = 120;
            }
            case 4 -> {
            vlPagar = 120;
            }
            default -> resposta = false;
}
        if (resposta){
            System.out.println("""
                               Possui convenio?
                               1 - SIM
                               2 - NÃO
                               """);
            int convenio = sc.nextInt();
            if(convenio == 1){
                vlPagar *= 0.8;
                System.out.println("Valor a pagar "+df.format (vlPagar));
            }else{
                System.out.println("Valor a pagar "+df.format (vlPagar));;
            }
        }
        else{
            System.out.println("ERRO: opções invalidas");
        }
        
        }
    }

