import java.util.Scanner;
public class Game {
    private String name;
    private Question[] questions;
    private int counter = 0;
    //...

    public Game(String name, Question[] questions) {
        this.name = name;
        this.questions = questions;
    }
    public void start() {
        System.out.println("Приветствуем тебя в нашей викторине!");
        for(int i = 0; i < this.questions.length; ++i) {
            int b = questions[i].getAnswers().length;
            System.out.println("Вопрос: "+questions[i].getTitle());
            System.out.println("Варианты ответа: ");
            for (int j = 0; j < b; ++j) {
                String s = questions[i].getAnswers()[j].value;
                System.out.println(s);
            }
            Scanner in = new Scanner(System.in);
            String string = in.nextLine();
            boolean flag = false;
            for (int j = 0; j < b; ++j) {
                String s = questions[i].getAnswers()[j].value;
                boolean qwerty = string.equals(s);
                boolean qwerty2 = (questions[i].getAnswers()[j].correct == true);
                if (qwerty && qwerty2) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                counter++;
            }
        }
        if (counter >= 3) {
            System.out.println("Победа!");
        } else {
            System.out.println("Поражение");
        }
    }
}

class Question {
    private String title;
    private Answer[] answers;

    public Answer[] getAnswers() {
        return answers;
    }

    public String getTitle() {
        return title;
    }
    public Question(String title, Answer[] answers) {
        this.title = title;
        this.answers = answers;
    }
}
class Answer {
    String value;
    boolean correct;

    public String getValue() {
        return value;
    }

    public Answer(String value, boolean correct) {
        this.value = value;
        this.correct = correct;
    }
}
