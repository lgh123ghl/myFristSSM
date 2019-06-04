package com.common.util;


/**  其他工具类
 * @author : LGH
 * @Date: 2019/5/29 16:55
 * @Description:
 */
public class OtherUtil {
        final static int[] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
                99999999, 999999999, Integer.MAX_VALUE };

    /**
     * 判断一个整形数是几位数-方法1
     * @param num
     * @return
     */
    static int sizeOfInt(int num) {
            for (int i = 0;; i++){
                if (num <= sizeTable[i])
                {
                    return i + 1;
                }
            }
        }

    /**
     * 判断一个整形数是几位数-方法2
     * @param num
     * @return
     */
    static int sizeOfInt1(int num){
            int size = 1;
            while (num/10!=0){
                num /=10;
                size ++;
            }
            return size;
        }

    /**
     * 判断是否包含某字符串
     * @param str
     * @return
     */
    static  boolean isNumeric(String str,String choose){
        boolean isdecimal = false;
        if (str.contains(choose)) {
            isdecimal=true;
        }
        return isdecimal;
    }

    /**
     * 测试mian函数
     * @param args
     */
    public static void main(String[] args) {
/*            System.out.println(sizeOfInt1(1234));
            System.out.println(sizeOfInt1(123));
            System.out.println(sizeOfInt1(12345));
            System.out.println(sizeOfInt1(12));
            System.out.println(sizeOfInt1(1));

        System.out.println(isNumeric("liguanghui","hi"));*/

    }
}
