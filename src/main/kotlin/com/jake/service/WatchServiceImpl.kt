package com.jake.service

import com.jake.model.Watch
import com.jake.model.dto.WatchDTO
import com.jake.repository.WatchRepositoryImpl
import java.util.*
import javax.inject.Singleton

@Singleton
class WatchServiceImpl(private val watchRepositoryImpl: WatchRepositoryImpl) : WatchService {


    override fun createWatch(watch: Watch): Watch {
        return watchRepositoryImpl.createWatch(watch)
    }

    override fun getWatchById(id: UUID): Watch {
        return watchRepositoryImpl.findWatchById(id)
    }


    override fun getWatch(): List<Watch> {
        return watchRepositoryImpl.listAllWatches()
    }

    override fun deleteWatchById(id: UUID) {
        watchRepositoryImpl.deleteWatch(id)
    }

    override fun updateWatch(id: UUID, newWatch: WatchDTO): Watch {
        var watch = watchRepositoryImpl.findWatchById(id)
        watch.apply {
            this.model = newWatch.model
            this.gender = newWatch.gender
        }
        return watchRepositoryImpl.updateWatch(id, watch)
    }


}