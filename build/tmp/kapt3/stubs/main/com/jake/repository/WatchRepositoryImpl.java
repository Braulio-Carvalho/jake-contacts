package com.jake.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/jake/repository/WatchRepositoryImpl;", "Lcom/jake/repository/WatchRepository;", "cqlSession", "Lcom/datastax/oss/driver/api/core/CqlSession;", "(Lcom/datastax/oss/driver/api/core/CqlSession;)V", "createWatch", "Lcom/jake/model/Watch;", "watch", "deleteWatch", "", "id", "Ljava/util/UUID;", "findWatchById", "listAllWatches", "", "updateWatch"})
@javax.inject.Singleton()
public final class WatchRepositoryImpl implements com.jake.repository.WatchRepository {
    private final com.datastax.oss.driver.api.core.CqlSession cqlSession = null;
    
    public WatchRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.datastax.oss.driver.api.core.CqlSession cqlSession) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jake.model.Watch> listAllWatches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jake.model.Watch findWatchById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jake.model.Watch createWatch(@org.jetbrains.annotations.NotNull()
    com.jake.model.Watch watch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jake.model.Watch updateWatch(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    com.jake.model.Watch watch) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteWatch(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
    }
}