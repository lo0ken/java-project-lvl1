package hexlet.code.enums;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*");

    private final String stringValue;

    Operation(String value) {
        this.stringValue = value;
    }

    public String getStringValue() {
        return stringValue;
    }
}
