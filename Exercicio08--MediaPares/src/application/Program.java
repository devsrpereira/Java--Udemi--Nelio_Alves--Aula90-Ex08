package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nQuantos elementos vai ter no vetor? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        Double pares = 0.0;
        int parescount = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextInt();
            pares += vect[i]%2 == 0 ? vect[i] : 0;
            parescount += vect[i]%2 == 0 ?  1 : 0;
        }

        if(pares !=0){
            System.out.printf("MEDIA DOS PARES = %.1f", (pares/ parescount));
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }


        System.out.println();
        sc.close();
    }
}
