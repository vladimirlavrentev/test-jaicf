package com.justai.jaicf.template.scenario

import com.justai.jaicf.builder.Scenario

val mainScenario = Scenario {
    state("Start") {
        globalActivators {
            regex("/start")
        }
        action {
            reactions.say("So let's begin!")
        }
    }

    state("Hello") {
        activators {
            intent("Hello")
        }

        action {
            reactions.say("Hi there!")
        }
    }

    state("Bye") {
        activators {
            intent("Bye")
        }

        action {
            reactions.say("See you soon!")
        }
    }

    fallback {
        reactions.say("I have nothing to say yet...")
    }
}