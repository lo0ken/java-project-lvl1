package hexlet.code;

public final class Pair {
    private final String question;
    private final String answer;

    public Pair(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
