import com.example.edu.Person as User

fun main() {
    println("hello kotlin!")

    // heap 동적 메모리
    val person = User("Kildong", 20);
    val person2 = Person(1, "Kildong", "Programmer")

    println(person)
    println(person.name)
    println(person.age)

}

class Person(val no: Int, val name: String, val jobTitle: String)