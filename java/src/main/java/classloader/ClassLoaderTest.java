/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: ClassLoaderTest
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/13	       Tyson	               初次做成
 * =============================================================
 */
package classloader;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/3/13下午6:11
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        System.exit(0);
        //类的加载器 1、加载class 2、连接（验证、准备、解析）3、初始化 赋值

        //加载器  1、根类加载器 （使用C++编写 无法再Java代码中获得） getClassLoader会返回空  2、扩展加载器 使用Java代码实现 3、系统加载器（应用加载器） 使用Java代码实现

        //用户自定义的加载器都是Java ClassLoader的子类

        // abstract class ClassLoader

        //子类加载器只有一个父类加载器 ，子类加载会委托父类加载。  父亲委拖加载机制


    }
}
