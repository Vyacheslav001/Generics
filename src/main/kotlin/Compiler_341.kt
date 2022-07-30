interface A<out T> {
//    fun myFunction(t: T)
}

interface B<out T> {
    val x: T
    fun myFunction(): T
}

interface C<out T> {
//    var y: T
    fun myFunction(): T
}

interface D<out T> {
    fun myFunction(str: String): T
}

abstract class E<out T>(t: T) {
    val x = t
}

    /*
    1+ ошибка
    2+
    3-
    4- ошибка
    5+
     */
