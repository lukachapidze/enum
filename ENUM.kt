
enum class Directions{
    North,
    South,
    West,
    East
}

enum class Color(var red: Int, val green: Int, val blue: Int ){
    RED(255,255,255),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255)

}
enum class ActionState{
    ACTIVE {
        override fun reverseAction() = INACTIVE
        },
    INACTIVE {
        override fun reverseAction() = ACTIVE
    };
    abstract fun reverseAction(): ActionState
}
fun main(args: Array<String>){
    println("North Enum = ${Directions.North}")
    println(Color.GREEN.toString())
    println("Color dtails.Name = ${Color.GREEN.name}, ordinal : ${Color.GREEN.ordinal}")
    println(Color.valueOf("BLUE"))
    //println(Color.valueOf("BLUE123"))
    for (colorValue in Color.values()){
        println("color value is : $colorValue")
    }
    println(ActionState.ACTIVE.reverseAction())
    println(ActionState.INACTIVE.reverseAction())
}