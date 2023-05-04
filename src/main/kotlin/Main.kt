fun main() {
    // Урок 7.4 Многомерные массивы

    val n = readln().toInt()     //Побочная диагональ. Заполнить массив:
    val arr = Array(n) {         //числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
        Array(n) { 0 }           //числа, стоящие выше этой диагонали, равны 0
                                //числа, стоящие ниже этой диагонали, равны 2
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i + j == n - 1) {
                arr[i][j] = 1
            } else if (i + j > n - 1) {
                arr[i][j] = 2
            } else {
                arr[i][j] = 0
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${arr[i][j]} ")
        }
        println()
    }

    println("----------")

    val n0 = readln().toInt()         //вводим число строк и столбцов
    val arr0 = Array(n) {               //является ли двумерный массив симметричным относительно главной диагонали
        Array(n0) { 0 }
    }
    for (i in 0 until n0) {
        val s = readln().split(' ').toTypedArray()
        for (j in 0 until n0) {
            arr0[i][j] = s[j].toInt()
        }
    }
    var simmetry = true
    for (i in 0 until n0) {
        for (j in 0 until n0) {
            if (arr0[i][j] != arr0[j][i]) {
                simmetry = false
                break
            }
        }
    }
    if (simmetry) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val s = readln().split(' ')  //вводим через пробел значения m и n - количество строк и столбцов,
                                            // выводим таблицу умножения
    val n7 = s[0].toInt()
    val m7 = s[1].toInt()

    val arr7 = Array(n) {
        Array(m7) { 0 }
    }
    for (i in 0 until n) {
        for (j in 0 until m7) {
            arr7[i][j] = (i + 1) * (j + 1)
        }
    }
    for (i in 0 until n7) {
        for (j in 0 until m7) {
            print("${arr7[i][j]} ")
        }
        println()
    }

    println("----------")

    val s9 = readln().split(' ')  //Треугольник Паскаля
    // Дано число строк и столбцов. Заполните его по следующим правилам: Числа, стоящие в строке 0 или в столбце 0 равны 1.
    // Для всех остальных элементов массива - элемент равен сумме двух элементов, стоящих слева и сверху от него.
    val n9 = s9[0].toInt()
    val m9 = s9[1].toInt()
    val arr9 = Array(n) {
        Array(m9) { 0 }
    }
    for (i in 0 until n9) {
        for (j in 0 until m9) {
            if (i == 0 || j == 0) {
                arr9[i][j] = 1
            } else {
                arr9[i][j] = arr9[i - 1][j] + arr9[i][j - 1]
            }
        }
    }
    for (i in 0 until n9) {
        for (j in 0 until m9) {
            print("${arr9[i][j]} ")
        }
        println()
    }

    println("----------")

    val s5 = readln().split(' ')    //вводим число строк и столбцов
    //В метании молота состязается n спортcменов.
    // Каждый из них сделал m бросков.
    // Победителем считается тот спортсмен, у которого сумма результатов по всем броскам максимальна.
    val n5 = s[0].toInt()
    val m5 = s[1].toInt()

    val arr5 = Array(n5) {
        Array(m5) { 0 }
    }

    for (i in 0 until n) {
        val ss = readln().split(' ').toTypedArray()
        for (j in 0 until m5) {
            arr[i][j] = ss[j].toInt()
        }
    }

    var maxSum = 0
    var maxIndex = 0

    for (i in 0 until n) {
        var sum = 0
        for (j in 0 until m5) {
            sum += arr[i][j]
        }

        if (sum > maxSum) {
            maxSum = sum
            maxIndex = i
        }
    }
    println(maxSum)
    println(maxIndex)

    println("----------")


}