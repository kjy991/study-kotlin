
class Account {
    var balance: Long = 0
        private set

    var accountName: String = ""
        get() = "계좌 이름 : $field"

    fun increaseBalance(value: Int) {
        this.balance += value
    }

    fun decreaseBalance(value: Int) {
        this.balance -= value
    }
}

fun main(args: Array<String>) {
    val account = Account()
    account.increaseBalance(100)
    println(account.balance)
}
