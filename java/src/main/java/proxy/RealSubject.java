/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: RealSubject
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/2/27	       Tyson	               初次做成
 * =============================================================
 */
package proxy;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/2/27下午7:08
 * @version V1.0
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("来自真实实现的对象");
    }
}
