package level2;

import java.util.Scanner;

public class CalculatorMainLv2 {

    public static void main(String[] args) {

        System.out.println("==계산기 프로그램 ON==");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("양의 정수를 입력하세요: ");
            int firstNum = scanner.nextInt();
            scanner.nextLine();
            if (firstNum < 0) {
                System.out.println("양의 정수를 입력해 주세요.");
                System.out.println("처음으로 돌아갑니다.");
                continue;
            }

            System.out.print("양의 정수를 하나 더 입력하세요: ");
            int secondNum = scanner.nextInt();
            scanner.nextLine();
            if (secondNum < 0) {
                System.out.println("양의 정수를 입력해 주세요.");
                System.out.println("처음으로 돌아갑니다.");
                continue;
            }

            System.out.print("연산자를 입력하세요 ('+', '-', '*', '/'): ");
            String operator = scanner.nextLine();

            // 0으로 나누려는 상황 처리
            if (operator.equals("/") && secondNum == 0) {
                System.out.println("0으로 나눌 수 없습니다!");
                System.out.println("처음으로 돌아갑니다.");
                continue;
            }

            if (operator.equals("+")) {
                System.out.println("결과: " + (firstNum + secondNum));
            } else if (operator.equals("-")) {
                System.out.println("결과: " + (firstNum - secondNum));
            } else if (operator.equals("*")) {
                System.out.println("결과: " + (firstNum * secondNum));
            } else if (operator.equals("/")) {
                System.out.println("결과: " + (double)(firstNum / secondNum));
            }

            System.out.println("계산을 그만하시려면 exit을 입력해주세요.");
            System.out.println("계속하고 싶다면 아무 키나 누르세요: ");
            String exitInput = scanner.nextLine();
            System.out.println();
            if (exitInput.equals("exit")) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }
        }
    }
}
