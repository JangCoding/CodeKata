class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var xcnt = 0
        var ycnt = 0

        var x = s[0]
        for(c in s.indices){
            if(xcnt==ycnt)
            {
                answer++
                x=s[c]
                xcnt=0
                ycnt=0
            }

            if(x==s[c])
                xcnt++
            else
                ycnt++
        }
        return answer
    }
}
