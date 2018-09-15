package com.kata.ScoreKeeper

class ScoreKeeper (private val scoreA: Int = 0, private val scoreB: Int = 0) {
    fun getScore(): String = String.format("%03d:%03d", scoreA, scoreB)

    fun scoreTeamA(): ScoreKeeper = increaseScore(1, 0)
    fun scoreTeamB(): ScoreKeeper = increaseScore(0, 1)
    fun scoreTeamA2(): ScoreKeeper = increaseScore(2, 0)
    fun scoreTeamB2(): ScoreKeeper = increaseScore(0, 2)
    fun scoreTeamA3(): ScoreKeeper = increaseScore(3, 0)
    fun scoreTeamB3(): ScoreKeeper = increaseScore(0, 3)

    private fun increaseScore(increaseA: Int, increaseB: Int) =
            new(scoreA.plus(increaseA), scoreB.plus(increaseB))

    companion object {
        private fun new(scoreA: Int, scoreB: Int): ScoreKeeper = ScoreKeeper(scoreA, scoreB)
    }
}
