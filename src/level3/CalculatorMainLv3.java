package level3;

import level3.error.BadInputException;
import level3.operation.AddOperation;
import level3.operation.DivideOperation;
import level3.operation.MultiplyOperation;
import level3.operation.SubtractOperation;

import java.util.Scanner;

public class CalculatorMainLv3 {

    public static void main(String[] args) {

        System.out.println("==계산기 프로그램 ON==");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        CalculatorLv3 calculator = new CalculatorLv3();

        while (true) {
            try {
                System.out.print("첫번재 수를 입력하세요: ");
                String firstNum = scanner.nextLine();

                System.out.print("두번째 수를 입력하세요: ");
                String secondNum = scanner.nextLine();

                System.out.print("연산자를 입력하세요 ('+', '-', '*', '/'): ");
                String operator = scanner.nextLine();

                System.out.println("결과: " + calculator.calculate(firstNum, secondNum, operator));
            } catch (BadInputException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("지금까지의 검색 기록: " + calculator.showResult());

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
