package me.toy.kafkainaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkainactionApplication

fun main(args: Array<String>) {
    runApplication<KafkainactionApplication>(*args)
}
