package com.cc5tudio

import io.micronaut.core.annotation.Introspected
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey

@Introspected
@DynamoDbBean
data class BookRepository(
        @get:DynamoDbPartitionKey
        var name: String? = null,
        var isbn: String? = null
)