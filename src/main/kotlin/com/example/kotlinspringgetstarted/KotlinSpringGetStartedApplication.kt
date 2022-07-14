package com.example.kotlinspringgetstarted

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringGetStartedApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringGetStartedApplication>(*args)
}
