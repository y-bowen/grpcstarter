package com.middol.grpc.provider.interceptor;


import io.grpc.*;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年10月23日 5:28 下午
 */
//@GrpcGlobalServerInterceptor
public class ExceptionInterceptor implements ServerInterceptor {
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        return serverCallHandler.startCall(new ForwardingServerCall.SimpleForwardingServerCall(serverCall){
            @Override
            public void sendHeaders(Metadata headers) {
                super.sendHeaders(headers);
            }
        }, metadata);
    }
}
