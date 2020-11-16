package com.middol.rpc.spring.boot.autoconfigure;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.integration.grpc.interceptor.client.ClientTransactionInterceptor;
import io.seata.integration.grpc.interceptor.server.ServerTransactionInterceptor;
import io.seata.rm.datasource.DataSourceProxy;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年11月09日 2:45 下午
 */
@Slf4j
@Configuration
@EnableDiscoveryClient
public class MiddolRpcAutoConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "spring.datasource", name = "type")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Primary
    @ConditionalOnBean({DruidDataSource.class})
    @Bean("dataSource")
    public DataSource dataSource(DruidDataSource druidDataSource) {
        return new DataSourceProxy(druidDataSource);
    }

    @Bean
    @GrpcGlobalClientInterceptor
    public ClientTransactionInterceptor clientTransactionInterceptor(){
        return new ClientTransactionInterceptor();
    }

    @Bean
    @GrpcGlobalServerInterceptor
    public ServerTransactionInterceptor serverTransactionInterceptor(){
        return new ServerTransactionInterceptor();
    }
}
