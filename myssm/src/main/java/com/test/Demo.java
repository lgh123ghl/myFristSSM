package com.test;

import com.common.bean.Sign;
import com.google.common.math.DoubleMath;
import org.apache.commons.collections.list.AbstractLinkedList;

import java.util.*;

/**
 * @Auther: LGH
 * @Date: 2019/5/20 14:19
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
/*        Sign sign = new Sign();
        if(sign.getAddress()!=null&&sign.getAddress().equals("a")){
        }else {
            System.out.println("短路运算成功");
        }*/
/*     int[] ints = new int[25];
        Random random = new Random();
        abble:
        for (int i = 0; i <25 ; i++) {
            System.out.println(i+"---------");
            ints[i] = random.nextInt();
            if (i >= 1) {
                Boolean b = ints[i] < ints[i-1]?true:false;
                System.out.println(ints[i]+"<"+ints[i-1]+"?--"+b);
            }
            if (i == 5) {
                System.out.println();
                continue abble;
            }
        }*/
/*        Scanner scanner = new Scanner(System.in);
        String choose = scanner.next();
        switch (choose){
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "c":
                System.out.println("c");
                default:
                    System.out.println("d");
        }*/
        //吸血鬼数字
/*        Set<Integer> set = new TreeSet<>();
        for (int i = 1000; i < 10000; i++) {
            //个位
            int a = i%1000%100%10;
            //十位
            int b = i%1000%100/10;
            //百位
            int c = i%1000/100;
            //千位
            int d = i/1000;

            //个位十位为0的情况直接结束这一层的循环
            if (a==0&&b==0) {
                continue;
            }
            int[] num = {a,b,c,d};
            int[] ints = new int[12];
            int index = 0;
            for (int j = 0; j <4 ; j++) {
                for (int k = 0; k < 4 ; k++) {
                    if (num[j] != num[k]) {
                        ints[index++] = num[j]*10+num[k];
                    }
                }
            }
            for (int j = 0; j < ints.length; j++) {
                for (int k = 0; k <ints.length ; k++) {
                    if (j != k) {
                        if (ints[j]*ints[k]==i) {
                            System.out.println(ints[j]+"--"+ints[k]+"--"+i);
                            set.add(i);
                        }
                    }
                }
            }
        }
        System.out.println("-------------寻找结束--------------");
        for (Integer i:set) {
            System.out.println(i);
        }*/
/*        List<String> stringList = new ArrayList<>();
        System.out.println(stringList.size());*/

        String str = "001225544asdfasdf2a5sd7f2a11222558sa5df45a24sdfadsfasdf25757434455";
        str = str.replaceAll("[0-9]"," ");
        System.out.println(str);
        String[] strings = str.split(" ");
        List<String> strings1 = new ArrayList<>();
        for (int i = 0; i <strings.length ; i++) {
            if (strings[i].length()!=0) {
                strings1.add(strings[i]);
            }
        }
        Collections.sort(strings1, new Comparator<String>() {
            @Override
                public int compare(String o1, String o2) {//这里根据list中的字符串元素长度大小进行自然排序
                // TODO Auto-generated method stub
                return Integer.valueOf(o1.length()).compareTo(
                        Integer.valueOf(o2.length()));
                         }
            });

        System.out.println(strings1.get(strings1.size()-1));
       }
    static void println(Character...characters){
        for (Character o:characters) {
            System.out.println(characters);
        }
    }
}
