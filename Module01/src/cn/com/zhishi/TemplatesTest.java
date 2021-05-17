package cn.com.zhishi;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author hanhuijie
 * @create 2021/5/16-05-16 06:48
 */
public class TemplatesTest {

    // psvm main方法声明
    public static void main(String[] args) {

        //sout
        System.out.println();
//sout
//      soutp
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("args = " + Arrays.deepToString(args));
//        soutm
        System.out.println("TemplatesTest.main");

        int num = 10;
        System.out.println("num = " + num);


        System.out.println(num);
//        fori
        int[] ints = {1, 2, 3};
        for (int i = 0; i < ints.length; i++) {

        }
//        iter
        for (int i : ints) {

        }

//        itar
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];

        }

        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");

//        list.for
        for (String s : list) {

        }
//      list.fori
        for (int i = 0; i < list.size(); i++) {

        }
//        list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }



    }

}
