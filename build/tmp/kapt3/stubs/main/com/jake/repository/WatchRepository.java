package com.jake.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/jake/repository/WatchRepository;", "", "createWatch", "Lcom/jake/model/Watch;", "watch", "deleteWatch", "", "id", "Ljava/util/UUID;", "findWatchById", "listAllWatches", "", "updateWatch"})
public abstract interface WatchRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jake.model.Watch> listAllWatches();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jake.model.Watch findWatchById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jake.model.Watch createWatch(@org.jetbrains.annotations.NotNull()
    com.jake.model.Watch watch);
    
    public abstract void deleteWatch(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jake.model.Watch updateWatch(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    com.jake.model.Watch watch);
}