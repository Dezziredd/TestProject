var age: Double? = null //глобальная переменная

//Типы данных

//fun main (args: Array<String>) //функциф main
//{
//    val length: Short = 23
//    var Hi: String = "Hello world"
//    var Hi1 = "Hello world!!! "
//    val a: Int = 20
//    var b: Double = 200.500
//    var Num: Float = 4.5f
//    var c = a+b
//    val BigChar: Char = 'C'
//    println("Result = $c")
//    println("$Hi " +  a)
//    println(Hi1 +  c)
//    println("$BigChar++")
//    Num = 4.4f
//    println("$Num")
//    println("$length")
//    println("age-$age")
//    age = 29.746
//    age = age!!%a
//    b += age!! //если переменная была null, то действия с ней производим при написании !! к переменной
//    println("$age")
//    println("age-$b")
//}

//Условные операторы

fun main (args: Array<String>)
{
    var isitTrue: Boolean = false //логическая переменная со значением ложь/истина
    var g: String? = null
    g = "Privet"
    if (g == "Hello"||isitTrue==true) //проверка состояния переменной (isitTrue==true)
    {
        println("g=Hello")
    }
    else if (g == "Privet"&&!isitTrue) //краткая запись проверки состояния переменной (isitTrue==false?)
    {
        println("g=Privet")
    }
    else
    {
        println("false(")
    }
    val age = 50
    when(age)
    {
        null -> println("NULL")
        10 -> println("10")
        23 -> println("23")
        else -> println("It's=$age")
    }
    val x1 = when(age)
    {   null->2
        50->"What's my age again?"
        else->19

    }
    println("$x1")
    var number = 4
//    var x: Int? = null
//    if (number > 0)
//        x = 1
//    else
//        x=0
    var x = if(number>0) 1 else 0 //сокращенная запись if else
    println("x=$x")
}
