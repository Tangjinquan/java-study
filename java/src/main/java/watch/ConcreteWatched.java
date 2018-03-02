/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: ConcreteWatched
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/3/2	       Tyson	               初次做成
 * =============================================================
 */
package watch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/3/2下午3:25
 * @version V1.0
 */
public class ConcreteWatched implements Watched {

    private List<Watcher> list = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);

    }

    @Override
    public void notifyWatcher(String str) {
        for (Watcher watcher : list) {
            watcher.update(str);
        }

    }
}
