// 둘 중 선물 많이 준 사람 
// 선물지수 = 준 선물 수 - 받은 선물 수
// 만약 두 사람의 선물 지수도 같다면 다음 달에 선물을 주고받지 않습니다.

// 표 2개 필요
// 서로 준 선물 목록 (2차)
// 총 준 선물 받은선물 선물지수 (2차)

// 가장 많은 선물 받는 친구 받을 선물 수 return

class Solution {
    public fun solution(friends: Array<String>, gifts: Array<String>): Int {
        var answer: Int = 0

        var friendSize = friends.size
        var giftTable = Array(friendSize){Array(friendSize){0}}
        var giftPoint = Array(friendSize){Array(3){0}}

        var nextGift = Array(friendSize){0}


        // 선물 주고받은 횟수 기록 테이블
        for( g in  gifts )
        {
            val giftTo = g.split(" ")
            giftTable[friends.indexOf(giftTo[0])][friends.indexOf(giftTo[1])] += 1
        }

        // 선물 지수 테이블
        for ( i in 0 until friendSize)
        {
            // 준, 받은 선물 합산
            for( j in 0 until friendSize)
            {
                giftPoint[i][0] += giftTable[i][j]
                giftPoint[j][1] += giftTable[i][j]
            }

        }

        for ( i in 0 until friendSize)
        {
            giftPoint[i][2] = giftPoint[i][0] - giftPoint[i][1]
        }


        // 주고받은 을 확인하고 테이블 지수를 확인하여 다음 달 받을 선물 수 계산
        for ( i in 0 until friendSize)
        {
            // 준, 받은 선물 합산
            for( j in i until friendSize)
            {
                if(i!=j) {
                    if((giftTable[i][j] == 0 && giftTable[j][i] == 0) || (giftTable[i][j] == giftTable[j][i]) ){
                        if (giftPoint[i][2] > giftPoint[j][2]) {
                            nextGift[i] += 1
                        } else if (giftPoint[i][2] < giftPoint[j][2]) {
                            nextGift[j] += 1
                        }
                    }
                    else if (giftTable[i][j] > giftTable[j][i]) {
                        nextGift[i] += 1
                    }
                    else
                        nextGift[j] += 1
                }
            }
        }




        print(giftTable)
        print(giftPoint)

        return nextGift.maxOf{it}
    }
}