class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var tri : String = ""
        var num = n.toLong()
        while(num>0)
        {
            tri += (num%3).toString()
            num/=3
        }

        var dec=tri.toLong()
        var p=1

        while(dec>0)
        {
            num += dec%10 * p
            dec/=10
            p *= 3
        }
        answer = num.toInt()
        return answer
    }
}