import java.util.Scanner;
class Problem2
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int [] num = new int [n];
        for ( int i =0; i < n; i++)
        { System.out.print("Input element "+i+": ");
            num [i] = scanner.nextInt(); }

    }
}