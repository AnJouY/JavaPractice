public class ifElse {
    public static void main(String[] args){
        double num1 = 20;
        double num2 = 80;
        double result = (num1 + num2) * 25;
        System.out.println(result);

        double remainder = result % 40;
        if (remainder <= 20) {
            System.out.println("Total was over the limit.");
        }
    }
}
