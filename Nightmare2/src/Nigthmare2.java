public class Nigthmare2 {
    public static void main(String[] args) {
        String s = "1359765421";
        char[] chars = s.toCharArray();
        int a = 0;
        char b = chars[0];
        boolean library = false;
        // gtnumenq vor elementic piti shrjvi-tvjal depqum chars[2]
        for (int i = chars.length - 1; i >= 1; i--) {
            if (chars[i - 1] < chars[i]) {
                library = true;
                a = i - 1;
                b = chars[i - 1];
                break;
            }
        }
        // ete ajdpisi element chi gtnum  amboxchy shrjumenq
        if (!library) {
            for (int i = 0; i < chars.length / 2; i++) {
                char t = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = chars[i];
                chars[i] = t;
            }
        }
        // hakarak depqum sksatc shrjman elementic dasavorumenq poqric metc
        else {
            for (int i = a; i < chars.length; i++) {
                for (int j = a; j < chars.length - 1; j++) {
                    if (chars[j] > chars[j + 1]) {
                        char t = chars[j];
                        chars[j] = chars[j + 1];
                        chars[j + 1] = t;
                    }
                }
            }
            // voroshumenq hajord arjeqy chars[2] elementi, fiksumenq u ajd elementy zrojacnumenq
            for (int i = a; i < chars.length; i++) {
                if (b == chars[i] && chars[i] != chars[i + 1]) {
                    b = chars[i + 1];
                    chars[i + 1] = '0';
                    break;
                }
            }
            //mi hatelenq sortavorum sksatc chars[2]-ic poqric metc -zrojacatc elementy kga  chars[2] texy

            for (int i = a; i < chars.length; i++) {
                for (int j = a; j < chars.length - 1; j++) {
                    if (chars[j] > chars[j + 1]) {
                        char t = chars[j];
                        chars[j] = chars[j + 1];
                        chars[j + 1] = t;
                    }
                }
            }
            //veragrumenq chars[2]-in zroi poxaren pahatc arjeqy
            chars[a] = b;
        }
        System.out.println(chars);
    }
}







