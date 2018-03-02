/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: MyException
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/2	       Tyson	               初次做成
 * =============================================================
 */
package exception;

/**
 * @author Tyson
 * @version V1.0
 * @date 2018/3/2上午11:28
 */
public class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
