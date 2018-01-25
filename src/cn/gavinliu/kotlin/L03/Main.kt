package cn.gavinliu.kotlin.L03

class Main(private var age: Int,
           private var name: String) {

    var firstProperty = "First property: $name".also(::println)
        set(value) {
            secondProperty = value
        }

    init {
        println("First initializer block that prints ${name}")
    }

    var secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

    private fun getAge(): Int {
        return this.age
    }

}

fun main(args: Array<String>) {
    val main = Main(10, "Hello")
}