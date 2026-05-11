import java.util.Scanner;

class Question {
    String prompt;
    String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        
        String q1 = "Which language is this code written in?\n(a) Python\n(b) Java\n(c) C++";
        String q2 = "what is java?\n(a) POP\n(b)OOP\n(c)GUI";
        String q3 = "Which keyword is used to define a class in java?\n(a)define\n(b)class\n(c)struct";
        String q4 = "Which method is the entry point of java program?\n(a)start()\n(b)run()\n(c)main()";

        
        Question[] questions = {
            new Question(q1, "b"),
            new Question(q2, "b"),
            new Question(q3, "b"),
            new Question(q4, "c")
        };

        takeQuiz(questions);
    }

    public static void takeQuiz(Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            System.out.print("Your answer: ");
            String answer = keyboardInput.nextLine();

            if (answer.equalsIgnoreCase(questions[i].answer)) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong. The correct answer was " + questions[i].answer + ".\n");
            }
        }
        System.out.println("Quiz Finished! You got " + score + "/" + questions.length);
    }
}