package me.darkville

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class WebApplication

fun main(args: Array<String>) {
    SpringApplication.run(WebApplication::class.java, *args)
    println("Hello world!")
}