import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner myObjOne = new Scanner(System.in);
        System.out.println("Start: ");
        int num1 = myObjOne.nextInt();
        System.out.println("End: ");
        int num2 = myObjOne.nextInt();
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }
    }
}
