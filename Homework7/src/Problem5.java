public class Problem5 {
    public static void main(String[] args) {
        int a = 50367;

        System.out.println(checkZeroinNum(a));
    }

    static boolean checkZeroinNum(int a) {
        boolean check ;
        int sum=1;
        while (a> 0 ) {
            sum=sum*(a%10); a= a/10;}
        if ( sum==0){ check=true;} else { check= false;}
        return check;
    }
}