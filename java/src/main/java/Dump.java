/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: Dump
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/2/9	       Tyson	               初次做成
 * =============================================================
 */

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/2/9下午5:42
 */
public class Dump {


    public static void main(String[] args) throws Exception {

        Class<?> aClass = HashCodeTset.class;
//        HashCodeTset hashCodeTset = new HashCodeTset();
//        Class<? extends HashCodeTset> aClass1 = hashCodeTset.getClass();
//        Class<?> hashCodeTset = Class.forName("HashCodeTset");
        Object o = aClass.newInstance();
        //带参数的生成对象的方法
//        Object o1 = aClass.getConstructor(new Class[]{boolean.class}).newInstance(new Object[]{true});

        //想要调用该类的方法 先得到方法类
        Method testMethod = aClass.getMethod("test", new Class[]{boolean.class});
//        testMethod.setAccessible(true); 压制java 的访问控制检查 设置为true 就可以
//        aClass.getDeclaredMethod()可以获取私有方法
        //调用方法
        Object result = testMethod.invoke(o, new Object[]{true});
        System.out.println(result);

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Class<?> type = declaredField.getType();
            System.out.println(declaredField.getName());
        }
        Object o1 = Array.newInstance(Integer.TYPE, 5, 10, 15);
        //得到二维数组
        Object o2 = Array.get(o1, 3);

    }
}
