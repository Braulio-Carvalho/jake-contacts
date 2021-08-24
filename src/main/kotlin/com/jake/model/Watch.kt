package com.jake.model



import com.datastax.oss.driver.api.mapper.annotations.Entity
import java.util.*

@Entity
data class Watch(

    val id: UUID?,

    var model: String,
    var gender: String?

){

}
