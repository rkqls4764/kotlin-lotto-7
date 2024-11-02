package lotto

class LottoResult {
    val winnersCount: MutableMap<LottoRank, Int> = HashMap()

    /* 당첨자 수 추가 함수 */
    fun addWinners(rank: LottoRank) {
        winnersCount[rank] = (winnersCount[rank] ?: 0) + 1
    }

    /* 당첨자 수 가져오는 함수 */
    fun getWinnersCount(rank: LottoRank): Int {
        return winnersCount[rank] ?: 0
    }
}