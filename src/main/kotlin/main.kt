import kotlin.math.*

fun main() {

    var userResponse = 0
    println("Here are a few shapes you can find the area of.")

    do {
        println("Pick a shape.")

        println("1) Square")
        println("2) Rectangle")
        println("3) Triangle")
        println("4) Circle")
        println("5) Exit")

        println("Enter Number Choice: ")
        userResponse = readln().toInt()

        if(userResponse == 1)
        {
            println("Enter the side length of the square.")
            var side = readln().toDouble()
            squareArea(side)
        }

        if(userResponse == 2){
            println("Enter the length of the rectangle.")
            var length = readln().toDouble()
            println("Now enter the width of the rectangle.")
            var width = readln().toDouble()
            rectangleArea(length, width)
        }

        if(userResponse == 3){
            println("Enter the base length of the triangle.")
            var base = readln().toDouble()
            println("Now enter the height of the triangle.")
            var height = readln().toDouble()
            triangleArea(base, height)
        }

        if(userResponse == 4)
        {
            println("Enter the radius of the circle.")
            var rad = readln().toDouble()
            circleArea(rad)
        }

        if(userResponse != 5) {
            println("Press 0 to return to the menu and 6 to exit.")
            userResponse = readln().toInt()
        }

    } while (userResponse != 5)

}

fun squareArea(sideLength: Double){
    println("The area of a square with side length $sideLength is ${sideLength * sideLength}.")
}

fun rectangleArea(length: Double, width: Double){
    println("The area of a rectangle with length $length and width $width is ${length * width}.")
}

fun triangleArea(base: Double, height: Double){
    println("The area of a triangle with base $base and height $height is ${(base * height) / 2}.")
}

fun circleArea(radius: Double){
    val area = PI * (radius * radius)
    println("The area of a circle with radius $radius is $area.")
}