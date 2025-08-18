import static java.lang.Math.*;

public class Computer {
    public static final int COLUMN = 12;
    public static final int ROW = 15;

    public static void main(String[] args) {
        int n[] = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
        double x[] = new double[ROW];
        double w[][] = new double[COLUMN][ROW];

        for (int i = 0; i < ROW; i++) {
            x[i] = (random() * 8 - 6);
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (n[i] == 19) {
                    w[i][j] = degreeOfArctangent(x[j]);
                } else if (n[i] == 5 || n[i] == 9 || n[i] == 11 || n[i] == 13 || n[i] == 17 || n[i] == 23 ) {
                    w[i][j] = cosOfCos(x[j]);
                } else {
                    w[i][j] = degreeOfExpression(x[j]);
                }
            }
        }
        printMatrix(w);
    }

    public static double degreeOfArctangent(double x) {
        return pow(atan(0.2 * (x + 1) / 14.0), 0.25 / asin(pow(E, - abs(x))) - 1);
    }

    public static double cosOfCos(double x) {
        return cos(cos(cbrt(x)));
    }

    public static double degreeOfExpression(double x) {
        return pow(0.25 - pow(cbrt(pow(x, x - 3.0 / 4.0)), 3 + cos(cbrt(x))), asin(pow(E, cbrt(pow( - (4 / abs(x)), x)))));
    }

    public static void printMatrix(double[][] twoDimentionalMassive) {
        for (int i = 0; i < twoDimentionalMassive.length; ++i) {
            for (int j = 0; j < twoDimentionalMassive[0].length; ++j) {
                System.out.printf("%-10.4f", twoDimentionalMassive[i][j]);
            }
            System.out.println();
        }
    }
}
