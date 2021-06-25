import java.time.Year

fun main() {
    runSimulation()
}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("Construction cost: ${cost * numBuildings}")
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = Year.now()
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}