class Country(name: String, capital: String){
    var name: String
    var capital: String
    init {
        this.name = name
        this.capital = capital
    }

    fun display(){
        println("$name: $capital")
    }
}

fun main(){
    val countries = listOf(
        Country("Algeria", "Algiers"),
        Country("Egypt", "Cairo"),
        Country("Liberia", "Monrovia"),
        Country("Libya", "Tripoli"),
        Country("Mali", "Bamako"),
        Country("Morocco", "Rabat"),
        Country("Nigeria", "Abuja"),
        Country("Saudi Arabia", "Riyadh"),
        Country("Sudan", "Khartoum"),
        Country("Bahrain", "Manama"),
    )
    var round = 1
    while (true){
        var randomNumbers = (0..9).shuffled().take(3) // here we can take 3 unique random number
        var score = 3
        for(i in 0..2){
            print("Can you guess the capital city of ${countries[randomNumbers[i]].name}: ")
            val answer = readLine()
            if (answer == countries[randomNumbers[i]].capital)
                println("Great")
            else{
                println("Wrong answer, the answer is: ${countries[randomNumbers[i]].capital}")
                score--
            }
        }
        println("Thank for play. Your score is: $score/3")
        print("Do you want to play again? (y|n)")
        val answer2 = readLine()
        if(answer2 != "y"){
            break
        }
        round++
        println("Round $round")
    }
    print("Good bye")
}