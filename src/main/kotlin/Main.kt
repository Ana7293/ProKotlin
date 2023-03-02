fun main() {
    println("Здравствуй,")
    println("Мир!")

    println("----------")

    var a: Int          //Операции производятся справа налево – взять число 5 и записать его в переменную a
    a = 5
    var b = a * 8
    a = a + 10;
    var c: Int = b + a
    println(a)
    println(b)
    println(c)

    println("----------")

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

    println("----------")

    val name: String = "Настя"
    val age: Int = 33
    val weight: Double = 72.5
    val stringToShow: String = name + ", возраст " + age + ", вес " + weight
    println(stringToShow)

    println("----------")

    val a1: Int = 5
    val b1: Int = 10
    println(a1 + b1)                                          // 15,т.к здесь знак + складывает значения

    val s1: String = "5"
    val s2: String = "10"
    println(s1 + s2)                                          // 510, т.к. здесь знак + склеивает строки

    println("----------")

    val firstName = "Anna"                                    // Примеры хороших имен переменных
    val dayOfWeek = 7
    val currentYear = 2023
    println(firstName + " " + dayOfWeek + " " + currentYear)

    println("----------")

    val monthsPerYear = 12                                   // форматирование
    println("5 + 7 = $monthsPerYear") // 5 + 7 = 12
    println("Количество месяцев в году: $monthsPerYear")
    print("В трех годах ${monthsPerYear * 3} месяцев")
    println("В трех годах \${monthsPerYear * 3} месяцев")

    println("----------")

    println("Привет! Как тебя зовут?")
    val newName: String = readln()                             // пользователь вводит свое имя. Сохраняем в переменную "name"
    println("Привет, $newName")                                // приветствуем пользователя. Вместо переменной подставиться его значение, то есть то что ввел пользователь.
    println("Исполню три твоих желания. Загадывай!")
    val raw1: String = readln()
    val raw2: String = readln()
    val raw3: String = readln()
    println("1 " + raw1 + " 2 " + raw2 + " 3 " + raw3)

    val name1 = readln()
    println("Привет, $name1")                                   // используем форматирование

    val bookName = readln()
    println("$bookName - лучшая книга!")

    var row = readln()                                       //  \n - символ, который является переносом строки
    row = "${readln()}\n$row"
    row = "${readln()}\n$row"
    println(row)

    val raaw1: String = readln()
    val raaw2: String = readln()
    val raaw3: String = readln()
    println(raaw3)
    println(raaw2)
    println(raaw1)



}