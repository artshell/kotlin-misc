package com.artshell.kotlin.what_new_11

typealias OscarWinners = Map<String, String>

fun countLaLaLang(oscarWinners: OscarWinners) = oscarWinners.count { it.value.contains("La La Land") }

// Note that the type names (initial and the type alias) are interchangeable:
fun checkLaLaLandIsTheBestMovie(oscarWinners: Map<String, String>) = oscarWinners["Best picture"] == "La La Land"

fun oscarWinners(): OscarWinners {
    return mapOf(
            "Best song" to "City of Stars (La La Land)",
            "Best actress" to "Emma stone (La La Land)",
            "Best picture" to "Moonlight"
    )
}

fun main(args: Array<String>) {
    val oscarWinners = oscarWinners()
    val laLaLandAwards = countLaLaLang(oscarWinners)
    println("LaLaAwards = $laLaLandAwards (in our small example), but actually it's 6.")

    val laLaLandIsTheBestMovie = checkLaLaLandIsTheBestMovie(oscarWinners)
    println("LaLaLandIsTheBestMovie = $laLaLandIsTheBestMovie")
}