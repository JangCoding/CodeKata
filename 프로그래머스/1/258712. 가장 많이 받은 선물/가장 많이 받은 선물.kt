class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        // 선물 수량을 세기 위한 맵 생성
        val giftMap = gifts.groupingBy { it }.eachCount()
        // 각 친구의 선물 지수를 계산하여 맵에 저장
        val pIdxMap = friends.map { it to pIdx(it, friends, giftMap) }.toMap()
        
        // 각 친구의 선물 지수를 계산하고, 최대값 반환
        return friends.map {
            numOfPresents(it, friends, giftMap, pIdxMap)
        }.maxOrNull() ?: 0 // maxOrNull() 사용
    }

    // 친구의 선물 지수 계산
    fun pIdx(friend: String, friends: Array<String>, giftMap: Map<String, Int>): Int {
        val give = friends.sumBy { giftMap["$friend $it"] ?: 0 } 
        val take = friends.sumBy { giftMap["$it $friend"] ?: 0 }
        return give - take
    }

    // 특정 친구가 다른 친구들에게 줄 수 있는 선물의 수 계산
    fun numOfPresents(friend: String, friends: Array<String>, giftMap: Map<String, Int>, pIdxMap: Map<String, Int>): Int {
        return friends.count {
            val give = giftMap["$friend $it"] ?: 0
            val take = giftMap["$it $friend"] ?: 0
            give > take || (give == take && pIdxMap[friend]!! > pIdxMap[it]!!)
        }
    }
}
