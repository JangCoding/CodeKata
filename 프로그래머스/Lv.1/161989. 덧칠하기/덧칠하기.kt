
class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var i=1
        var j=section[0]
        // if(m==1)
        //     return section.size

        for(j in section)
        {
            if(i<=j)
            {
                answer++
                i=j+m
            }
        } 
        return answer
    }
}