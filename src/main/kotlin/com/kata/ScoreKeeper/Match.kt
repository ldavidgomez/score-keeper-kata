package com.kata.ScoreKeeper

abstract class Match {
    companion object {
        fun new():NotStartedMatch = NotStartedMatch()
    }
}

open class NotStartedMatch {
    fun start(): StartedMatch = StartedMatch.create()
}

open class StartedMatch private constructor(val scoreKeeper: ScoreKeeper) {

    fun scoreTeamA() = StartedMatch.new(scoreKeeper.scoreTeamA())
    fun scoreTeamB() = StartedMatch.new(scoreKeeper.scoreTeamB())
    fun scoreTeamA2() = StartedMatch.new(scoreKeeper.scoreTeamA2())
    fun scoreTeamB2() = StartedMatch.new(scoreKeeper.scoreTeamB2())
    fun scoreTeamA3() = StartedMatch.new(scoreKeeper.scoreTeamA3())
    fun scoreTeamB3() = StartedMatch.new(scoreKeeper.scoreTeamB3())

    fun getScore(): String = scoreKeeper.getScore()

    fun end() = EndedMatch(scoreKeeper)

    companion object {
        private fun new(scoreKeeper: ScoreKeeper) = StartedMatch(scoreKeeper)
        fun create() = new(ScoreKeeper())
    }
}

open class EndedMatch(private val scoreKeeper: ScoreKeeper) {
    fun getScore() = scoreKeeper.getScore()
}
