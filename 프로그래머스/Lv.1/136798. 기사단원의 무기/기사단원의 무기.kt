 

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 1

        for (i in 2..number) {
            var yak = 0

            for( j in 1..i)
            {
                if(i%j == 0)
                {
                    yak++
                }
                if( yak > limit) {
                    yak = power
                    break
                }
                if(j >= i/2)
                {
                    yak++
                    break
                }
            }
            if( yak > limit)
                yak = power 
            answer += yak
        }
        return answer
    }
}
 
