fun main() {
    val likes = 1;

    var people = if (likes % 100 == 11) {
        "людям"
    } else if (likes % 10 == 1) {
        "человеку"
    } else {
        "людям"
    }

    println("Понравилось $likes $people")
}