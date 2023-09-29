public class CursoJava02 {
    public static void main(String[] args) {

        int position = 1;

        switch (position) {
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
                System.out.println("Segundo lugar");
                break;
            case 3:
                System.out.println("Terceiro lugar");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Prêmio de participação");
                break;
            default:
                System.out.println("Não ganhou prêmio");
                break;
        }

        /*
         * int note = 65;
         * int fouls = 10;
         * int maxFouls = 5;
         * int average = 60;
         * String result;
         */

        /*
         * result=(note >= average ? "Aprovado" : "Reprovado");
         * System.out.println("Resultado: " + result);
         */

        /*
         * if (note >= average && fouls <= maxFouls) {
         * System.out.println("Aprovado!");
         * } else if (note >= 50) {
         * System.out.println("Recuperação!");
         * } else {
         * System.out.println("Reprovado!");
         * }
         * 
         * System.out.println("Fim do programa!");
         */
    }
}
