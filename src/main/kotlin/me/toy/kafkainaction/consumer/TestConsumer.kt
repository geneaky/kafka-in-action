package me.toy.kafkainaction.consumer

import me.toy.kafkainaction.message.FirstType
import me.toy.kafkainaction.message.SecondType
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class TestConsumer {

    @KafkaListener(
        id = "first-consumer",
        topics = ["first-topic"],
        concurrency = "10",
    )
    fun consumeFirstType(firstType: FirstType) {
       println("Consuming first topic ${firstType.name} & ${firstType.age}")
    }

    @KafkaListener(
        id = "second-consumer",
        topics = ["second-topic"],
        concurrency = "20"
    )
    fun consumeSecondType(secondType: SecondType) {
       println("Consuming second topic ${secondType.name} & ${secondType.age} & ${secondType.address}")
    }
}