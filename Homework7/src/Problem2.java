public class Problem2 {
    public static void main(String [] args) {
        int a= 50;
        int b = 80;
        System.out.println(checkIncrements(a,b)+"%");}
    static int  checkIncrements (int a, int b){
        int dif =b-a;
        dif= (dif*100)/a;
        return dif;}

}

