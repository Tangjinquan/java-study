/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: Test
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/2	       Tyson	               初次做成
 * =============================================================
 */
package watch;

import java.util.Date;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/3/2下午3:52
 * @version V1.0
 */
public class Test {

    public static void main(String[] args) {

        Watched girl = new ConcreteWatched();

        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        Watcher watcher3 = new ConcreteWatcher();

        girl.addWatcher(watcher1);
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);

        girl.notifyWatcher("hahah");

        girl.removeWatcher(watcher2);
        girl.notifyWatcher("不爽");
        new Date(){
            @Override
            public String toLocaleString() {
                return "hello";
            }
        };

    }
}
