package com.jake.service

import com.jake.model.Watch
import com.jake.model.dto.WatchDTO
import java.util.*


interface WatchService {

    fun createWatch(watch: Watch): Watch

    fun getWatchById(id: UUID): Watch

    fun getWatch(): List<Watch>

    fun deleteWatchById(id: UUID)

    fun updateWatch(id: UUID, newWatch: WatchDTO): Watch

}