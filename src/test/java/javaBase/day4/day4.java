package javaBase.day4;

import java.util.Arrays;

public class day4 {
    String str="Aa";
    public static void main(String[] args) {
        String str ="Aa";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());

        day041 day041=new day041("张三",28);
        day041.setName("李四");
        day041.name();
        day041.age();

        day42 day42=new day42();
        day42.name();
        day42.age();
        day42.Deno(8,2);
        day42.Deno1(8,2,2);
        day42.Deno1(8,2);

        int[] aa={1,2,3,4,5};
        int[] bb=new int[5];

        System.out.println(Arrays.toString(aa));

        for (int i :aa) {
            System.out.println(i);
            char g6=g3(aa[i]);

            }
        }
    public static char  g3(int h){
        char ff = (char)h ;
        return ff ;
    }

    }

