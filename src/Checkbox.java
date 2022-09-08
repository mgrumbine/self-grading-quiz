import java.util.ArrayList;

public class Checkbox extends Question {
        private ArrayList<String> answer;
        private ArrayList<String> answerOptions;
        public Checkbox(String question, ArrayList answer, ArrayList answerOptions) {
            super(question);
            this.answer = answer;
            this.answerOptions = answerOptions;
        }

    }
