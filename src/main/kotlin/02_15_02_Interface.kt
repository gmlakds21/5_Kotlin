/* 추상 클래스
 * abstract 라는 키워드로 선언한 클래스
 * 추상 메서드는 반드시 자식클래스에서 재정의를 해야 함
 * 추상클래스 구현시 ':추상클래스명()' 형태로 사용
 */
abstract class Terran {
    var hp = 10
    var mp = 20

    abstract fun attack()
}

class Marine : Terran() {
    override fun attack() = println("마린이 공격중...")
}

class FireBat : Terran() {
    override fun attack() = println("파이어뱃이 공격중...")
}

/* 인터페이스
 * interface 라는 키워드로 추상메서드 구성된 클래스 정의
 * 추상메서드는 abstract 라는 키워드를 사용해야 하고
 * 추상메서드는 반드시 자식클래스에서 재정의를 해야 함
 * 인터페이스 구현시 ':인터페이스명' 형태로 사용, 괄호는 사용하지 않음
 * 단일 객체로 사용하기 때문에 object 로 사용해도 된다. class 로 사용해도 됨
 */

interface Service {
    abstract fun newOne()
    abstract fun read()
    abstract fun readOne()
    abstract fun modify()
    abstract fun remove()
}

object ServiceImpl : Service {
    override fun newOne() = println("newOne")
    override fun read() = println("read")
    override fun readOne() = println("readOne")
    override fun modify() = println("modify")
    override fun remove() = println("remove")
}

fun main() {

    // 추상 클래스
    var t1:Terran = Marine()
    t1.attack()
    var t2:Terran = FireBat()
    t2.attack()

    // interface
    ServiceImpl.newOne()
    ServiceImpl.read()
    ServiceImpl.readOne()
    ServiceImpl.modify()
    ServiceImpl.remove()
}