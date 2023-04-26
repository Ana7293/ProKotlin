fun main() {
    // Урок 6.3 Итоговый тест

    val s5: String = readln()               //Дана строка. Найдите k-ый символ в ней.
    val n5r: Int = readln().toInt()
    val countChar3: Int = s5.length
    var byk = " "
    if (n5r in 0..countChar3) {
        for (index in 0 until countChar3) {
            if (index == n5r - 1) {
                byk = s5[index].toString()
                println(byk)
                break
            }
        }
    } else println("NO")

    println("---------")

    val z = readln().single()
    val z2 = readln().single()

    if (z2.code > z.code) {
        for (g in z.code..z2.code) {                    //Часть алфавита
            val h: Char = g.toChar()
            print("$h ")
        }
    } else {
        for (g in z2.code..z.code) {
            val h: Char = g.toChar()
            print("$h ")
        }
    }

    println("---------")

    val s18: String = readln()           //Инициалы
    val s28: String = readln()
    val s38: String = readln()
    val x8 = s28[0]
    val x18 = s38[0]

    print(s18 + " " + x8 + "." + x18 + ".")

    println("---------")

    val s9r: String = readln()
    val s8r: String = readln()

    val x77 = s9r[0]
    val x177 = s8r[s8r.length-1]

    if ( x177 == x77) {
        println("YES")
    } else {
        println("NO")
    }

    println("---------")

    val smr66: String = readln()          //Гласные буквы
    val x1 = smr66.length
    var x66 = 0

    for (i in 0 until x1) {
        if (smr66[i].toChar() == 'a' || smr66[i].toChar() == 'e' || smr66[i].toChar() == 'i' || smr66[i].toChar() == 'o' || smr66[i].toChar() == 'u') {
            x66++
        }
    }
    print(x66)
    println("---------")

    val smr: String = readln()          //заменить буквы в строке
    val result = smr.replace(
        'e',
        'i')

     print(result)

    println("---------")

    val s1 = readln()                //Цифры в тексте

    var s2 = ""

    for (i in 0 until s1.length) {
        if (s1[i].code > 47 && s1[i].code < 58 ) {
            print(s1[i] + " ")
        }
    }

    println("---------")

    val n45 = readln().toInt()   //так, чтобы название не содержало xxx
    val s45 = readln()

    var countX = 0
    var countXDelete = 0
    for (i in 0 until s45.length) {
        if (s45[i] == 'x') {
            countX++
        } else {
            countX = 0
        }

        if (countX > 2) {
            countXDelete++
        }
    }

    println(countXDelete)

    println("---------")

    val n = readln().toInt()    //Слишком длинные слова
    var x = ""
    for ( j  in 0 until n) {
        val s = readln()
        val y = s.length
    if (s.length > 10) {
         x = s[0].toString() + (y.toInt() - 2) + s[y - 1].toString()
        println(x)
    } else {
        println(s)
    }
        }

    println("---------")

    val s = readln()   //Азбука Арторзе
    var i = 0
    while (i < s.length) {
        var number = 0
        if (s[i] == '.') {
            number = 0
            i += 1
        } else if (s[i + 1] == '.') {
            number = 1
            i += 2
        } else {
            number = 2
            i += 2
        }

        print(number)
    }

    println("---------")



}