import java.util.Scanner;
class Problem10
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Input the num " + i + ": ");
            num[i] = scanner.nextInt();
        }
        System.out.print("Input the k: ");
        int k = scanner.nextInt();
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {  if(num[i]==num[j]){if( j<i){ break;} else {sum=sum+1;}}
            if (j+1==n && sum== k){
                System.out.println(num[i]);}}}}}






