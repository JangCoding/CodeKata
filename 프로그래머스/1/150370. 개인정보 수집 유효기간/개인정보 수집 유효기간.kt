class Solution {
fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    var answer = mutableListOf<Int>()

    val todayDate = today.split(".")
    val todayDays = todayDate[0].toInt()*12*28 + todayDate[1].toInt()*28 + todayDate[2].toInt()

    privacies.mapIndexed{ index, it ->
        val dateAndType = it.split(" ")
        val date= dateAndType[0].split(".")
        val type= dateAndType[1]

        val limitTerm = terms.find{it.startsWith(type)}?.split(" ")?.get(1)?.toInt()
        val limitDays = date[0].toInt()*12*28 + date[1].toInt()*28 + date[2].toInt() + limitTerm?.times(28)!!


        if ( limitDays <= todayDays )
            answer.add(index+1)
    }

    return answer.toIntArray()
}
}