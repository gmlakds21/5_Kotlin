/* object
 * 싱글톤 패턴 코드처럼 단일 객체로 선언하고 싶다면
 * 클래스 정의시 object 를 사용하면 됨
 * 단일 객체로만 생성됨
 */
object Person {
    var name : String = ""
    var age : Int = 0

    fun print() {
        println("$name $age")
    }

}


/* companion object
 * 자바의 static 변수를 만들고 싶다면
 * companion object 블록에 변수를 정의하고
 * 클래스명.변수명으로 호출하면 됨
 *
 * 매소드도 static 으로 선언하게 되면
 * 기존처럼 객체명.매소드명() 으로 매소드를 호출하지않고
 * 클래스명.매소드명() 으로 매소드 호출이 가능
 * object 의 매소드 처럼 사용할 수 있다.
 */
class Counter {
    companion object {

        fun add(): Counter {
            cnt += 1
            return Counter()
        } // Counter 객체 추가시 cnt 를 하나 증가시킴

        var cnt = 0
        // 생성된 Counter 객체의 수를 저장하는 변수수
    }
}


/* data class
 * 자바의 VO 클래스를 만들고 싶다면
 * 클래스 정의시 data 를 사용하면 됨
 * 클래스 내부에 함수는 포함하면 안됨
 */
data class Employee (var empno : String, var fname:String, var lname:String)


/* 코틀린의 클래스 상속
 * 모든 클래스의 조상 클래스는 Any
 * Any 클래스는 기본적으로 equals, toString, hashCode 등의 멤버 베서드로 구성
 * 부모 클래스를 상속시 ':부모클래스()' 형태로 작성함
 * 자식 클래스가 상속받으려면 부모클래스에 open 이라고 선언 해야 함
 * 부모 클래스의 매서드를 재정의하려면 매소드에 open 이라고 선언 해야 함
 */
open class Parent() {
    var name : String = "parents"
    open fun sayHello() {
        println("Hello, World")
    }
    fun sayHello2() {
        println("Hello, World2")
    }
}

class Child : Parent() {
    // 자식 클래스에서 함수 재 정의
    override fun sayHello() = println("Hello, $name")
}

/* 스마트 캐스팅
 * 자손객체를 부모 타입에 대입하는 경우 암시적 형변환이 발생
 * 이것을 스마트 캐스팅이라 함
 * 반면, 부모 객체를 자손 타입에 대입하는 경우 명시적 형변환이 필요
 * as 키워드 사용
 */


fun main( ) {

    // object
    // 단일 객체를 사용하려면 객체 생성과정 불필요!
    Person.name = "혜교"
    Person.age = 35
    Person.print()

    // companion class
    var a = Counter.add()
    var b = Counter.add()
    println ("생성된 Counter 객체수 : " +Counter.cnt)

    // data class
    var emp1 = Employee("1", "Steve", "King")
    var emp2 = Employee("2", "Eric", "Gamma")
    println (emp1.toString())
    println (emp2.toString())

    // 상속 클래스
    var parent = Parent()
    var child = Child()
    println(child.name)
    parent.sayHello()
    child.sayHello()
    child.sayHello2() // override 안해도 사용 가능

    // 스마트 캐스팅
    var p1:Parent = Child()
    var c1:Child = Parent() as Child
    // var c1:Child = Parent() 오류 ! 몇시적 형변환 필요
}