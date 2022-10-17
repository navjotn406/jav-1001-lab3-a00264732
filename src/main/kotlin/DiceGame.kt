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
}