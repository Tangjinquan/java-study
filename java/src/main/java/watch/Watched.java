/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: Watched
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/2	       Tyson	               初次做成
 * =============================================================
 */
package watch;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 观察者模式
 * @date 2018/3/2下午3:16
 */
public interface Watched {

    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatcher(String str);

}
