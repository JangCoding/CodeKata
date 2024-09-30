class Solution {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
    var answer: Long = 0

    var p =0
    var d =0

    for(i in n-1 downTo 0) {

        var cnt =0
        d += deliveries[i]
        p += pickups[i]
        while (d > 0 || p > 0){
            d -= cap
            p -= cap
            cnt +=1
        }

        answer += cnt*2*(i+1)
    }

    return answer
}
}