import java.util.Scanner;

public class CursoJava03 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int sum = 0;
        final int Average = 60;
        String name = "";
        String result = "";

        System.out.println("Digite o nome do aluno: ");
        name = keyboard.nextLine();

        System.out.println("Digite a 1ª nota: ");
        n1 = keyboard.nextInt();

        System.out.println("Digite a 2ª nota: ");
        n2 = keyboard.nextInt();

        System.out.println("Digite a 3ª nota: ");
        n3 = keyboard.nextInt();

        System.out.println("Digite a 4ª nota: ");
        n4 = keyboard.nextInt();

        sum = (n1 + n2 + n3 + n4) / 4;
        if (sum >= Average) {
            result = "aprovado!";
        } else if (sum >= 40) {
            result = "recuperação!";
        } else {
            result = "reprovado!";
        }

        System.out.printf("Aluno %s foi %s, com nota %d", name, result, sum);

        keyboard.close();

    }
}
