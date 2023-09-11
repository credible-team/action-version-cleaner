package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Version(
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
)