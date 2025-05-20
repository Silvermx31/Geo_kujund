import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        /**
         * Kasutajalt üks külg (murdarv)
         */
        System.out.print("Sisesta alumise aluse pikkus (murdarv): ");
        double alus1 = scanner.nextDouble();

        /**
         * Teine alus (juhuslik murdarv, max 3 kohta peale koma
         */

        double alus2 = Math.round((1 + (10 - 1) * random.nextDouble()) * 1000.0) / 1000.0;

        /**
         * Kõrgus võib samuti olla juhuslik (või kindel väärtus, nt 5.5 )
         */
        double height = Math.round((1 + (5 - 1) * random.nextDouble()) * 1000.0) / 1000.0;

        /**
         *  Loome Trapetsi ja arvutame
         */
        Trapets trapets = new Trapets(alus1, alus2, height);
        double pindala = trapets.arvutaPindala();

        /**
         * Vastus täislauses
         */
        System.out.println();
        System.out.println("Kujundi trapets alustega " + alus1 + " ja " + alus2 +
                " ning kõrgusega " + height +
                " on pindala " + pindala);

    }
}
