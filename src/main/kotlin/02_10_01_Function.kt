/* 코틀린 함수
 *
 * 함수의 티런 타입이 없는 경우 자바에서는 void 였지만
 * 코틀린에서는 Unit 으로 지정해야 함
 *
 * fun 함수명 (매개변수 : 타입) : 리턴타입 {
 *
 *      함수의 몸체
 * }
 *
 */

fun main( ) {

    /*
     * 코틀린은 함수지향 프로그래밍 언어이기 때문에
     * 자바와는 달리 클래스의 객체화 없이 바로 호출해서 사용할 수 있음
     */
    println("${add1(3,2)} 기본형 ")
    println("${add2(3,2)} return 생략형")
    println("${add3(3,2)} 타입 생략형")
    add4(3,2)
    add5(3,2);
    println("-----------------")


    /* 매개변수의 기본값을 지정할 수 있어서
     * 인자값을 생략한 채로 함수를 호출할 수 있음음
     */
    println("${add6()} 변수값 지정형");
    println("-----------------")


    /* 지명 인자 호출을 사용하면 매개변수의 값을 전달할 때
     * 매개변수 이름을 지정할 수 있음
     * 또한, 매개변수의 순서도 자유롭게 지정할 수 있음
     */
    println("${add3(b=2, a=3)} 지명인자 호출형");
    println("-----------------")

}

// 기본형
fun add1 (a:Int, b:Int ) : Int { return a+b; }

// return 과 { } 를 생략함
fun add2 (a:Int, b:Int) : Int = a+b

// 함수의 리턴타입을 컴파일러에게 추론하게 함
fun add3 (a:Int, b:Int) = a + b;

// void, Unit 의 형태
fun add4 (a:Int, b:Int) : Unit = println("${a+b} void 형태");
fun add5 (a:Int, b:Int) = println("${a+b} void 생략형");

// 변수값 지정형
fun add6 (a:Int =5, b:Int=3) : Int = a+b;
