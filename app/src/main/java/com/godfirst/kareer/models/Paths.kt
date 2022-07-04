package com.godfirst.kareer.models

import java.io.Serializable

data class Paths(
    val name: String,
    val description: String,
    val image: Int
) : Serializable
