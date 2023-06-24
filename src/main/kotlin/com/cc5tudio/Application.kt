package com.cc5tudio

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.cc5tudio")
		.start()
}

