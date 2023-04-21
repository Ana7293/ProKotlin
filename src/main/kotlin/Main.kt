fun main() {
    // Урок 6.2 Строки
 val syr: String = readln()                //Количество слов
    val countChar: Int = syr.length

    var countA = 0
    for (index in 0 until countChar) {
        if (syr[index] == ' ') {
            countA++
        }
    }
    println(countA + 1)

    println("---------")

    val s1: String = readln()                //Перевертыш
    val countChar1: Int = s1.length

    for (index in countChar1-1  downTo 0) {
        print(s1[index])
    }

    println("---------")

    val s5: String = readln()               //Дана строка. Удалите k-ый символ в ней.
    val n5r: Int = readln().toInt()
    val countChar2r: Int = s5.length

    for (index in 0..countChar2r - 1) {
        if (index == n5r - 1) {
            continue
        }
        print(s5[index])
    }

    println("---------")

    val s6: String = readln()        //Какой символ встречается раньше?
    val countChar2: Int = s6.length
    var n5: Int = s6.length
    var n6: Int = s6.length
    for (index in 0..countChar2 - 1) {
        if (s6[index] == 'x') {
            n5 = index
        }
        if (s6[index] == 'w') {
            n6 = index
        }
    }
 if (n5 < n6) {
     print("x")
 } else if (n5 > n6) {
     print("w")
 } else {
     print("-1")
 }
    println("---------")

    val s7: String = readln()               //Палиндром?
    val x1: String = s7.reversed()

 if (s7 == x1) {
     println("YES")
 } else {
     println("NO")
 }

    println("---------")

    val s = readln()            //Две одинаковые буквы

    for (i in 0 until s.length) {
        var flag = false
        for (j in i + 1 until s.length) {
            if (s[i] == s[j]) {
                println(s[i])
                flag = true
            }
        }

        if (flag) break
    }

    println("---------")

    val s0r: String = readln()               //Определить, является ли введенное слово идентификатором
    val x0r: Int = s0r.length

    var ident = s0r[0] > 64.toChar() && s0r[0] < 90.toChar() || s0r[0] == 95.toChar() || s0r[0]> 96.toChar() && s0r[0] < 123.toChar()

     for (j in 0 until x0r) {

         val tex = s0r[j] > 64.toChar() && s0r[j] < 90.toChar() || s0r[j]> 96.toChar() && s0r[j] < 123.toChar()
         val sim = s0r[j] == 95.toChar()
         val num = s0r[j] > 47.toChar() && s0r[j] < 58.toChar()
         if (!tex && !sim && !num) {
             ident = false
             break
         }
     }
    if (ident) {
        println("YES")
    } else {
         println("NO")
     }

    println("---------")

    val s0: String = readln()               //между словами оставить только один пробел
    val x0: Int = s0.length

    for (index in 0 until x0) {
        if (s0[index] == ' ' && s0[index+1] == ' ') {
            continue
        }
        print(s0[index])
    }

    println("---------")

    }

