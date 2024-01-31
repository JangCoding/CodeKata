class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n - lost.size

        var lostv = lost.sorted().toMutableList()
        var rev = reserve.sorted().toMutableList()

        var lmax = 0
        while(lmax<lostv.size)
        {
            if(lostv[lmax] in rev){
                answer++
                rev.remove(lostv[lmax])
                lostv.remove(lostv[lmax])                
                lmax--
            }
            lmax++
        }

        lmax = 0
        var rmax = 0

        while(lmax<lostv.size)
        {
            for( r in rev){
                if(r-1 <= lostv[lmax] && lostv[lmax] <= r+1){
                    answer++
                    rev.remove(r)
                    break
                }
            }
            lmax++
        }
        return answer
    }
}