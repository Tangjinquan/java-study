/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: Generics
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/2/9	       Tyson	               初次做成
 * =============================================================
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 泛型学习
 * @date 2018/2/9下午3:03
 */
public class Generics<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Generics<Boolean> booleanGenerics = new Generics<>();
        Generics<Integer> integerGenerics = new Generics<>();
        booleanGenerics.setT(new Boolean(false));
        integerGenerics.setT(new Integer(1));

        //所谓泛型就是变量类型的参数化

        Boolean t = booleanGenerics.getT();
        Integer t1 = integerGenerics.getT();
        System.out.println(t);
        System.out.println(t1);

    }
}
