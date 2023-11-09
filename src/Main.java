// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int adder(int n) {
        if (n<0) return -1; //precondition
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;

        }
        return sum;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!%n");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            int answer = adder(100);
            if (answer < 0) System.out.println("in");
            System.out.println("answer is = " + answer);
        }
    }


}