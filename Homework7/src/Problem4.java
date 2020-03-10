import java.util.Arrays;

public class Problem4 {
    public static void main(String [] args) {
        String[] s = new String[]{"abcd","def","ghi","123"};
        stringReversInArray(s);
        System.out.println(Arrays.toString(s));
    }


    public static void stringReversInArray( String[] s){
        for( int i=0; i< s.length; i++)
        { String name= s[i];
            char[] chars=name.toCharArray();
            for ( int j=0; j < name.length()/2; j++){ char tmp= chars[j]; chars[j]=chars[name.length()-1-j];
                chars[name.length()-1-j]= tmp;}
            s[i]=new String(chars);}

    }
}