class Solution {
    fun solution(n: Int): Boolean {
        var answer = false
        //x 를 각자리 합으로 나눠지면 하샤드
        var hap:Int =0
        //var arr = n.toString().toList
        var t = n
        while(t>0)
        {
            hap += t%10
            t /= 10
        }
        /*
        arr.forEach(){
            hap += it.toString().toInt()
        }*/
        if(n % hap == 0)
            answer=true

        return answer
    }
}