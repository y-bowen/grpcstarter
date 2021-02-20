package com.middol.rpc.spring.boot.autoconfigure.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.lang.annotation.*;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年12月18日 11:25 上午
 */
@Target({ ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Scope("thread")
@Documented
public @interface ThreadScope {
    /**
     * @see Scope#proxyMode()
     * @return proxy mode
     */
    ScopedProxyMode proxyMode() default ScopedProxyMode.TARGET_CLASS;
}
