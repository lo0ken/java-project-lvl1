package hexlet.code;

public final class Pair {
    private final String question;
    private final String answer;

    public Pair(String questionStr, String answerStr) {
        this.question = questionStr;
        this.answer = answerStr;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
