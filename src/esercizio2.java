import java.util.Scanner;
public class esercizio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la prima parola da concatenare");
        String a= sc.nextLine();
        System.out.println("Inserisci la prima seconda da concatenare");
        String b= sc.nextLine();

        System.out.println("Inserisci la prima terza da concatenare");
        String c= sc.nextLine();

        ordine(a,b,c);

    }
    public static void ordine(String a, String b, String c){
        System.out.println(a+b+c);
        System.out.println(c+b+a);

    }
}
