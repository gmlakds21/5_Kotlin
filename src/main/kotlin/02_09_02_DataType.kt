/* kotlin 변수 선언
 *
 * 코틀린 변수형
 * int, double, float, long, short, byte, char, boolean, String
 * any, unit, nothing
 *
 * 변수의 종류에는 가변변수와 불변변수가 있음
 * 가변 변수 : 변수 선언시 var 이라는 키워드 사용
 *              변수에 초기값을 선언한 뒤 나중에 값을 변경 가능
 * 불변 변수 : 변수 선언시 val 이라는 키워드 사용
 *              변수에 초기값을 선언하면 나중에 값을 변경 못함
 *
 * 초기값을 이용한 변수 타입 추론
 * 자바와는 다르게 변수의 타입을 지정하지 않아도 됨
 * 변수의 초기값을 이용해서 변수의 자료형을 컴파잉러가 추론함
 */

fun main( ) {

    /* 변수의 종류에는 가변변수와 불변변수가 있음
     * 가변 변수 : 변수 선언시 var 이라는 키워드 사용
     *              변수에 초기값을 선언한 뒤 나중에 값을 변경 가능
     * 불변 변수 : 변수 선언시 val 이라는 키워드 사용
     *              변수에 초기값을 선언하면 나중에 값을 변경 못함
     */
    val name = "혜교" // 불변
    var kor = 100 // 가변
    var eng = 90
    // val 로 선언한 변수는 값 변경 불가
    // name = "지현"
    kor = 90
    eng = 100


    println("이름은 $name")
    println("국어는 $kor")
    println("영어는 $eng")

    /* 초기값 없이 변수 선언
     * 초기값 없이 변수를 선언하는 경우, 컴파일러는 타입을 추론할 수 없음
     * 따라서, 변수의 타입을 선언해야 함
     * var 변수명:타입, val 변수명:타입
     */
    var mat : Int;
    var tot : Int;
    var avg : Float;
    var grd : Char;

    mat = 90;
    tot = mat + eng + kor;
    avg = (tot/3).toFloat();

    /* 문자열 템플릿
     * 문자열과 변수값을 합쳐서 출력하는 방법
     * 단, 문자열과 변수를 합쳐서 출력하려면 변수명 앞에 $를 붙임
     * 또한, 변수와 문자열을 붙여서 출력하려면 ${}에 변수명을 사용
     */
    println("평균은 $avg")

    /* 사용자로 부터 값 입력받기
     * readline() 함수를 사용해서 사용자 입력값을 처리할 수 있음
     *
     * 타입 형변환
     * 코틀린에서 형 변환은 to 타입명( )으로 간단하게 사용할 수 있음
     *
     * nullable
     * 코틀린의 타입은 기본적으로 null 을 사용할 수 없음 (non-nullable)
     * 따라서, 어떤 변수에 null 이 발생할것 같으면 컴파일 오류를 출력함
     * 이러한 상황을 방지하려면 null safety operation 중 하나임
     * double-bang 연산자를 사용하면 됨
     * 이것을 사용함으로서 비록 null 이 올 수 있는 변수지만
     * null 이 절대 할당되지 않음을 명시
     * 실제로 NullPointException 어디서 발생하는지 알아내는 용도로 사용함
     */
    print("\n")
    print("이름을 입력하세요 : ")
    var name2 = readLine();
    print("국어점수를 입력하세요 : ")
    var kor2 = readLine()!!.toInt();
    print("영어점수를 입력하세요 : ")
    var eng2 = readLine()!!.toInt();
    print("수학점수를 입력하세요 : ")
    var mat2 = readLine()!!.toInt();

    println("이름은 ${name2}이고")
    println("국영수는 ${kor2} ${eng2} ${mat2}이고요")
    println("총점과 평균은 ${kor2+eng2+mat2} ${(kor2+eng2+mat2)/3}입니다.")


    /* null 값이 들어왔을때 default 값으로 0 을 넣을 수 있도록 함
     * 또한, 안전호출연산자를 이용해서
     * 어떤 변수의 값이 null이면 코드를 실행하고
     * 그렇지 않은 경우 그냥 무시하고 넘어가도록 할 수 있음
     * ex) var name: String? = null // null 을 받아들일 수 있도록 변수 선언
     *      name = name?.capitalize( )
     *      => 만약 name 이 null 이라면 capitalize 함수는 실행하지 않음
     *
     * null 복합연산자(일명 엘비스 연산자)를 사용하면
     * 삼항연산자를 이용해서 null 체크에 따른 적절한 값을 대입할 수 있음
     * ex name = name ?: "null 입니다"
     *      => 만약 name 이 null 이라면 "null 입니다." 를 대입
     */
    print("\n")
    print("이름을 입력하세요 : ")
    var name3 = readLine()?.ifEmpty { "혜교" }
    print("국어점수를 입력하세요 : ")
    var kor3 = readLine()?.toInt() ?: 0;
    // null 이 아니면 Int 형으로, null 이면 0 으로
    print("영어점수를 입력하세요 : ")
    var eng3 = readLine()?.toIntOrNull() ?: 0
    // null 이 아니면 Int 형으로, null 이면 null로
    // 그 후에 null 이면 0으로 를 추가로 넣었다.
    print("수학점수를 입력하세요 : ")
    var mat3 = readLine()?.toIntOrNull() ?: 0;

    println("이름은 ${name3}이고")
    println("국영수는 ${kor3} ${eng3} ${mat3}이고요")
    println("총점과 평균은 ${kor3+eng3+mat3} ${(kor3+eng3+mat3)/3}입니다.")
}