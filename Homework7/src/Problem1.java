public class Problem1 {
    public static void main(String [] args) {
        int n = 5897;
        System.out.println(getSum(n));}

    static int  getSum( int n){
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n= n/10;}
        return sum;
    }
}