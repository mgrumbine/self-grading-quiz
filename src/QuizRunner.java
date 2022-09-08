import java.util.ArrayList;

public class QuizRunner {
    public void main(String[] args) {
        ArrayList questionArrayList = new ArrayList<>();
        Quiz quiz = new Quiz(questionArrayList);
        quiz.addQuestion("How do you say 'bless you' in Portuguese?");
    }
}
