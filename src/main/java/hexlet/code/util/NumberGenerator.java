package hexlet.code.util;

import java.util.Random;

public class NumberGenerator {

    protected static final int DEFAULT_MAX_NUMBER = 100;
    protected static final int DEFAULT_MIN_NUMBER = 0;

    private static final Random RANDOM = new Random();

    /**
     * Generates a number with bounds [{@link #DEFAULT_MIN_NUMBER}, {@link #DEFAULT_MAX_NUMBER}].
     *
     * @return generated number
     */
    public static int generateDefaultNumber() {
        return generateWithBounds(DEFAULT_MIN_NUMBER, DEFAULT_MAX_NUMBER);
    }

    /**
     * Generates a number with bounds [0, {@code bound}].
     *
     * @param bound max value of number to generate
     * @return generated number
     */
    public static int generateWithMaxBound(int bound) {
        return generateWithBounds(DEFAULT_MIN_NUMBER, bound);
    }

    /**
     * Generates a number with bounds [{@code min}, {@code max}].
     *
     * @param min min value of number to generate
     * @param max max value of number to generate
     * @return generated number with specified bounds
     */
    public static int generateWithBounds(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }
}
