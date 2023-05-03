package part1;

public class part1_2 {
    public static void main(String args[]){
        double twoToTheThirdPower = power(2, 3); // 8
        System.out.println(twoToTheThirdPower);
    }

    public static double power(double x, int n){
        if (n == 0){
            return 1;
        }

        else {
            return x * power(x, n-1);
        }
    }
}
