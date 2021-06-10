package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.enums.Operation;

import static java.util.Objects.requireNonNull;

public final class Calculator extends Engine {

    @Override
    protected String getStartMessage() {
        return "What is the result of the expression?";
    }

    @Override
    protected String generateQuestion() {
        return generateNumber() + DELIMITER + generateOperation() + DELIMITER + generateNumber();
    }

    private int generateNumber() {
        return RANDOM.nextInt(MAX_NUMBER_BOUND);
    }

    private String generateOperation() {
        return Operation.values()[
                RANDOM.nextInt(Operation.values().length)
                ].getStringValue();
    }

    @Override
    protected String getCorrectAnswer(String question) {
        String[] questionParts = question.split(DELIMITER);

        int firstNumber = Integer.parseInt(questionParts[0]);
        int secondNumber = Integer.parseInt(questionParts[2]);

        Operation operation = Operation.fromString(questionParts[1]);
        switch (requireNonNull(operation)) {
            case PLUS:
                return String.valueOf(firstNumber + secondNumber);
            case MINUS:
                return String.valueOf(firstNumber - secondNumber);
            case MULTIPLY:
                return String.valueOf(firstNumber * secondNumber);
            default:
                throw new RuntimeException("Should not have gotten here");
        }
    }
}
