package chap02.section2

fun main() {
    val number: Int = 10
    val number2 = 20        // 추론 가능
    val numberOfBooks: Int = 30
    val init: Int   // 아직 사용하지 않았지만 Int형 자료형 갖고 있음. 초기화 전

    var language = "English"    // 문자열
    language = "Korean"

    init = 10   // 초기화

    println("number: $number, number2: $number2, init: $init")
    println("language: $language")
    println("numberOfBooks: $numberOfBooks")
}