package lesson_2;

public class PrefixPostfix {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        //Prefix (++)a, b(++) postfix
        //Example 1:
        int c = ++a + b++;
        System.out.printf("Example 1: a = %d; b = %d; c = %d\n", a, b, c);
        /**
        * ++a -> a: 2
        * b: 2
        * 'b~(b++): 3
        * c = 2 + 2 = 4
        * */


        //Example 2:
        int y = 10;
        int z = y-- + ++y + 10;
        System.out.printf("Example 2: y = %d, z = %d \n", y, z);

        /**
         * y = 10, y--  -> 'y: 9
         * y++  -> 'y: 10, y = 10
         * z = 10 + 10 + 10
         * **/

        //Example 3:
        int q = 10;
        int q2 = q-- + ++q + 10 + q--;
        System.out.printf("Example 3: q = %d, q2 = %d \n", q, q2);

        /**
         * q-- = q: 10 , 'q:9
         * ++q = q: 10 , 'q:10
         * q-- = q: 10 , 'q:9
         * q2 = 10 + 10 + 10 + 10
         * q = 9
         * */

        //Example 4:
        int w = 10;
        int w2 = w-- + 10 + w-- + ++w;
        System.out.printf("Example 4: w = %d, w2 = %d ", w, w2);

        /**
         * w-- -> w: 10 , 'w: 9
         * w-- -> w: 9 , 'w: 8
         * ++w -> w: 9 , 'w:9
         * w2 = 10 + 10 + 9 + 9
         * w = 9
         * */


        //Example 5:
        //float rest = 9f / 121f /9f;

        //m = 10, n= 10
        // int rest =  m++/(++n*n--)/--m;
        //rest= ?

        /**
         *
         * () -> prefix -> postfix -> the rest evaluation
         * (++n -> n: 11
         * n*n -> 11*10 = 121
         * n--: n: 10 )
         *
         * m++ / 121 / --m
         * --m -> m: 9
         * rest = 9 / 121 /9
         * m++ -> m:10
         * n: 10, m: 10
         *
         * */
    }

}
