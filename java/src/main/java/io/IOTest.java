/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: IOTest
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/6	       Tyson	               初次做成
 * =============================================================
 */
package io;

import java.io.*;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/3/6上午11:57
 */
public class IOTest {
    public static void main(String[] args) throws IOException {

        String name = "abc";
        byte[] bytes = name.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);

        for (int i = 0; i < 2; i++) {
            int c;
            while (-1 != (c = in.read())) {
                if (0 == i) {
                    System.out.println(c);
                } else {
                    System.out.println(Character.toUpperCase((char) c));
                }

            }
            System.out.println();
            in.reset();
        }
        //IO分为字节流和字符流
        //字节流分为节点流和过滤流
        //过滤流可以包装节点流。可以重复包装 ，节点流包装最底层的inputStream

        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")))) {
            byte b = 3;
            int i = 12;
            char ch = 'a';
            float f = 3.3f;
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeChar(ch);
            dataOutputStream.writeFloat(f);

            dataOutputStream.close();

        }
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")))) {
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readFloat());
        }


    }
}
