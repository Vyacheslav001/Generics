class PetOwner<T : Pet>(t: T) {
    val pets = mutableListOf(t)

    fun add(t: T) {
        pets.add(t)
    }

    fun remove(t: T) {
        pets.remove(t)
    }
}

fun main() {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catOwner = PetOwner(catFuzz)
    catOwner.add(catKatsu)

    catOwner.pets.forEach {
        print("${it.name} ")
    }
    println()

    val petOwner: PetOwner<Pet> = PetOwner(fishFinny)
    petOwner.add(catFuzz)
    petOwner.pets.forEach {
        print("${it.name} ")
    }
}