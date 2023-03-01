fun main() {
    println("Здравствуй,")
    println("Мир!")

    var a: Int          //Операции производятся справа налево – взять число 5 и записать его в переменную a
    a = 5
    var b = a * 8
    a = a + 10;
    var c: Int = b + a
    println(a)
    println(b)
    println(c)

    var x: Int = 7      //объявили переменную и сразу записали значение
    println(x)

    var y = 17          // Тип данных определяется автоматически
    println(y)

    var m: Int = 6
    var n: Int = m * 8
    m = n - 8
    n = n - 8
    val f = m + n           //  val неизменяемая переменная
    println(f)

    val name: String = "Настя"
    val age: Int = 33
    val weight: Double = 72.5
    val stringToShow: String = name + ", возраст " + age + ", вес " + weight
    println(stringToShow)

    val a1: Int = 5
    val b1: Int = 10
    println(a1 + b1)                // 15,т.к здесь знак + складывает значения

    val s1: String = "5"
    val s2: String = "10"
    println(s1 + s2)                // 510, т.к. здесь знак + склеивает строки


    val firstName = "Anna"           // Примеры хороших имен переменных
    val dayOfWeek = 7
    val currentYear = 2023
    println(firstName + " " + dayOfWeek + " " + currentYear)

    val monthsPerYear = 12
    println("5 + 7 = $monthsPerYear") // 5 + 7 = 12
    println("Количество месяцев в году: $monthsPerYear")
    print("В трех годах ${monthsPerYear * 3} месяцев")
    println("В трех годах \${monthsPerYear * 3} месяцев")












}