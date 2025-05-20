public class Trapets {
    double alus1;     // Kasutaja sisestatud (double)
    double alus2;     // Juhuslik (double, kuni 3 kohta peale koma)
    double height;

    public Trapets(double alus1, double alus2, double kõrgus) {
        this.alus1 = alus1;
        this.alus2 = alus2;
        this.height = kõrgus;
    }

    public double arvutaPindala() {
        return ((alus1 + alus2) * height) / 2;
    }

    public double arvutaÜmbermõõt() {
        /**
         * Eeldame, et diagonaalsed küljed c ja d on võrdsed ning
         * neid saab arvutada Pythagorase teoreemi põhjal..
         */
        return alus1 + alus2 + 2 * Math.sqrt(Math.pow((alus1 - alus2) / 2, 2) + Math.pow(height, 2));
    }
}
