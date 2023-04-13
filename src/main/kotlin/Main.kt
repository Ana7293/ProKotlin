fun main() {
    // 6.1 Символы
    val c: Char = '#'
    val code: Int = c.code
    println(code)                // 35

    val codeNumber: Int = 35
    val c1: Char = codeNumber.toChar()
    println(c1)                   // '#
    println(48.toChar())           // '0'

    val first: Char = 'B'
    val second: Char = 'v'
    println(first < second) // true

    val c2: Char = readln().single()
    if (c2 >= 'A' && c2 <= 'Z')         //если введенный символ лежит в диапазоне от 'A' до 'Z' включительно
    {
        println("Заглавная буква английского алфавита")
    }
    var c3: Char = 'а'
    c3 = c3 + 3        // 'd'

    var b3: Char = '0'
    c3 = c3 + b3.code
    c3 = c3 - b3.code

    for (c4 in 'A'..'Z') {      //если нужно вывести все заглавные буквы латинского алфавита
        println(c4)
    }

    println("----------")

    val b: Char = readln().single()         //Необходимо вывести "YES", если символ является цифрой, и "NO" - в противном случае.
    if (b.code > 47 && b.code < 58 ) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val c5 = readln().single()                   //Необходимо вывести "YES", если символ является цифрой, и "NO" - в противном случае.

    if (c5 >= '0' && c5 <= '9') {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val z = readln().single()
    for (g in 97..z.code) {        //выведите все строчные буквы латинского алфавита, начиная от начала до заданной буквы.
        val h: Char = g.toChar()
        print("$h ")
    }

    println("----------")

    val c6 = readln().single()   //выведите все строчные буквы латинского алфавита, начиная от начала...

    for (i in 'a'..c6) {
        print("$i ")
    }

     println("----------")

    val c7 = readln().single()   //выведите все строчные буквы латинского алфавита от с до конца...

    for (i in c7 ..'z') {
        print("$i ")
    }

    println("----------")

    val c8 = readln().single()          //Изменить регистр символа

    if (c8.code >= 65  && c8.code <= 90) {
        val ret: Int = c8.code + 32
        println(ret.toChar())
    } else if (c8.code >= 97  && c8.code <= 122) {
        val ret2: Int = c8.code - 32
        println(ret2.toChar())
    }

    println("----------")

    val c9 = readln().single()        //Изменить регистр символа
    if (c9 in 'A'..'Z'){
        println(c9.lowercaseChar())
    }else{
        println(c9.uppercaseChar())
    }

    println("----------")

    val c0 = readln().single()                //Изменить регистр символа
    val distance = 'A'.code - 'a'.code

    if (c0 >= 'a' && c0 <= 'z') {
        println(c0 + distance)
    } else {
        println(c0 - distance)
    }

    println("----------")

}