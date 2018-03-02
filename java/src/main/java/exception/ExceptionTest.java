/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: ExceptionTest
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/2	       Tyson	               初次做成
 * =============================================================
 */
package exception;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 自定义异常测试
 * @date 2018/3/2上午11:33
 */
public class ExceptionTest {
    public void method(String str) throws MyException {
        if (null == str) {
            throw new MyException("传入的字符串参数不能为空");
        } else {
            System.out.println(str);
        }
        //非运行时异常只继承了Exception，运行时异常继承了runtimeException, 运行时异常不用处理 ，非运行时异常需要立即处理。
        //自定义异常基本都是非运行时异常 （受查异常）
        //多个catch ,如果有父类的exception.则将父类的exception Catch 放在最后，若放在前面 ，则子类的Catch块永远不会执行
        //try里面有return;那么会执行完finnally里的代码再去执行return; try里面有system.exit(0)会直接返回。不会执行finally里的代码
    }
}
