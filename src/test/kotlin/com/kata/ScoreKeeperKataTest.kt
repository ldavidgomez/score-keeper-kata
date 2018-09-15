package com.kata

import com.kata.ScoreKeeper.Match
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MatchTest {

    @Test
    @DisplayName("Should score if match is started")
    fun scoreIfMatchStarted() {
        val score = Match.new()
                .start()
                .scoreTeamA3()
                .getScore()
        assertThat(score).isEqualTo("003:000")
    }

    @Test
    @DisplayName("Should not score if match is not ended")
    fun notScoreIfMatchEnded() {
        val score = Match.new()
                .start()
                .end()
                .getScore()
        assertThat(score).isEqualTo("000:000")
    }

    @Test
    @DisplayName("Should not score if match is not ended")
    fun notScoreAndEndMatch() {
        val score = Match.new()
                .start()
                .scoreTeamA3()
                .end()
                .getScore()
        assertThat(score).isEqualTo("003:000")
    }
}

// getscore repetido
// misma api en scorekeeper y match
// ints pocos restrictivos para scorekeeper
// abstract class por encima de matches
// nombres para equipos
