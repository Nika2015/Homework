import java.util.Scanner;
class Problem8
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = scanner.nextInt();
        int [] num = new int [n];
        for( int i =0; i<n; i++){ System.out.print( " Input the num "+i+ ": " );
            num [i]=scanner.nextInt();}
        for ( int i =0; i < n/2 ; i++)
        { int a= num[i]; num[i]= num[n-1-i]; num[n-1-i]=a; }
    }
}