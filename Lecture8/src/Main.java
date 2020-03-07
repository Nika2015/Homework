public class Main {
    public static void main (String[] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.height=10;
        rectangle1.width=5;
        System.out.println(rectangle1.toString());
        rectangle1.increasNtimes(3);

        System.out.println(rectangle1.toString());
    }
    
}
