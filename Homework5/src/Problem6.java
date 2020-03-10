import java.util.Scanner;
class Problem6
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int [] num = new int [n];
        for( int i =0; i<n; i++){ System.out.print( " Input the num "+i+ ": " );
            num [i]=scanner.nextInt();}
        int max= num[0];
        int min= num[0];
        for ( int i =1; i < n ; i++)
        {if (num[i] > max) { max = num[i];}
        else if( num[i]< min){ min = num[i];}}
        System.out.println( "The max is: "+max);
        System.out.println( " The min is: "+min );
    }
}