import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String input;
        while (true)
        {

            System.out.print("Parantez içeren metin girin.. ");
            input = getString();

            if (input.equals(""))
            {
                System.out.println("Uygulama sonlandırıldı.");
                break;
            }

            BracketChecker theChecker = new BracketChecker(input);


            boolean control = theChecker.check();

            if (control)
            {
                System.out.println("Expression is balanced.");
            } else
            {
                System.out.println("Expression is not balanced.");
            }
        }
    }

    public static String getString() {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        return s;
    }
}