import java.util.Scanner;

public class PsychopathicTendenciesFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "1. I often find it easy to manipulate people to get what I want.",
            "2. I rarely feel guilty or remorseful after I hurt someone.",
            "3. I get bored easily and seek out excitement or thrills.",
            "4. I tend to be callous or indifferent to other people’s feelings.",
            "5. I’m good at charming others when I want something from them.",
            "6. I often act impulsively without thinking about long-term consequences.",
            "7. I find it easy to lie or be deceitful when it benefits me.",
            "8. I don’t take responsibility for my mistakes — I blame others or make excuses.",
            "9. I have a history of short-term relationships or unstable commitments.",
            "10. I feel little empathy when others are suffering.",
            "11. I often ignore rules or social norms if they get in my way.",
            "12. I enjoy taking risks that other people consider dangerous."
        };

        System.out.println("==============================================");
        System.out.println("   PSYCHOPATHIC TENDENCIES SELF-ASSESSMENT");
        System.out.println("==============================================");
        System.out.println("For each statement, rate how much it applies to you:");
        System.out.println("1 = Strongly Disagree | 2 = Disagree | 3 = Neutral | 4 = Agree | 5 = Strongly Agree\n");

        int totalScore = 0;

       
        for (String question : questions) {
            int rating = 0;
            do {
                System.out.println(question);
                System.out.print("Your rating (1–5): ");
                while (!sc.hasNextInt()) {
                    System.out.print("Please enter a valid number (1–5): ");
                    sc.next(); // discard invalid input
                }
                rating = sc.nextInt();
                if (rating < 1 || rating > 5)
                    System.out.println("Please enter a number between 1 and 5.");
            } while (rating < 1 || rating > 5);

            totalScore += rating;
            System.out.println();
        }

        
        System.out.println("==============================================");
        System.out.println("Your Total Score: " + totalScore + " (out of 60)");

        if (totalScore <= 23) {
            System.out.println("Result: LOW Psychopathic Traits");
            System.out.println("→ You show high empathy and social responsibility.");
        } else if (totalScore <= 36) {
            System.out.println("Result: MODERATE Psychopathic Traits");
            System.out.println("→ You may show some impulsivity or charm-based behavior but are mostly empathetic.");
        } else {
            System.out.println("Result: HIGH Psychopathic Traits");
            System.out.println("⚠️ You reported many traits associated with psychopathy-like tendencies.");
            System.out.println("This does NOT mean a diagnosis — consider speaking with a mental health professional.");
        }

        System.out.println("==============================================");
        System.out.println("Note: This is NOT a clinical tool. For mental health concerns, consult a licensed psychologist.");
        System.out.println("==============================================");

        sc.close();
    }
}
