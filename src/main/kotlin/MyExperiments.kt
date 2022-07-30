fun main() {
    val cats2: Pets<String> = Cats()
}

open class Pets<T>(t: T){}
class Cats : Pets<String>("T"){}