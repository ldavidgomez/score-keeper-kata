package com.kata

import com.kata.ScoreKeeper.ScoreKeeper
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ScoreKeeperTest {

    @Test
    @DisplayName("Should return score 000:000")
    fun getScore() {
        val score = ScoreKeeper().getScore()
        assertThat(score).isEqualTo("000:000")
    }

    @Test
    @DisplayName("Should return score 001:000 when 1 point for team A")
    fun getScore1A() {
        val score = ScoreKeeper().scoreTeamA().getScore()
        assertThat(score).isEqualTo("001:000")
    }

    @Test
    @DisplayName("Should return score 000:001 when 1 point for team B")
    fun getScore1B() {
        val score = ScoreKeeper().scoreTeamB().getScore()
        assertThat(score).isEqualTo("000:001")
    }

    @Test
    @DisplayName("Should return score 002:000 when 2 point for team A")
    fun getScoreA2() {
        val score = ScoreKeeper().scoreTeamA2().getScore()
        assertThat(score).isEqualTo("002:000")
    }

    @Test
    @DisplayName("Should return score 000:002 when 2 point for team B")
    fun getScoreB2() {
        val score = ScoreKeeper().scoreTeamB2().getScore()
        assertThat(score).isEqualTo("000:002")
    }

    @Test
    @DisplayName("Should return score 003:000 when 3 point for team A")
    fun getScoreA3() {
        val score = ScoreKeeper().scoreTeamA3().getScore()
        assertThat(score).isEqualTo("003:000")
    }

    @Test
    @DisplayName("Should return score 000:003 when 3 point for team B")
    fun getScoreB3() {
        val score = ScoreKeeper().scoreTeamB3().getScore()
        assertThat(score).isEqualTo("000:003")
    }

    @Test
    @DisplayName("Should return score 002:000 when 1 point + 1 point for team A")
    fun getScore1A2times() {
        val score = ScoreKeeper().scoreTeamA().scoreTeamA().getScore()
        assertThat(score).isEqualTo("002:000")
    }

    @Test
    @DisplayName("Should return score 002:006")
    fun getScore26() {
        val score = ScoreKeeper()
                .scoreTeamA()
                .scoreTeamB3()
                .scoreTeamA()
                .scoreTeamB2()
                .scoreTeamB()
                .getScore()
        assertThat(score).isEqualTo("002:006")
    }

    @Test
    @DisplayName("Should return score 012:012")
    fun getScore1212() {
        val score = ScoreKeeper()
                .scoreTeamA3()
                .scoreTeamB3()
                .scoreTeamA3()
                .scoreTeamB3()
                .scoreTeamA3()
                .scoreTeamB3()
                .scoreTeamA3()
                .scoreTeamB3()
                .getScore()
        assertThat(score).isEqualTo("012:012")
    }
}

