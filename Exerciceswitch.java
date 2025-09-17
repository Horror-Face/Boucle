import java.util.Scanner;

public class Exerciceswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entre 1 et 7 :");
        int jour = sc.nextInt();
        switch (jour) {
            case 1:
                System.out.println("lundi");
                break;
            case 2:
                System.out.println("mardi");
                break;

            case 3:
                System.out.println("mercredi");
                break;

            case 4:
                System.out.println("jeudi");
                break;

            case 5:
                System.out.println("Vendredi");
                break;

            case 6:
            case 7:
                System.out.println("mardi");
                break;
        }
        if (jour > 7) {
            System.out.println("tu est aller trop loin");

        }
        sc.close();

    }
}