import java.util.Scanner;
public class esercizio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("inserisci base Rettangolo:");
        int base= Integer.parseInt(sc.nextLine());
        System.out.println("inserisci altezza Rettangolo:");
        int altezza= Integer.parseInt(sc.nextLine());
        int resultRettangolo=perimentroRettangolo(base, altezza);
        System.out.println("il perimetro del rettangolo è: "+resultRettangolo);

        System.out.println("Inserisci un numero, se è pari ritornerà 0 se no ritornerà 1");
        int num= Integer.parseInt(sc.nextLine());
        System.out.println(pariDispari(num));

        System.out.println("Calcolare l'area del triangolo");
        System.out.println("inserisci primo lato:");
        int lato1= Integer.parseInt(sc.nextLine());

        System.out.println("Inserisci secondo lato:");
        int lato2= Integer.parseInt(sc.nextLine());

        System.out.println("Inserisci terzo lato:");
        int lato3= Integer.parseInt(sc.nextLine());

        System.out.println("L'area del triangolo è: " + areaTriangolo(lato1, lato2, lato3));



    }

    public static int perimentroRettangolo(int base, int altezza){
        return (base+altezza)*2;
    }

    public static int pariDispari(int num){
        return num%2;
    }

    public static double areaTriangolo(int a, int b, int c){
        int semiperimetro= (a+b+c)/2;
        double area=java.lang.Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
        return area;
    }
}
