
fun main() {

    /* List
     * 자바와는 다르게 list 에는 읽기전용과 수정가능한 객체등 2가지가 각각 지원
     * 읽기전용 list 객체를 만들때는 listOf 라는 함수를 사용함
     * 쓰기가능 list 객체를 만들때는 mutableListOf 라는 함수를 사용함
     *
     * filterNotNull 이라는 함수를 사용하면 null 을 제외한 나머지 요소만 다룸
     * +,- 연산자를 이용해서 특정 요소를 추가하거나 제거할 수 있음음 */

    var names11 = listOf("혜교", "지현", "수지")
    // names.add("길동") 읽기전용이라 추가 불가
    for (i in 0..names11.size-1) print("${names11[i]} ")
    println()

    var names12 = mutableListOf("혜교", "지현", "수지")
    names12.add("길동")
    for (i in 0..names12.size-1) print("${names12[i]} ")
    println()

    var names13 = names12 + null
    for (i in 0..names13.size-1) print("${names13[i]} ")
    println()

    var names14 = names13 - "지현"
    for (i in 0..names14.size-1) print("${names14[i]} ")
    println()

    var names15 = names14
    for (name in names15.filterNotNull()) print("${name} ")
    println()
    println()

    /* Map
     * 자바와는 다르게 Map 에는 읽기전용과 수정가능한 객체등 2가지가 각각 지원
     * 읽기전용 Map 객체를 만들때는 mapOf 라는 함수를 사용함
     * 쓰기가능 Map 객체를 만들때는 mutableMapOf 라는 함수를 사용함
     * +,- 연산자를 이용해서 특정 요소를 추가하거나 제거할 수 있는데,
     * 제거시 반드시 키를 지정해야 함
     */

    var names21 = mapOf(1 to "혜교", 2 to "지현", 3 to "수지", Pair(4,"길동"))
    for (i in 1..names21.size) print("${names21[i]} ")
    println()

    var names22 = mutableMapOf(1 to "혜교", 2 to "지현", 3 to "수지")
    for (i in 1..names22.size) print("${names22[i]} ")
    println()

    var names23 = names22
    names23[4] = "길동"    // 새로운 데이터 추가
    names23.put(5,"영희")
    names23[1] = "철수"    // 기존 데이터 수정
    for (name in names23) print("${name.key}:${name.value} ")
    println()

    var names24 = names23 + (6 to "지은")
    for (name in names24) print("${name.key}:${name.value} ")
    println()

    var names25 = names24 - 3
    for (name in names25) print("${name.key}:${name.value} ")
    println()

}