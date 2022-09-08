import java.util.ArrayList;

public class multipleChoice extends Question {
    private int answer;
    private ArrayList<String> answerOptions;
    public multipleChoice(String question, int answer, ArrayList answerOptions) {
        super(question);
        this.answer = answer;
        this.answerOptions = answerOptions;
    }


}
