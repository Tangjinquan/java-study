/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: InputStreamTest1
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/5	       Tyson	               初次做成
 * =============================================================
 */
package io;

import java.io.*;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/3/5下午6:35
 */
public class InputStreamTest1 {

    public static void main(String[] args) throws IOException {

//        try (InputStream fileInputStream = new FileInputStream("c:/hello.txt")) {
        byte[] bytes = new byte[200];
        String name = "adc";
        byte[] bytes1 = name.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes1);
        int length = 0;
        int read1 = byteArrayInputStream.read();
        int C;
        while (-1 != (C = read1)) {
            System.out.println((char)C);
        }
        System.out.println("d");
        //FilterInputStream以及子类 过滤流
        //FileInputStream等其他的流是节点流
        //OutputStream类似InputStream

//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);  //缓冲流 ，装饰了最基本的输入流
//        }
    }
}
