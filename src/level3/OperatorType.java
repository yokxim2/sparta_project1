package level3;

public enum OperatorType {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private final String symbol;

    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static OperatorType contains(String input) {
        for (OperatorType operator : OperatorType.values()) {
            if (operator.getSymbol().equals(input)) {
                return operator;
            }
        }
        return null;
    }
}
