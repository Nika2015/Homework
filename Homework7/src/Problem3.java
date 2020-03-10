public class Problem3 {
    public static void main(String [] args) {
        int a= 5;
        byte [] b = new  byte[] {8, 5, 87, 57, 5, 8, 6, 5};
        System.out.println(checkByteArray( a, b));}
    static int  checkByteArray (int a,  byte[] b){
        int sum = 0;
        for( int i=0; i<b.length; i++){ if (a== b[i]){ sum=sum+1;}}
        if ( sum==0){ sum = sum-1;}
        return sum;}
}


