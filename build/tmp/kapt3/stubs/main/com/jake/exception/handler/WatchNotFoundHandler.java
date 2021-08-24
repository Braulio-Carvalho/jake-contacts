package com.jake.exception.handler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/jake/exception/handler/WatchNotFoundHandler;", "Lio/micronaut/http/server/exceptions/ExceptionHandler;", "Lcom/jake/exception/WatchNotFoundException;", "Lio/micronaut/http/HttpResponse;", "", "()V", "handle", "request", "Lio/micronaut/http/HttpRequest;", "exception", "watch"})
@javax.inject.Singleton()
public final class WatchNotFoundHandler implements io.micronaut.http.server.exceptions.ExceptionHandler<com.jake.exception.WatchNotFoundException, io.micronaut.http.HttpResponse<java.lang.Object>> {
    
    public WatchNotFoundHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.micronaut.http.HttpResponse<java.lang.Object> handle(@org.jetbrains.annotations.Nullable()
    io.micronaut.http.HttpRequest<?> request, @org.jetbrains.annotations.Nullable()
    com.jake.exception.WatchNotFoundException exception) {
        return null;
    }
}