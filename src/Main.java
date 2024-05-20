public class Main {
    public static void main(String[] args) {
        int result=moltiplicatore(2,4);
        System.out.println(result);

        concat("ciao", 23);

    }

    public static int moltiplicatore(int num1, int num2){
        return num1*num2;
    }
    public static void concat(String a, int b){
       System.out.println(a + b);

    }
    public static String[] arrayDuplicato(String[] firstArray, String itemArray){
        String[] newArray= new String[6];
        newArray[0]=firstArray[0];
        newArray[1]=firstArray[1];
        newArray[2]=itemArray;
        newArray[3]=firstArray[2];
        newArray[4]=firstArray[3];
        newArray[5]=firstArray[4];
        return newArray;
    }
}