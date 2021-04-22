package com.lagou.studymvc.mvcframe.annotations;

import java.lang.annotation.*;

/**
 * @Description 依赖注入注解类
 * @date 2021-03-29 10:14
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LagouStudyAutowired {
    String value() default "";
}
