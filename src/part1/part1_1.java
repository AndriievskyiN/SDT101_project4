package part1;

public class part1_1 {
    public static void main(String[] args) {
        int sumOfFive = sum(5); // 15
        System.out.println(sumOfFive);
    }

    public static int sum(int n){
        if (n == 1) {
            return 1;
        }

        else {
            return n + sum(n-1);
        }
    }
}