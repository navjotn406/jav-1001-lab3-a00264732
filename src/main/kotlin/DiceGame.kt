fun main(){
    val d6 = die()
    println("Creating D6 dice")
    println(d6.name + " current side before rolling: " + d6.currentsideUp)
    d6.rolling()
    println(d6.name + " current side after rolling: " + d6.currentsideUp)
    println()

    val d10 = die(10)
    println("Creating "+ d10.name +" dice")
    println(d10.name + " current side before rolling: " + d10.currentsideUp)
    d10.rolling()
    println(d10.name + " current side after rolling: " + d10.currentsideUp)
    println()

    val d20 = die("D20", 20)
    println("Creating "+ d20.name +" dice")
    println(d20.name + " current side before rolling: " + d20.currentsideUp)
    d20.rolling()
    println(d20.name + " current side after rolling: " + d20.currentsideUp)
    println()

    println("Setting " + d20.name + " current side to highest")
    d20.setHighestValue(d20.sidesCount)
    println(d20.name + " highest value in dice: " + d20.currentsideUp)

    val d6dice1 = die()
    val d6dice2 = die()
    val d6dice3 = die()
    val d6dice4 = die()
    val d6dice5 = die()
    var rollCount = 0
    while(true){
        rollCount += 1
        if(
            d6dice1.currentsideUp != d6dice2.currentsideUp ||
            d6dice2.currentsideUp != d6dice3.currentsideUp ||
            d6dice3.currentsideUp != d6dice4.currentsideUp ||
            d6dice4.currentsideUp != d6dice5.currentsideUp)
        {
            d6dice1.rolling()
            d6dice2.rolling()
            d6dice3.rolling()
            d6dice4.rolling()
            d6dice5.rolling()
        }
        else
        {
            println("Yuppie, you got " + d6dice1.currentsideUp + " in all dices after $rollCount...")
            println("Dice 1 current side: " + d6dice1.currentsideUp + "\n"
                    + "Dice 2 current side: " + d6dice2.currentsideUp + "\n"
                    + "Dice 3 current side: " + d6dice3.currentsideUp + "\n"
                    + "Dice 4 current side: " + d6dice4.currentsideUp + "\n"
                    + "Dice 5 current side: " + d6dice5.currentsideUp)
            break;
        }
    }
}