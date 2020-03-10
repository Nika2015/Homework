import java.util.Scanner;
class Problem9
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array 1 : ");
        int n = scanner.nextInt();
        int [] num = new int [n];
        for( int i =0; i<n; i++){ System.out.print( " Input the num "+i+ ": " );
            num [i]=scanner.nextInt();}
        System.out.print("Input size of array 2 : ");
        int m = scanner.nextInt();
        int [] num1 = new int [m];
        for( int j =0; j<m; j++){ System.out.print( " Input the num1 "+j+ ": " );
            num1 [j]=scanner.nextInt();}
        int sum=0;
        for ( int i =0; i < n ; i++) {
            for (int j =1; j <= m ; j++) {  if( num[i]==num1[j-1])
            { break;}
            else if( j==m)
            { sum= sum+1; System.out.println(num[i]);}}}

        if( sum==0){
            System.out.println(" Doesn't exist");}



    }
}