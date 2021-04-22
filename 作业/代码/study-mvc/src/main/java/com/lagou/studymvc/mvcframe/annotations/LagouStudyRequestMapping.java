package com.lagou.studymvc.mvcframe.annotations;

import java.lang.annotation.*;

/**
 * @Description url路径注解
 * @date 2021-03-29 10:20
 */
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LagouStudyRequestMapping {
    String value() default "";
}
