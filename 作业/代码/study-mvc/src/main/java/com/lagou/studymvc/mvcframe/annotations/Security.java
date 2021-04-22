package com.lagou.studymvc.mvcframe.annotations;

import java.lang.annotation.*;

/**
 * @Description Security 访问权限注解类，写在控制层类上
 * @date 2021-03-29 10:17
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Security {
    String[] value() default {};
}
