package com.example.web

import io.javalin.Javalin

fun main() {
    println("https://javalin.io/documentation#getting-started")

    val app = Javalin.create().start(7070)
    app.get("/") { ctx ->
        ctx.result("blah, hello! .....")
    }
}