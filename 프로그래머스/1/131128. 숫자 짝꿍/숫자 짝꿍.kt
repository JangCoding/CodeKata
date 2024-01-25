import kotlin.coroutines.suspendCoroutine

class Solution {
    fun solution(X: String, Y: String): String {
        var answer = ""
        var xarr=IntArray(10) { 0 }
        var yarr=IntArray(10) { 0 }

        for(i in X.indices)
        {
            xarr[X[i].toString().toInt()]++
        }
        for(i in Y.indices)
        {
            yarr[Y[i].toString().toInt()]++
        }


        for(i in 0..9)
        {
            if(xarr[i]>0&&yarr[i]>0){
                if(xarr[i]<yarr[i])
                    answer += i.toString().repeat(xarr[i])
                else
                    answer += i.toString().repeat(yarr[i])
            }
        }


        answer = answer.toList().sortedDescending().joinToString("")
        if(answer=="")
            return "-1"
        else if(answer[0] == '0')
            return "0"
        else
            return answer
    }
}
       /* var t = Y
        for(i in X.indices)
        {
            if(X[i] in t) {
                answer +=X[i]
                t = t.replaceFirst(X[i].toString(),"")
            }
        }
        if( answer.isEmpty())
            return "-1"
        else if( answer[0] == '0')
            return "0"
        else {
            return answer
                .toString()
                .toList()
                .sortedDescending()
                .joinToString("")
        }
    }*/
  