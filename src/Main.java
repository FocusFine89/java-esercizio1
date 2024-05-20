public class Main {
    public static void main(String[] args) {
        int result=moltiplicatore(2,4);
        System.out.println(result);

        concat("ciao", 23);
        String[] stringArray= {"a","b","c","d","e"};
        String[] stringArray2 = new String[6];
        stringArray2[0]="a";
        stringArray2[1]="b";
        stringArray2[2]="g";
        stringArray2[3]="c";
        stringArray2[4]="d";
        stringArray2[5]="e";
        for (int i = 0; i < stringArray.length; i++) {
           System.out.println("Elemento "+i + ":"+ stringArray[i]);
        };

        for (int i = 0; i < stringArray2.length; i++) {
            System.out.println("Elemento "+i + ":"+ stringArray[i]);
        };
    }

    public static int moltiplicatore(int num1, int num2){
        return num1*num2;
    }
    public static void concat(String a, int b){
       System.out.println(a + b);
    }
}