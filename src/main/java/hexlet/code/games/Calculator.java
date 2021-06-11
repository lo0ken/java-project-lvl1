package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;
import hexlet.code.enums.Operation;

import static java.util.Objects.requireNonNull;

public final class Calculator extends Engine {

    @Override
    protected String getStartMessage() {
        return "What is the result of the expression?";
    }

    @Override
    protected Pair generatePair() {
        int firstNumber = generateDefaultNumber();
        int secondNumber = generateDefaultNumber();
        Operation operation = generateOperation();

        return new Pair(
              firstNumber + DELIMITER + operation + DELIMITER + secondNumber,
                String.valueOf(calculate(firstNumber, secondNumber, operation))
        );
    }

    private Operation generateOperation() {
        return Operation
                .values()[generateWithBound(Operation.values().length)];
    }

    private int calculate(int firstNumber, int secondNumber, Operation operation) {
        switch (requireNonNull(operation)) {
            case PLUS:
                return firstNumber + secondNumber;
            case MINUS:
                return firstNumber - secondNumber;
            case MULTIPLY:
                return firstNumber * secondNumber;
            default:
                throw new RuntimeException("Should not have gotten here");
        }
    }
}
