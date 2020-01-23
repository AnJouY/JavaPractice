import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {
        Scanner myObjOne = new Scanner(System.in);
        System.out.println("Start: ");
        int num1 = myObjOne.nextInt();
        System.out.println("End: ");
        int num2 = myObjOne.nextInt();
        int result = 0;
        int i = num1 + 1;
        while (i < num2) {
            result = result + i;
            i++;
        }
        System.out.println(result);
    }
}
