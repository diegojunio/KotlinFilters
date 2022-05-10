import java.util.Arrays.*

fun main() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    var eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    println("----------")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    println("----------")

    val newList = filtered.toList()
    println("newList: $newList")

    println("----------")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter{ it[0] == 'p' }.map{
        println("access: $it")
        it
    }

    println("-----")
    println("filtered: ${lazyMap2.toList()}")


}