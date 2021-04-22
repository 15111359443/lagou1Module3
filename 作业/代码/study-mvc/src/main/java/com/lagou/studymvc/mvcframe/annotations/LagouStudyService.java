package com.lagou.studymvc.mvcframe.annotations;

import java.lang.annotation.*;

/**
 * @Description Service 业务层注解类
 * @date 2021-03-29 10:20
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LagouStudyService {
    String value() default "";
}
