import kotlin.math.round

/* 코틀린 클래스
 *
 * 클래스의 객체생성시 new 연산자는 사용하지 않음
 *
 */

class Person1 {

    var name : String = ""
    var age : Int = 0
    // 자바의 멤버변수 정의하듯 클래스를 선언

}

class Person2(var name:String, var age:Int) {
    // 기본 생성자 형태로 멤버변수를 정의함
}

class Person3(var name:String, var age:Int, var add:String) {

    constructor(name:String, age:Int) : this(name,age, "서울")
    // 보조 생성자에서 기본생성자 호출시 this 라는 명령어 사용
    // 기본 생성자가 보조 생성자보다 커야함
}

class Sungjuk (var name: String, var kor:Int, var eng:Int, var mat:Int) {

    // 코틀린에서 자동으로 제공하는 getter 를 쓰지 않고 사용자 정의 getter 를 사용함
    val tot: Int get() { return kor + eng + mat }
    val avg: Double get() { return (tot.toDouble()/3)}
    val grd: Char get() {
        return when(avg.toInt()) {
            in 90..100 -> '수'
            in 80..89 -> '우'
            in 70..79 -> '미'
            in 60..69 -> '양'
            else -> '가'
        }
    }
}

class Member (var mno:String, var name:String, var jumin:String, var userid:String, var passwd:String,
              var zipcode:String, var addr1:String, var addr2:String, var email:String, var phone:String,
              var regdate:String ) {
    constructor(mno:String, name:String, jumin:String, userid:String, passwd:String) :
            this(mno, name, jumin, userid, passwd,"","","","","","")

}

// 클래스 안에 함수를 정의
class Sungjuk2 (var name: String, var kor:Int, var eng:Int, var mat:Int) {

    var tot: Int = 0
    var avg: Double = 0.0
    var grd: Char = '수'

    // 기본생성자 호출후 추가적으로 작업해야 할 내용이 있을 때
    init {
        computeSungJuk();
    }

    fun computeSungJuk( ) {
        this.tot = this.kor + this.eng + this.mat;
        this.avg = this.tot.toDouble()/3;
        this.grd = when(((this.avg)/10).toInt()) {
            10, 9 -> '수'
            8 -> '우'
            7 -> '미'
            6 -> '양'
            else -> '가'
        }
    }
}

fun main( ) {

    var p1 = Person1()
    p1.name = "혜교"
    p1.age = 35
    println("이름 : ${p1.name}, 나이 : ${p1.age}");

    var p2 = Person2("지현", 40)
    println("이름 : ${p2.name}, 나이 : ${p2.age}");

    var p3 = Person3("수지", 50)
    println("이름 : ${p3.name}, 나이 : ${p3.age}, 주소 : ${p3.add}")

    var sj = Sungjuk("학생", 99, 98, 98)
    println("${sj.name} ${sj.kor} ${sj.eng} ${sj.mat} ${sj.tot}" +
            "${String.format("%2f", sj.avg)} ${sj.grd}")

    var mb = Member("01", "회원", "123", "asdasd", "123123")
    println("${mb.mno} ${mb.name} ${mb.jumin} ${mb.userid} ${mb.passwd} ${mb.zipcode} ${mb.addr1}" +
            "${mb.addr2} ${mb.email} ${mb.phone} ${mb.regdate}")

    var sj2 = Sungjuk2("학생2", 99, 98, 98)
    println("${sj2.name} ${sj2.kor} ${sj2.eng} ${sj2.mat} ${sj2.tot}" +
            "${String.format("%2f", sj2.avg)} ${sj2.grd}")

}