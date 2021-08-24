package com.jake.controller

import com.jake.model.Watch
import com.jake.model.dto.WatchDTO
import com.jake.service.WatchService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import java.util.*


@Controller("/watches")
class WatchController(private val watchService: WatchService) {



    @Post
    fun saveWatch(@Body watch: Watch): HttpResponse<Watch> {
        return HttpResponse.created(watchService.createWatch(watch))
    }

    @Get("/get")
    fun listWatches(): List<Watch> {
        return watchService.getWatch()
    }

    @Delete("/{id}")
    fun deleteWatchById(@PathVariable id: UUID) {
        watchService.deleteWatchById(id)
    }

    @Get("/{id}")
    fun listWatches(@PathVariable id: UUID): Watch {
        return watchService.getWatchById(id)
    }

    @Put("/{id}")
    fun updateWatch(@PathVariable id: UUID, @Body watch: WatchDTO): HttpResponse<Watch> {
        return HttpResponse.created(watchService.updateWatch(id, watch))
    }


}