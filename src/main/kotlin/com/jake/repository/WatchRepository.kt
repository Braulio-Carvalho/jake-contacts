package com.jake.repository

import com.jake.model.Watch
import java.util.*

interface WatchRepository {

    fun listAllWatches(): List<Watch>

    fun findWatchById(id: UUID): Watch

    fun createWatch(watch: Watch): Watch

    fun deleteWatch(id: UUID)

    fun updateWatch(id: UUID, watch: Watch): Watch
}