class A1<in T>(t: T) {
    fun myFunction(t: T) { }
}
class B1<in T>(t: T) {
//    val x = t
    fun myFunction(t: T) { }
}
abstract class C1<in T> {
//    fun myFunction(): T { }
}
class E1<in T>(t: T) {
//    var y = t
    fun myFunction(t: T) { }
}

/*
ОТВЕТЫ
1+
2-
3-
4-
ВСЕ ВЕРНО
 */