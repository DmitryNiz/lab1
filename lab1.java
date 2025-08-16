import static java.lang.Math.*;
public class lab1 {
    public static void main(String[] args) {
        int n[] = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
        double x[] = new double[15];
        for(int i = 0; i<15; i++){
            x[i] = (random()*8-6);
        }
        double w[][] = new double[12][15];
        for(int i = 0; i<n.length; i++){
            for(int j = 0; j<x.length; j++){
                if(n[i]==19){
                    w[i][j] = formula1(x[j]);
                }else if(n[i]==5 || n[i]==9 || n[i]==11 || n[i]==13 || n[i]==17 || n[i]==23 ){
                    w[i][j] = formula2(x[j]);
                }else{
                    w[i][j] = formula3(x[j]);
                }
            }
        }
        out(w);
    }

    public static double formula1(double x){
        return pow(atan(0.2*(x+1)/14.0), 0.25/asin(pow(E,-abs(x)))-1);
    }

    public static double formula2(double x){
        return cos(cos(cbrt(x)));
    }

    public static double formula3(double x){
        return pow(0.25 - pow(cbrt(pow(x, x-3.0/4.0)), 3+cos(cbrt(x))), asin(pow(E, cbrt(pow(-(4/abs(x)),x)))));
    }

    public static void out(double[][] w) {
        for(int i = 0; i < 12; ++i) {
            for(int j = 0; j < 15; ++j) {
                System.out.printf("%-10.4f", w[i][j]);
            }

            System.out.println();
        }

    }
}
