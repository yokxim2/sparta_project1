import java.util.Scanner;

public class CalculatorMainLv1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("양의 정수를 입력하세요: ");
            int firstNum = scanner.nextInt();
            scanner.nextLine();

            System.out.print("양의 정수를 하나 더 입력하세요: ");
            int secondNum = scanner.nextInt();
            scanner.nextLine();

            System.out.print("연산자를 입력하세요 ('+', '-', '*', '/'): ");
            String operator = scanner.nextLine();

            if (operator.equals("+")) {
                System.out.println("결과: " + (firstNum + secondNum));
            } else if (operator.equals("-")) {
                System.out.println("결과: " + (firstNum - secondNum));
            } else if (operator.equals("*")) {
                System.out.println("결과: " + (firstNum * secondNum));
            } else if (operator.equals("/")) {
                System.out.println("결과: " + (double)(firstNum / secondNum));
            }
        }
    }
}
