package com.jake.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J\u0012\u0010\t\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/jake/controller/WatchController;", "", "watchService", "Lcom/jake/service/WatchService;", "(Lcom/jake/service/WatchService;)V", "deleteWatchById", "", "id", "Ljava/util/UUID;", "listWatches", "", "Lcom/jake/model/Watch;", "saveWatch", "Lio/micronaut/http/HttpResponse;", "watch", "updateWatch", "Lcom/jake/model/dto/WatchDTO;"})
@io.micronaut.http.annotation.Controller(value = "/watches")
public final class WatchController {
    private final com.jake.service.WatchService watchService = null;
    
    public WatchController(@org.jetbrains.annotations.NotNull()
    com.jake.service.WatchService watchService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post()
    public final io.micronaut.http.HttpResponse<com.jake.model.Watch> saveWatch(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.jake.model.Watch watch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/get")
    public final java.util.List<com.jake.model.Watch> listWatches() {
        return null;
    }
    
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public final void deleteWatchById(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.util.UUID id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public final com.jake.model.Watch listWatches(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public final io.micronaut.http.HttpResponse<com.jake.model.Watch> updateWatch(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.jake.model.dto.WatchDTO watch) {
        return null;
    }
}