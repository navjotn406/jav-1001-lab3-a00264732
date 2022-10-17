import java.util.*
import javax.print.attribute.standard.Sides

class die {
    var name:String = ""
    var sidesCount:Int = 0
    var currentsideUp = 1

    constructor() {
        name = "d6"
        sidesCount = 6
        rolling()
    }

    constructor(noOfSides: Int) {
        name = "d" + noOfSides
        sidesCount = noOfSides
        rolling()
    }

    constructor(name: String, noOfSides: Int) {
        this.name = name
        sidesCount = noOfSides
        rolling()
    }

    fun rolling(){
        val random = Random()
        currentsideUp = random.nextInt(sidesCount) + 1
    }
}