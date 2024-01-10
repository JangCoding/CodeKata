class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for(i in 0 until  nums.size - 2){
            for( j  in  i+1 until  nums.size - 1){
                for( k in j+1 until  nums.size){
                    var sum = nums[i]+nums[j]+nums[k]

                    for(l in 2..sum){
                        if(sum == l) {
                            answer += 1
                        }
                        else if(sum % l == 0)
                            break
                    }
                }
            }
        }
        return answer
    }
}

fun main() {
    var S=Solution()
    println(S.solution(intArrayOf(1,2,7,6,4)))
}

