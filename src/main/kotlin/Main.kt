fun main() {
    // Урок 5.7 Вложенные циклы

     for (k in 1..3)  // выполняется 3 раза
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


}