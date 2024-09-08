package level3;

import level3.operation.*;
import level3.error.WrongNumberInputException;
import level3.error.WrongOperatorInputException;

// 사용자 입력값이 올바른 입력값인지 확인하는 검사(Parser) 객체
public class Parser {
    public double parseNumber(String input) throws WrongNumberInputException {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new WrongNumberInputException();
        }
    }

    public AbstractOperation parseOperator(String operator) throws WrongOperatorInputException {

        OperatorType operatorType = OperatorType.contains(operator);
        if (operatorType == null) {
            throw new WrongOperatorInputException();
        }
        return switch (operatorType) {
            case ADDITION -> new AddOperation();
            case SUBTRACTION -> new SubtractOperation();
            case MULTIPLICATION -> new MultiplyOperation();
            case DIVISION -> new DivideOperation();
            default -> throw new WrongOperatorInputException();
        };
    }
}
