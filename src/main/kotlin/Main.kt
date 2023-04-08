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

    println("----------") */

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


}