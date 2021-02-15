/* kotlin 반복문
 *
 * for : 지정된 구간에서 조건에 맞춰 반복
 * for (반복조건) {반복할 구문}
 *
 *
 */
fun main( ) {

    /* for : 지정된 구간에서 조건에 맞춰 반복
     * for (반복조건) {반복할 구문}
     */

        // for (int i=1; i<=10; i++)
        for (i in 1..10) print("$i ")
        println("")

        // for (int i=1; i<10; i++)
        for (i in 1 until 10) print("$i ")
        println("")

        // for (int i=1; i<=10; i=i+2)
        for (i in 1..10 step 2) print("$i ")
        println("")

        // for (int i=10; i>=1; i=i-1)
        for (i in 10 downTo 1) print("$i ")

        // 잘못된 예시
        // for (i in 10..1) print("$i ")
        // println("")
        // for (i in 10..1 step 1) print("$i ")
        // println("")
        println("")
        println("--------------------------------")

    /* while : 조건이 맞는 동안 반복
     * while(조건) {반복할 구분}
     */
        var i = 10
        while(i > 0) {
            print("$i ")
            i--;
        }
        println("")
        println("--------------------------------")

    /* kotlin 조건식
     * if : 조건식이 참인 경우 지정된 연산을 수행
     * if(조건식1) 문장1
     * if else (조건식2) 문장2
     * else 문장3
     */

        var a = 10
        var b = 15
        if (a > b) println("a가 큽니다.")
        else println("b가 큽니다.")

        var max = if (a > b) a
        else b
        println("큰 값은 ${max}입니다.");
        println("--------------------------------")

    /* kotlin
     * when : java 의 switch 버전
     * 정수 이외의 다양한 타입을 대입해서 구분할 수 있음
     * when(조건식) {
     *      조건값1 -> 문장1
     *      조건값2 -> 문장2
     *      else  -> 문장3
     * }
     */

        when {
            a > b -> print("a가 큽니다.")
            a < b -> print("b가 큽니다.")
            a == b -> print("a와 b가 같습니다..")
        }
        println("")

        var num=1;
        var result = when(num) {

            1 -> "one"
            2 -> "two"
            3 -> "three"
            in 4..6 -> "many"
            !is Int -> "정수아님" // Int 형이 아니라면
            else -> "etc"
        }
        println(result);
        println("--------------------------------")


}
