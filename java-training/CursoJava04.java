//import java.util.Scanner;

public class CursoJava04 {

    public class Main {
        public static void main(String[] args) {

            /*
             * // FOR
             * for (int cont = 1; cont < 6; cont++) {
             * System.out.println(cont + " - Delcor Cursos");
             * }
             */

            /*
             * // WHILE
             * Scanner keyboard = new Scanner(System.in);
             * int max = keyboard.nextInt();
             * int cont = 0;
             * while (cont < max) {
             * System.out.println(cont + " - Delcor Cursos");
             * cont++;
             * keyboard.close();
             * }
             */

            int cont = 0;

            do {
                System.out.println(cont + " - Delcor Cursos");
                cont++;
            } while (cont < 0);

            System.out.println("Fim do programa!");
        }

    }
}
