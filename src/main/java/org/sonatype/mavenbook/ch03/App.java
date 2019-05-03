package org.sonatype.mavenbook.ch03;

/**
 * @description : 
 * @author : Denley
 * @date : 2019年5月2日 12:29
 **/

public class App {

    private int a = 0;
    private Object o = new Object();

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String bbb = "aaa";
        System.out.println(bbb);
        int b = 1;
        int c = test(b);
        int d = 1;
        System.out.println(c + d);
        if(c > 0){
            System.out.println(111);
        }
    }


    // 爱你
    /**
     * @description : 
     * @author : Denley
     * @date : 2019年5月2日 12:29
     * @Param : [b]
     * @return : int
     **/
    private static int test(int b)  {
        int a = 111;
        return b + a;
    }

}
