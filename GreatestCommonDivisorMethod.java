package bisdi.pertemuan04;


import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Berikan bilangan bulat ke-1 ");
        int n1 = input.nextInt();
        System.out.print("Berikan bilangan bulat ke-2 ");
        int n2 = input.nextInt();

        System.out.println("Faktor Persekutuan Terbesar dari "+n1+" dan "+n2+" adalah "+gcd(n2,n1));
    }

    public static int gcd(int n1, int n2){
        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2){
            if (n1%k==0 && n2%k==0)
                gcd = k;
            k++;
        }
        return gcd;
    }
}
