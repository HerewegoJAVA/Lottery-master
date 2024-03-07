package com.example.lotterydbrouter.router.annotation;

import java.lang.annotation.*;

/**
 * @description:路由策略，分表标记
 * @author：1.9的阿云
 * @date: 2023/12/8
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;

}
