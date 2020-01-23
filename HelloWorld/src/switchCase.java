public class switchCase {
    public static void main(String[] args) {
        char fruit = 'A';
        switch (fruit) {
            case 'A':
            case 'a':
                System.out.println("Apple");
                break;
            case 'B':
            case 'b':
                System.out.println("Banana");
                break;
            case 'C':
            case 'c':
                System.out.println("Cherries");
                break;
            case 'D':
            case 'd':
                System.out.println("Dragon Fruit");
                break;
            case 'E':
            case 'e':
                System.out.println("ElderBerry");
                break;
            default:
                System.out.println("Not in fruit basket");
        }
    }
}
