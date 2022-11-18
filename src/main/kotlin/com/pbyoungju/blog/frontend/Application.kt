package com.pbyoungju.blog.frontend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogFrontendApplication

fun main(args: Array<String>) {
    runApplication<BlogFrontendApplication>(*args)
}
