import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public ArrayList<Question> quizQuestions;

    public Quiz(ArrayList<Question> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public void addQuestion(Question question) {
        quizQuestions.add(question);
    }

    public void runQuiz(){
        for (Question i : quizQuestions)
        System.out.println(i.getQuestion());
        Scanner input = new Scanner(System.in);
    }
}