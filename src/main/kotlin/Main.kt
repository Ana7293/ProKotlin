fun main() {
    // Урок 7.3 Одномерные массивы. Вложенности

    val n: Int = readln().toInt()               // есть ли в массиве ХОТЯ БЫ два одинаковых элемента
    val s: String = readln()
    val ss: Array<String> = s.split(' ').toTypedArray()

    val numbers = IntArray(n)
    for (i in 0 until n) {
        val number: Int = ss[i].toInt()
        numbers[i] = number
    }

    var flag = false
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (numbers[i] == numbers[j]) {
                flag = true
            }
        }

        if (flag) break
    }

    if (flag) {
        println("YES")
    } else {
        println("NO")
    }

    println("---------")

    val n1: Int = readln().toInt()               // является ли массив палиндромом
    val s1: String = readln()
    val ss1: Array<String> = s1.split(' ').toTypedArray()

    val numbers1 = IntArray(n)
    for (i in 0 until n) {
        val number: Int = ss[i].toInt()
        numbers[i] = number
    }
    var isPolindrom = true
    for (i in 0 until n / 2) {
        if (numbers[i] != numbers[n - i - 1]) {
            isPolindrom = false
            break
        }
    }
    if (isPolindrom) {
        println("YES")
    } else {
        println("NO")
    }

    println("---------")

    val n2: Int = readln().toInt()           //Выведите те его элементы, которые встречаются в списке только один раз.
    val s2: String = readln()
    val ss2: Array<String> = s2.split(' ').toTypedArray()

    val numbers2 = IntArray(n2)
    for (i in 0 until n2) {
        val number: Int = ss2[i].toInt()
        numbers2[i] = number
    }
    for (i in 0 until n2) {
        var flag = false
        for (j in 0 until n2) {
            if (i != j && numbers2[i] == numbers2[j]) {
                flag = true
            }
        }

        if (!flag) {
            print("${numbers2[i]} ")
        }
    }

    println("---------")

}