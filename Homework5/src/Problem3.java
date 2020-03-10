import java.util.Scanner;
class Problem3
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        String [] word = new String [n];

        for( int i =0; i<n; i++){ System.out.print( " Input the word "+i+ ":" );
            word[i]=scanner.next();}
        System.out.print( " Input the name: " );
        String s = scanner.next();
        boolean found=false;
        for ( int i =0; i < n ; i++)
        { if ( s.equals(word[i])){ found= true;
            System.out.println( "word["+i+"]");}
        }
        if (!found){
            System.out.println(" Not found");}

    }
}