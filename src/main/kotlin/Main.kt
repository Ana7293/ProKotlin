fun main() {
    // Урок 5.7 Вложенные циклы

    /*  for (k in 1..3)  // выполняется 3 раза
     {
          for (i in 1..6) {
               print(5.toString() + " ")   // вывод на одной строке
          }
          println()      // переводим курсор на следующую строку. После того как вывели всю строку!
     }

     println ("----------")

     val star = readln().toInt()    //На отрезке натуральных чисел от a до b, найдите числа, количество делителей которых не меньше k.
     val fin = readln().toInt()
     val pun = readln().toInt()
     var countK = 0
     for (i in star..fin) {
          var con = 0
          for (j in 1..i) {
               if (i % j == 0) {
                    con++
               }
          }
          if (con >= pun) {
               print("$i ")
          }
     }
     println("")
    println("----------")

     val no = readln().toInt()    //Посчитать, сколько раз встречается цифра 7 в последовательности чисел от 1 до N, включая N.
     var counto = 0

     for (io in 1..no) {
          var to = io

          while(to != 0) {
               val lastDigito = to % 10
               if (lastDigito == 7) {
                    counto++
               }
               to = to / 10
          }
     }
     println(counto)

     println("----------")

    val n = readln().toInt()   //найдите число, наибольшее по сумме цифр. Вывести это число и сумму его цифр.
    var max = 0
    var sum = 0

    for (i in 1..n) {
        var tSum = 0
        var t = i
        while (t > 0) {
            tSum += t % 10
            t = t / 10
        }

        if (tSum > sum) {
            sum = tSum
            max = i
        }
    }

    println("$max $sum")

    println("----------")

    var ner = readln().toInt()  //Вывести представление целого числа N в виде произведения простых чисел.
    var i = 2

    while (ner > 1) {
        while(ner % i == 0) {
            print("$i ")
            ner = ner / i
        }
        i++
    }

    println("----------")

   // Урок 5.8 Операторы break и continue

    for (n in 1..10) {     //будет печатать только нечетные числа из-за срабатывания оператора continue
        if (n % 2 == 0) {
            continue
        }
        if (n == 7) {           //Цикл прекратит выполняться, когда n станет равно 7
            break
        }

        println(n)
    }

    println("----------")

    var ng = 1                //также будет печатать только нечетные числа из-за срабатывания continue
    while (ng <= 10) {
        if (ng % 2 == 0) {
            ng++
            continue
        }
        if (ng == 7) {        //Цикл прекратит выполняться, когда n станет равно 7
            break
        }

        println(ng)
        ng++
    }

    println("----------")

    val slon = readln().toInt()            //Вывести максимальный делитель числа N, отличный от N (1вар)
        var bym = 0
        for (j in 1..slon) {
            if (slon % j == 0 && j != slon) {
               bym = j
                continue
            }
        }
        println(bym)

    println("----------")

    val nww = readln().toInt()                   //Вывести максимальный делитель числа N, отличный от N (2вар)

    for (i in nww - 1 downTo 1) {
        if (nww % i == 0) {
            println(i)
            break
        }
    }

    println("----------")

    val nqq = readln().toInt()                      //Вывести максимальный делитель числа N, отличный от N (3вар)
    for (i in 2..nqq) {
        if (nqq % i == 0) {
            println(nqq / i)
            break
        }
    }

    println("----------")


    for (i in 1..100)
    {
        val noch: Int = readln().toInt()
        if (noch < 10) {
            continue
        }
        if (noch > 100) {
            break
            }
        println(noch)
    }

    println("----------")

    var i = 0
    var syt = 0
    while (i + 1 < 10) {
        i = i + 2
        syt = syt + i
        if (syt > 16) {
            break
        }
    }
    i = i + 1
    println(i)

    println("----------")

    val nof: Int = readln().toInt()   //Вывести первое число от 1 до n кратное c, но НЕ кратное d.
    val cof: Int = readln().toInt()
    val dof: Int = readln().toInt()
    for (u in 1..nof ) {
        if ( u % cof == 0 && u % dof != 0) {
            println(u)
            break
    }
    }

    println("----------")

    val rer: String = readln().toString()   //По данной последовательности строк, определите какой по счету встретится строка
    var xz = 1
    while (true) {
        val ter: String = readln().toString()
        if (ter.compareTo(rer) == 0) {
            break
        }
         xz++
    }
     println(xz)

    println("----------")

    val s = readln()    //По данной последовательности строк, определите какой по счету встретится строка (2вар)
    var s1 = readln()
    var count = 1

    while (s != s1) {
        count++
        s1 = readln()
    }

    println(count)

    println("----------")

    // Урок 5.9 Переборы

    val att: Int = readln().toInt()  //Найти и вывести все целые решения квадратного уравнения на отрезке 1 - 10000
    val btt: Int = readln().toInt()
    val ctt: Int = readln().toInt()

    for (x in 1..10000) {
        if (att * x * x + btt * x + ctt == 0) {
            println(x)
        }
    }

    println("----------")

    val ajj: Int = readln().toInt()  //Найти и вывести все целые решения кубического уравнения на отрезке 1 - 10000
    val bjj: Int = readln().toInt()
    val cjj: Int = readln().toInt()
    val djj: Int = readln().toInt()
    for (x in 0..10000) {
        if (ajj * x * x * x + bjj * x * x + cjj * x + djj == 0) {
            println(x)
        }
    }
    println("----------")

    val nof: Int = readln().toInt()   //Вывести все числа от 1 до n кратное c, но НЕ кратное d.
    val cof: Int = readln().toInt()
    val dof: Int = readln().toInt()
    for (u in 1..nof ) {
        if ( u % cof == 0 && u % dof != 0) {
            println(u)
            continue
        }
    }

    println("----------")

    val nyy = readln().toInt()    //Вывести все числа от 1 до n кратное c, но НЕ кратное d (2 вар)
    val cyy = readln().toInt()
    val dyy = readln().toInt()

    for (i in 1..nyy) {
        if (i % cyy == 0 && i % dyy != 0) {
            println(i)
        }
    }

    println("----------")

    var sumyy = 0                           //Анализ трехзначных чисел: кол-во чисел, сумма цифр которых равна 8
    for (i in 100..999) {
        val s = i % 10
        val s1 = i / 10 % 10
        val s2 = i / 100
        if ((s + s1 + s2) == 8) {
            sumyy++
        }
        }
    println(sumyy)

    println("----------")
                                 // которая выводит все двузначные числа, которые равны удвоенному произведению своих цифр.
    for (i in 10..99) {
        val s = i % 10
        val s1 = i / 10

        if (i == s1 * s * 2) {
            println(i)
        }
    }

    println("----------")

    val ass = readln().toInt()    //Сложное кубическое уравнение
    val bss = readln().toInt()
    val css = readln().toInt()
    val dss = readln().toInt()
    val ess = readln().toInt()

    var countss = 0
    for (x in 0..1000) {
        val t = ass * x * x * x + bss * x * x + css * x + dss
        val d = x - ess

        if (d != 0 && t == 0) {
            countss++
        }
    }
    println(countss)

    println("----------")*/

  // Урок 5.10 Минимаксные задачи

    val nqqq: Int = readln().toInt() // количество чисел в последовательности
    var numberqqq: Int
    var maxqqq = 0 // значение 0 заведомо меньше возможных значений последовательности
    for (i in 0 until nqqq) {
        numberqqq = readln().toInt() // очередное число последовательности
        if (numberqqq > maxqqq) // сравниваем текущее число с мах
        {
            maxqqq = numberqqq // если больше, то обновляем мах
        }
    }
    println(maxqqq) // после просмотра всех чисел последовательности, выводим максимальное значение

    println("----------")

    val neee: Int = readln().toInt() // Найдите минимальное среди последовательности целых чисел
    var numbereee: Int
    var mineee = Int.MAX_VALUE
    for (i in 0 until neee) {
        numbereee = readln().toInt()
        if (numbereee < mineee)
        {
            mineee = numbereee
        }
    }
    println(mineee)

    println("----------")

    val nyyy: Int = readln().toInt() // Найдите max среди последовательности целых чисел
    var numberyyy: Int
    var maxyyy = Int.MIN_VALUE
    for (i in 0 until nyyy) {
        numberyyy = readln().toInt()
        if (numberyyy > maxyyy)
        {
            maxyyy = numberyyy
        }
    }
    println(maxyyy)

    println("----------")

    val nppp: Int = readln().toInt()
    var maxppp = 0
    var cntppp = 0
    for (i in 1..nppp) {
        val k: Int = readln().toInt()
        if (k > maxppp) {
            maxppp = k
            cntppp = 1
        } else {
            if (k == maxppp)
                cntppp++
        }
    }

    println(cntppp)

    println("----------")

    val nggg: Int = readln().toInt() // Найдите разницу между мин и макс среди последовательности целых чисел
    var numberggg: Int
    var minggg = Int.MAX_VALUE
    var maxggg = Int.MIN_VALUE
    for (i in 0 until nggg) {
        numberggg = readln().toInt()
        if (numberggg < minggg)
        {
            minggg = numberggg
        }
        if (numberggg > maxggg)
        {
            maxggg = numberggg
        }

    }
    println( maxggg - minggg)

    println("----------")

    val nbbb: Int = readln().toInt()       //Камера наблюдения
    var numberbbb: Int
    var minbbb = 30
    var maxbbb = 0
    for (i in 0 until nbbb) {
        numberbbb = readln().toInt()
        if (numberbbb < 30)
        {
            minbbb = numberbbb
        }
        if (numberbbb > maxbbb)
        {
            maxbbb = numberbbb
        }

    }
    print("$maxbbb ")

    if ( minbbb < 30) {
        print("YES")
    } else {
        print("NO")
    }

    println("----------")







}