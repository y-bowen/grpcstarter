package com.middol.rpc.spring.boot.autoconfigure;

import com.middol.rpc.spring.boot.autoconfigure.annotation.ThreadScope;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年12月18日 1:58 下午
 */
@Slf4j
@Data
@Component
@ThreadScope
public class ThreadScopeTest {

    private String name;

    private Integer age;

}
