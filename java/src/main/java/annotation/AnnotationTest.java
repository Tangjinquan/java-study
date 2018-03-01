package annotation;

import java.lang.annotation.*;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/2/28下午7:31
 */
//该注解隐含的继承了Annotation接口  //注解的想要用反射原理Retention必须设置为RetentionPolicy.RUNTIME
@Target({ElementType.METHOD,ElementType.TYPE})  //target表示注解只能用于方法。
@Retention(RetentionPolicy.CLASS)
@Inherited //表示不会继承Annotation接口
public @interface AnnotationTest {
    String value1() default "hello";

    EnumTest value2();

    enum EnumTest{
        red,blue,yellow
    }
}
