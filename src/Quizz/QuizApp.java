package Quizz;

import java.util.*;

public class QuizApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Question> quiz = new ArrayList<>();

        // Adding Questions
        quiz.add(new Question(
                "1. What are Java loops?",
                new String[]{"A. Decision makers", "B. Repeating statements", "C. Exception handlers", "D. Packages"},
                1));

        quiz.add(new Question(
                "2. What is enhanced for-loop?",
                new String[]{"A. While loop", "B. Loop over collections", "C. Loop over integers", "D. None"},
                1));

        quiz.add(new Question(
                "3. How do you handle multiple user inputs?",
                new String[]{"A. Using arrays", "B. Using Scanner", "C. Using loops", "D. All of the above"},
                3));

        quiz.add(new Question(
                "4. How is switch-case different from if-else?",
                new String[]{"A. Faster & cleaner", "B. Slower", "C. Used for loops", "D. Same"},
                0));

        quiz.add(new Question(
                "5. What are collections in Java?",
                new String[]{"A. Framework", "B. Package", "C. Class", "D. JDK"},
                0));

        quiz.add(new Question(
                "6. What is ArrayList?",
                new String[]{"A. Fixed-size list", "B. Dynamic list", "C. Map", "D. Set"},
                1));

        quiz.add(new Question(
                "7. How to iterate using iterators?",
                new String[]{"A. next()", "B. hasNext()", "C. Using Iterator object", "D. All"},
                3));

        quiz.add(new Question(
                "8. What is a Map?",
                new String[]{"A. Key-Value pairs", "B. List", "C. Array", "D. Loop"},
                0));

        quiz.add(new Question(
                "9. How to sort a list?",
                new String[]{"A. Collections.sort()", "B. Map", "C. Set", "D. Loop"},
                0));

        quiz.add(new Question(
                "10. How to shuffle elements?",
                new String[]{"A. List.shuffle()", "B. Collections.shuffle()", "C. Random.shuffle()", "D. Map.shuffle()"},
                1));

        int score = 0;

        System.out.println("==== Welcome to Java Quiz App ====\n");

        // Asking all questions
        for (Question q : quiz) {
            System.out.println(q.getQuestionText());
            String[] opts = q.getOptions();

            for (int i = 0; i < opts.length; i++) {
                System.out.println((i + 1) + ". " + opts[i]);
            }

            System.out.print("Your answer (1-4): ");
            int userAns = sc.nextInt() - 1;

            if (userAns == q.getCorrectAnswer()) {
                System.out.println("✔ Correct!\n");
                score++;
            } else {
                System.out.println("✘ Wrong! Correct answer: "
                        + (q.getCorrectAnswer() + 1) + "\n");
            }
        }

        System.out.println("==== Quiz Finished! ====");
        System.out.println("Your Score: " + score + "/" + quiz.size());

        sc.close();
    }
}
