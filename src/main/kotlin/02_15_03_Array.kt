
/* 배열
 * 같은 자료형 데이터들을 하나의 변수에 저장
 * arrayOf, arrayOfNull 이라는 함수를 이용해서 생성 가능
 * kotlin 에서는 배열은 Array 클래스로 표현
 * 따라서, set/get 메서드와 size 속성을 기본적으로 포함
 *
 * boxing 오버헤드가 없는 기본 유형 값을 저장하기 위한 전문 배열 클래스를 지원함
 * 기본타입 Array 형식으로 선언해서 사용함
 */

fun main() {

    // ArrayList 배열
    var data1 = arrayOf("혜교", "수지", "지현", 3)
    var data2 = arrayOfNulls<Int>(3)    // null 허용 배열
    data2.set(0, 10)
    data2.set(1, 20)
    data2.set(2, 30)

    println("${data1[0]} ${data1[1]} ${data1[2]} ${data1[3]}")
    println("${data1.get(0)} ${data1.get(1)} ${data1.get(2)} ${data1.get(3)}")
    println("${data2[0]} ${data2[1]} ${data2[2]}")
    println("${data2.get(0)} ${data2.get(1)} ${data2[2]}")

    // int[] arr =  배열
    var data3 = intArrayOf(10, 20, 3) // int 로만 이뤄진 배열 선언 int[] arr = int[] {10,20,3}
    var data4 = IntArray(3)     // 크기가 3인 int 배열 선언
    var data5 = IntArray(3) {1} // 크기가 3이고, 값이 1인 int 배열 선언

    println("${data3[0]} ${data3[1]} ${data3[2]}")
    println("${data4.size}")
    println("${data5[0]} ${data5[1]} ${data5[2]}")

    // int[] arr = null ?????
    var data6 = emptyArray<Int>()
    data6.set(0,1)
    data6.set(2,1)
    data6.set(1,1)

    // for (i in 0 until data6.size) println(data6.get(i))

}