public class Matematika {
    public static int Faktorijel(int n) {
        int rezultat = 1;
        for (int i = 1; i <= n; i++)
            rezultat *= i;
        return rezultat;
    }

    private static double Stepenuj(double x, int exp) {
        double rezultat = x;
        for (int i = 1; i < exp; i++)
            rezultat *= x;
        return rezultat;
    }

    public static double Sinus(double x) {
        x *= Math.PI / 180;
        double rezultat = 0;
        int predznak = -1;

        for (int i = 1; i <= 20; i += 2) {
            predznak *= -1;
            rezultat += predznak * Stepenuj(x, i) / Faktorijel(i);
        }
        return rezultat;
    }
}
