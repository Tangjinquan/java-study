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

import java.lang.reflect.Method;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/2/9下午5:42
 * @version V1.0
 */
public class Dump {


    public static void main(String[] args) throws Exception {

        Class<?> aClass = HashCodeTset.class;
        Object o = aClass.newInstance();
        //想要调用该类的方法 先得到方法类
        Method testMethod = aClass.getMethod("test", new Class[]{boolean.class});

        //调用方法
        Object result = testMethod.invoke(o, new Object[]{true});
        System.out.println(result);

    }
}
