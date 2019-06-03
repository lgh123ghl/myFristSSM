package com.common.util;

import com.common.bean.Sign;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * @Auther: LGH
 * @Date: 2019/6/3 16:36
 * @Description:
 */
public class CloneUtil {
        private CloneUtil() {
            throw new AssertionError();
        }
        public static <T> T clone(T obj) throws Exception {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bout);
            oos.writeObject(obj);

            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bin);
            return (T) ois.readObject();

            // 说明：调用ByteArrayInputStream或ByteArrayOutputStream对象的close方法没有任何意义
            // 这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，这一点不同于对外部资源（如文件流）的释放
        }

    public static void main(String[] args)throws Exception{
        Sign sign = new Sign();
        sign.setAddress("杭州江干区");
        sign.setId(1L);
        Sign sign1 = clone(sign);
        sign1.setAddress("云南昆明");
        System.out.println(sign1.toString());
    }

}
