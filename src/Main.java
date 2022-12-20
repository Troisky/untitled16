import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Answer[] answer1 = new Answer[3];
        answer1[0] = new Answer("Moscow", true);
        answer1[1] = new Answer("Kazan", false);
        answer1[2] = new Answer("Volgograd", false);
        Answer[] answer2 = new Answer[3];
        answer2[0] = new Answer("Apple", false);
        answer2[1] = new Answer("Lemon", true);
        answer2[2] = new Answer("Grape", false);
        Answer[] answer3 = new Answer[3];
        answer3[0] = new Answer("Codeforces", false);
        answer3[1] = new Answer("Informatics", true);
        answer3[2] = new Answer("Github", false);
        Question[] questions = new Question[3];
        questions[0] = new Question("Столица России?", answer1);
        questions[1] = new Question("Самый кислый фрукт", answer2);
        questions[2] = new Question("Название самой популярной платформы для решения задач", answer3);
        Game game1 = new Game("Выбери нужное", questions);
        game1.start();
    }
}

