package HashMap

data class User(val id: Int, val name: String)

fun main() {
    val users = HashMap<User, String>()

    val user1 = User(1.hashCode(), "Alice")
    val user2 = User(2.hashCode(), "Bob")

    users[user1] = "Программист"
    users[user2] = "Дизайнер"


    println(users[User(1.hashCode(), "Alice")]) // "Программист" (сработает, т.к. hashCode совпадает)
    println(users[User(2.hashCode(), "Bob")])   // "Дизайнер"
}
