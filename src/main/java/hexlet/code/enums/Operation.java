package hexlet.code.enums;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*");

    private final String stringValue;

    Operation(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public static Operation fromString(String c) {
        for (Operation operation : Operation.values()) {
            if (operation.getStringValue().equals(c)) {
                return operation;
            }
        }
        return null;
    }
}
