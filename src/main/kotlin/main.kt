fun main() {
    val likes = 211;

    var people = if (likes == 1 || likes % 100 == 11) {
        "людям"
    } else if (likes % 10 == 1) {
        "человеку"
    } else {
        "людям"
    }

    println("Понравилось $likes $people")
}