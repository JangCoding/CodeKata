class Solution {
    fun solution(serveys:Array<String>, choices:IntArray) : String {
    var answer = ""
    var result = mutableMapOf(
        "R" to 0, "T" to 0,
        "C" to 0, "F" to 0,
        "J" to 0, "M" to 0,
        "A" to 0, "N" to 0,
    )

    for (i in 0 until serveys.size) {
        val t1 = serveys[i][0].toString()
        val t2 = serveys[i][1].toString()
        if (choices[i] > 4){
            result[t2] = result[t2]!! + (choices[i]-4)
        }
        else if(choices[i] < 4){
            result[t1] = result[t1]!! + (4-choices[i])
        } 
    }

    if(result["R"]!! >= result["T"]!!)
        answer += "R"
    else
        answer += "T"
    if(result["C"]!! >= result["F"]!!)
        answer += "C"
    else
        answer += "F"
    if(result["J"]!! >= result["M"]!!)
        answer += "J"
    else
        answer += "M"
    if(result["A"]!! >= result["N"]!!)
        answer += "A"
    else
        answer += "N"

    return answer;
}
}

    