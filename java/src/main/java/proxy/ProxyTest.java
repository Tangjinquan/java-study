package proxy; /**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: Proxy
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/2/24	       Tyson	               初次做成
 * =============================================================
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 该代理类的内部属性是object ,实际使用的时候通过构造方法传进来一个对象
 * 该类还实现的invoke方法，该方法中的method.invoke其实就是调用被代理对象的的将要执行的方法，方法参数是sub
 * 表示方法属于sub,通过动态代理类，可以执行真实对象的方法前后加入一些额外的方法
 * @date 2018/2/24下午6:15
 */
public class ProxyTest implements InvocationHandler {

    private Object object;

    public ProxyTest(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //invoke的返回值不用管。当调用接口方法的时候返回什么就是什么返回值。返回值在subject.request();方法调用的时候体现
        System.out.println("before" + method);
        Object invoke = method.invoke(object, args);
        System.out.println("after" + method);
        return invoke;
    }

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        InvocationHandler handler = new ProxyTest(realSubject);
        //当类加载时才会生成一个动态代理类，该类实现的接口由 realSubject.getClass().getInterfaces()决定
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
//        Subject subject = (Subject)Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), new Class[]{Subject.class}, handler);
        subject.request();
        System.out.println(subject);//System.out.println也等于调用方法也会触发invoke 调用的是toString方法
    }
}
