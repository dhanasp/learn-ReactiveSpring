package com.learnReactiveSpring.learnReactiveSpring.fluxAndMonoPlayground

import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux

class FluxAndMonoTest {
    @Test
    internal fun fluxTest() {
        val stringFlux = Flux.just("Spring", "SpringBoot", "SpringBootWeb")
        stringFlux
            .subscribe(System.out::println)
    }
}
