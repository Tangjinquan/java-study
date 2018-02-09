/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: HashCodeTset
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/2/7	       Tyson	               初次做成
 * =============================================================
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/2/7下午6:23
 */
public class HashCodeTset {


    public Boolean test(boolean a) {

        return a;
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("1");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet treeSet = new TreeSet();
    }
}
