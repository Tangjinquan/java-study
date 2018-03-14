/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: CloneTest
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/13	       Tyson	               初次做成
 * =============================================================
 */
package threadexample;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/3/13下午2:26
 * @version V1.0
 */
public class CloneTest {
    //序列化进行深复制  连引用对象直接重新创建

}

class Student implements Cloneable {

    private int age ;
    private String name ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //这是浅复制
        return super.clone();
    }
}