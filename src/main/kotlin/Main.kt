fun main() {
    // 7.1 Одномерные массивы

    val numbers = Array(5) { 0 }
    numbers[0] = 5              // записать в первый элемент массива 5
    numbers[1] = 2
    numbers[4] = 3
    // numbers[5] = 2 // ошибка, индекс вне границ массива
    println(numbers[0]) // вывести первый элемент массива

    println("----------")

    val numbers1 = arrayOf(5, 2, 0, 0, 3)
    println(numbers1[0]) // вывести первый элемент массива

    println("----------")

    val n0: Int = readln().toInt() // сколько чисел будут вводиться на следующей строке
    val s0: String = readln() // сохранить всю введенную строку
    val ss0: Array<String> = s0.split(' ')
        .toTypedArray() // разделить введенную строку по пробелам, преобразовать в массив строкового типа и сохранить
    val numbers2 = Array<Int>(n0, { 0 }) // заводим новый массив чисел целого типа размером n
    for (i in 0 until n0) { // так как у нас в массиве n чисел, то проходим по нему циклом
        val number2: Int = ss0[i].toInt() // конвертируем в число
        numbers2[i] = number2 // записываем в соответствующее место сконвертированное число
        print(numbers2[i].toString() + " ")
    }
    println()
    println("----------")

    val n1: Int = readln().toInt()    //выведет элементы массива, индексы которых кратны трем
    val s1: String = readln()
    val ss1: Array<String> = s1.split(' ').toTypedArray()

    val numbers30 = Array<Int>(n1, { 0 })
    for (i in 0 until n1) {
        val number3: Int = ss1[i].toInt()
        if (i % 3 == 0) {
            numbers30[i] = number3
            print(numbers30[i].toString() + " ")
        }
    }

    println("----------")

    val n20: Int = readln().toInt()    //выведет элементы массива, которые кратны трем
    val s20: String = readln()
    val ss20: Array<String> = s20.split(' ').toTypedArray()

    val numbers3 = Array<Int>(n20, { 0 })
    for (i in 0 until n20) {
        val number3: Int = ss20[i].toInt()
        numbers3[i] = number3
        if (number3 % 3 == 0) {
            print(numbers3[i].toString() + " ")
        }
    }

    println("----------")

    val a = arrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    val n8 = 10
    for (i in 0 until n8) {
        val k: Int = a[i]
        a[k] = 0
        print(a[i].toString() + " ")
    }

    println("----------")


    val n2: Int = readln().toInt()    //Количество элементов, больших предыдущего (1 вар)
    val s2: String = readln()
    val ss28: Array<String> = s2.split(' ').toTypedArray()

    for (i in 0 until n2) {
        val ss: Int = ss28[i].toInt()
    }
    var cnt8 = 0
    for (i in 1 until n2) {
        if (ss28[i] > ss28[i - 1]) {
            cnt8++
        }
    }
    println(cnt8)

    println("----------")

    val n7 = readln().toInt()    //Количество элементов, больших предыдущего (2 вар)
    val s7 = readln().split(' ').toTypedArray()

    val ss7 = Array(n7) { 0 }

    for (i in 0 until n7) {
        ss7[i] = s7[i].toInt()
    }

    var count7 = 0
    for (i in 1 until n7) {
        if (ss7[i] > ss7[i - 1]) {
            count7++
        }
    }
    println(count7)

    println("----------")

    val n67 = readln().toInt()                                //Переставить соседние элементы (1 вар)
    val s67 = readln().split(' ').toTypedArray()

    val ss67 = Array(n67) { 0 }
    val ss267 = Array(n67) { 0 }

    for (i in 0 until n67) {
        ss67[i] = s67[i].toInt()
    }
    for (i in 0 until n67) {
        if (i % 2 == 0 && i < n67 - 1) {
            ss67[i] = s67[i + 1].toInt()

        } else if (i % 2 != 0) {
            ss67[i] = s67[i - 1].toInt()
        } else {
            ss67[i] = s67[i].toInt()
        }
        print(ss67[i].toString() + " ")
    }

    println("----------")

    val n54 = readln().toInt()                    //Переставить соседние элементы (2 вар)
    val s54 = readln().split(' ').toTypedArray()

    val ss54 = Array(n54) { 0 }

    for (i in 0 until n54) {
        ss54[i] = s54[i].toInt()
    }
    for (i in 0 until n54) {
        if (i % 2 == 1) {
            val t = ss54[i - 1]
            ss54[i - 1] = ss54[i]
            ss54[i] = t
        }
    }
    for (i in 0 until n54) {
        print("${ss54[i]} ")
    }

    println("----------")

    val s99: String =
        readln()                               //сравнить соседние элементы и вывести количество подходящих элементов
    val ss99: Array<String> = s99.split(' ').toTypedArray()
    val n99: Int = ss99.size
    val array = Array<Int>(n99) { 0 }
    for (i in 0 until n99) {
        array[i] = ss99[i].toInt()
    }
    var cnt = 0
    for (i in 1 until n99 - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            cnt++
        }
    }
    println(cnt)

    println("----------")

    val n11 = readln().toInt()                                //Есть ли два элемента с одинаковыми знаками (1вар)
    val s11 = readln().split(' ').toTypedArray()
    var c = 0
    val ss11 = Array(n11) { 0 }

    for (i in 0 until n11) {
        ss11[i] = s11[i].toInt()
    }
    for (i in 0 until n11 - 1) {
        if (ss11[i] > 0 && ss11[i + 1] > 0 || ss11[i] < 0 && ss11[i + 1] < 0) {
            c++
        }
    }
    if (c > 0) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val n44 = readln().toInt()                    //Есть ли два элемента с одинаковыми знаками (2вар)
    val s44 = readln().split(' ').toTypedArray()

    val ss44 = Array(n44) { 0 }

    for (i in 0 until n44) {
        ss44[i] = s44[i].toInt()
    }

    var count = 0
    for (i in 1 until n44) {
        if (ss44[i] * ss44[i - 1] > 0) {
            count++
        }
    }
    if (count > 0) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val n = readln().toInt()                                //Циклический сдвиг вправо
    val s = readln().split(' ').toTypedArray()
    val ss = Array(n) { 0 }
    val ss2 = Array(n) { 0 }
    for (i in 0 until n) {
        ss[i] = s[i].toInt()
    }
    for (i in 0 until n) {
        if (i == 0) {
            ss2[i] = ss[n - 1]
        } else if (i in 1 until n) {
            ss2[i] = ss[i - 1]
        }
        print(ss2[i].toString() + " ")
    }

    println("----------")

}



