class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf(7,7)

        lottos.forEach { n->
            if(n == 0)
                answer[0]--
            else if(n in win_nums) {
                answer[0]--
                answer[1]--
            }
        }
        for(i in answer.indices){
            if(answer[i]==7)
                answer[i]=6
        }
        return answer
    }
}