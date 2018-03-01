/**
 * =============================================================
 * Copyright 2017 ELE.ME All Rights Reserved
 * 公司名称: 拉扎斯网络科技（上海）有限公司
 * 系统名称: 代理商
 * 子系统名:
 * 模块名称:
 * 类   名: OverrideTest
 * 概要:
 * 版本			日期				作者						备注
 * 1.0.0		2018/2/28	       Tyson	               初次做成
 * =============================================================
 */
package annotation;

import java.beans.Transient;
import java.lang.annotation.Inherited;
import java.util.Date;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/2/28上午11:51
 */
@AnnotationTest(value2 = AnnotationTest.EnumTest.blue)
public class OverrideTest {

    @Override
    @SuppressWarnings(value = {"Unchecked","Deprecated"})
    @AnnotationTest(value1 = "world",value2 = AnnotationTest.EnumTest.red)
    public String toString() {
        Date date = new Date();
        System.out.println(date.toString());
        return "hahahah ";
    }

    @Transient(value = true)  //value字段的可以不加value直接复制（true） 其他的必须是Name=值
    public static void main(String[] args) {
        OverrideTest overrideTest = new OverrideTest();
        System.out.println(overrideTest);
    }

}
