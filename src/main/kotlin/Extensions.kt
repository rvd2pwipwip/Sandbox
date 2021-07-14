val String.numVowels
    get() = count { "aeiouy".contains(it) }

fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun <T> T.easyPrint(): T {
    println(this)
    return this
}

infix fun String?.printWithDefault(default: String) = println(this ?: default)

fun main() {
    "Madrigal has left the building".easyPrint().addEnthusiasm(3).easyPrint()
    42.easyPrint()
    "How many vowels?".numVowels.easyPrint()

    val nullableString: String? = null
    val notNullString = "Dude"

    nullableString printWithDefault "Default string"
    notNullString printWithDefault "Dudette"
}