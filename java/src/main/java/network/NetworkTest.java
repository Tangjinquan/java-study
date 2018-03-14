/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: NetworkTest
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/13	       Tyson	               初次做成
 * =============================================================
 */
package network;

import java.net.*;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/3/13下午2:54
 * @version V1.0
 */
public class NetworkTest {
    public static void main(String[] args) {

        //应用层 http协议等、传输层 TCP和UDP 协议
        try {
            URI url = new URI("http://baidu.com");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            InetAddress byName = InetAddress.getByName("www.baidu.com");
            System.out.println(byName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        //使用socket 来作为端点


        // ServerSocket TCP通信 连接通信数据传输 用IO来接收数据
        // DatagramSocket UDP 无连接通信数据传输  不用inputStream来接收数据
    }
}
