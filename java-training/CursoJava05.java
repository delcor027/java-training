import java.util.Scanner;

public class CursoJava05 {
    public static void main(String[] args) {
        /*
         * int[] num = new int[5];
         * int[] numbers = { 10, 20, 30, 40, 50 };
         * num[0] = 10;
         * num[1] = 5;
         * num[2] = 15;
         * num[3] = 0;
         * num[4] = 8;
         * for (int i = 0; i < numbers.length; i++)
         * System.out.printf("%d - ", numbers[i]);
         */

        final int size = 5;
        char[] template = { 'a', 'a', 'd', 'b', 'c' };
        char[] answers = new char[size];
        int note = 0;
        Scanner keyboard = new Scanner(System.in);

        answers[0] = 'a';
        answers[1] = 'a';
        answers[2] = 'd';
        answers[3] = 'b';
        answers[4] = 'c';

        for (int i = 0; i < size; i++) {
            System.out.printf("Informe a resposta %d: ", i);
            answers[i] = keyboard.nextLine().charAt(0);
        }

        for (int i = 0; i < size; i++) {
            if (answers[i] == template[i]) {
                note++;
            }
        }
        System.out.printf("\nNota do aluno: %d", note);
        keyboard.close();
    }
}
