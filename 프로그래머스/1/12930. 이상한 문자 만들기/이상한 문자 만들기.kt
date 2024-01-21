class Solution {
    fun solution(s: String): String {
        var answer = ""
        var slist = s
        var t = 0
        for (i in 0 until slist.length) {
            println(slist[i])
            if (t % 2 == 0 && slist[i].isLowerCase()) {
                println(slist[i].toChar().uppercaseChar())
                answer += slist[i].toChar().uppercaseChar()
            } else if (t % 2 == 1 && slist[i].isUpperCase()) {
                println(slist[i].toChar().lowercaseChar())
                answer += slist[i].toChar().lowercaseChar()
            } else if (slist[i] == ' ') {
                println(" ")
                answer += ' '
                t = -1
            } else
                answer += slist[i]
            t++
        }
        return answer
    }
}