/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: ThreadTest
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/9	       Tyson	               初次做成
 * =============================================================
 */
package threadexample;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/3/9下午6:30
 * @version V1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
        //Thread的属性priority设置优先级的
        //Thread的yield()方法，让出对CPU的使用权

    }

}

class Thread1 extends Thread {
    @Override
    public synchronized void run() {
        System.out.println("Thread1");
    }

}

class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread2");
    }
}
