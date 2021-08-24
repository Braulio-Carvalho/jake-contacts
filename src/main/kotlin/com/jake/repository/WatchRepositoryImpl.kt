package com.jake.repository

import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import com.jake.model.Watch
import java.util.*
import javax.inject.Singleton

@Singleton
class WatchRepositoryImpl(private val cqlSession: CqlSession) : WatchRepository {

    override fun listAllWatches(): List<Watch> {
        val value = cqlSession.execute(
            SimpleStatement
                .newInstance("Select * From watch_api.watch")
        )
        return value.map {
            it.getUuid("id")?.let { it1 ->
                Watch(
                    it1,
                    it.getString("model").toString(),
                    it.getString("gender")
                )
            }
        }.toList()
    }

    override fun findWatchById(id: UUID): Watch {
        val watch = cqlSession.execute(
            SimpleStatement.newInstance(
                "Select * From watch_api.watch Where id = $id"
            )
        )

        return watch.map {
            it.getUuid("id")?.let { it1 ->
                Watch(
                    it1,
                    it.getString("model").toString(),
                    it.getString("gender")
                )
            }
        }.first()
    }

    override fun createWatch(watch: Watch): Watch {
        cqlSession.execute(
            SimpleStatement.newInstance(
                "insert into watch_api.watch (id, model, gender) values (?,?,?) if not exists",
                UUID.randomUUID(),
                watch.model,
                watch.gender
            )
        )
        return watch
    }

    override fun updateWatch(id: UUID, watch: Watch): Watch {
        cqlSession.execute(
            SimpleStatement.newInstance(
                "Update watch_api.watch Set model = ?, gender = ? Where id = $id",
                watch.model,
                watch.gender
            )
        )
        return watch
    }

    override fun deleteWatch(id: UUID) {
        cqlSession.execute(
            SimpleStatement.newInstance(
                "Delete From watch_api.watch Where id = $id"
            )
        )
    }


}