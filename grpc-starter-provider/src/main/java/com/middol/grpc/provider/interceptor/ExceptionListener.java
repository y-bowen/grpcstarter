package com.middol.grpc.provider.interceptor;

import io.grpc.*;

/**
 * @author <a href="http://gitlab.middol.cn:81/bowen">bowen yang</a>
 * @version 1.0
 * @date 2020年10月23日 5:28 下午
 */
public class ExceptionListener<ReqT, RespT> extends ServerCall.Listener {
    ServerCall<ReqT, RespT> serverCall;
    Metadata metadata;
    ServerCallHandler<ReqT, RespT> serverCallHandler;

    public ExceptionListener(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        this.serverCall = serverCall;
        this.metadata = metadata;
        this.serverCallHandler = serverCallHandler;
    }

    @Override
    public void onHalfClose() {
        try {
            ServerCall.Listener<ReqT> listener = serverCallHandler.startCall(serverCall, metadata);
            listener.onHalfClose();
        } catch (Exception t) {
            // 统一处理异常
            StatusRuntimeException exception = new StatusRuntimeException(Status.fromThrowable(t));
            // 调用 call.close() 发送 Status 和 metadata
            // 这个方式和 onError()本质是一样的
            serverCall.close(exception.getStatus(), exception.getTrailers());
        }
    }
}
