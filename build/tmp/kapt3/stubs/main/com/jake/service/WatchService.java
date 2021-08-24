package com.jake.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0004"}, d2 = {"Lcom/jake/service/WatchService;", "", "createWatch", "Lcom/jake/model/Watch;", "watch", "deleteWatchById", "", "id", "Ljava/util/UUID;", "getWatch", "", "getWatchById", "updateWatch", "newWatch", "Lcom/jake/model/dto/WatchDTO;"})
public abstract interface WatchService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jake.model.Watch createWatch(@org.jetbrains.annotations.NotNull()
    com.jake.model.Watch watch);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jake.model.Watch getWatchById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jake.model.Watch> getWatch();
    
    public abstract void deleteWatchById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jake.model.Watch updateWatch(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    com.jake.model.dto.WatchDTO newWatch);
}