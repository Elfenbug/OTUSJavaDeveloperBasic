import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countTrueAnswers = 0;

        for (int i = 0; i < Questions.getQuestions().length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(trueAnswers[i])) {
                System.out.println("Верно!");
                countTrueAnswers++;
            } else {
                System.out.println("К сожалению, ответ не верен");
            }
        }
        System.out.println("Количество правильных ответов: " + countTrueAnswers);
    }
}