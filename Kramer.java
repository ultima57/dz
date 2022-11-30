package dz2;

public class Kramer {
    double mainOpred;
    double secondOpred;
    double firstOpred;
    double a11 = 5;
    double a12 = 0.5;
    double a21 = 1;
    double a22 = 1;
    double b1;
    double b2;
    int amountOfBul;
    int realCows;
    int realtelyat;
    int realBulls;
    double epsilon = 0.0001;

    public double opredelitel(double b11, double b12, double b21, double b22) {
        return b11 * b22 - b12 * b21;
    }

    public void calculation(int amountOfBul) {
        this.b1 = 100 - 10 * amountOfBul;
        this.b2 = 100 - amountOfBul;
        this.mainOpred = opredelitel(5, 0.5, 1, 1);
        this.firstOpred = opredelitel(b1, a12, b2, a22);
        this.secondOpred = opredelitel(a11, b1, a21, b2);
        double cows = firstOpred / mainOpred;
        double telyat = secondOpred / mainOpred;
        System.out.println("bulls: " + amountOfBul);
        System.out.println("cows: " + cows);
        System.out.println("telyat: " + telyat);
        if (Math.abs((int) cows - cows) < epsilon) {
            realCows = (int) cows;
            realBulls = amountOfBul;

            realtelyat = (int) telyat;
        }

    }

    public void printcalc() {
        System.out.println("bulls: " + realBulls);
        System.out.println("cows: " + realCows);
        System.out.println("telyat: " + realtelyat);
    }
}
