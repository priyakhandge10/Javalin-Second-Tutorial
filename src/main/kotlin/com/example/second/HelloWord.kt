package com.example.second

import io.javalin.Javalin
class HelloWord
{
    val greeting: String
    get() {
        return "Hello"
    }
}
fun main(args: Array<String>) {
    val app = Javalin.create().start(7000) // create and start a server
    app.get("/Hello"){ ctx -> ctx.result(HelloWord().greeting)}
    app.get("/") { ctx -> ctx.result("Hello this is my javalin tutorial") } // add a handler to `/`
}
