fun main() {
    // Урок 7.2 Одномерные массивы. Работа с индексом

      val nf: Int = readln().toInt() // сколько чисел будут вводиться на следующей строке
      val sf: String = readln() // сохранить все введенную строку
      val ssf: Array<String> = sf.split(' ').toTypedArray() // разделить введенную строку по пробелам и сохранить в массив строкового типа

      val numbersf = IntArray(nf)
      for (i in 0 until nf) {
          val number: Int = ssf[i].toInt()
          numbersf[i] = number
      }
      var maxf = numbersf[0]
      var indexMaxf = 0
      for (i in 1 until nf) {
          if (numbersf[i] > maxf) {
              maxf = numbersf[i]
              indexMaxf = i
          }
      }
      println(maxf)             // Нахождение максимума, и индекса максимума
      println(indexMaxf)

      println("----------")

      val s1: String = readln()        //Выводит перевернутый массив
      val ss1: Array<String> = s1.split(' ').toTypedArray()
      val length: Int = ss1.size
      for (i in 0 until length / 2) {
          val tmp: String = ss1[i]
          ss1[i] = ss1[length - 1 - i]
          ss1[length - 1 - i] = tmp
      }
      for (i in 0 until length) {
          print(ss1[i] + " ")
      }

      println("----------")

      val ng: Int = readln().toInt()    // сколько чисел будут вводиться на следующей строке
      val sg: String = readln()        // сохранить все введенную строку
      val ssg: Array<String> = sg.split(' ').toTypedArray() // разделить введенную строку по пробелам и сохранить в массив строкового типа
      val numbers = IntArray(ng)
      for (i in 0 until ng) {
          val number: Int = ssg[i].toInt()
          numbers[i] = number
      }
      var ming = numbers[0]   //минимальный элемент
      var indexMing = 0
      for (i in 1 until ng) {
          if (numbers[i] < ming) {
              ming = numbers[i]
              indexMing = i
          }
      }
      println(indexMing)    //Индекс минимального элемента

      println("----------")

    val nt: Int = readln().toInt()    //Уменьшить все элементы массива на минимальный элемент
    val st: String = readln()
    val sst: Array<String> = st.split(' ').toTypedArray()
    val numberst = IntArray(nt)
    for (i in 0 until nt) {
        val number: Int = sst[i].toInt()
        numbers[i] = number
    }
    var mint = numbers[0]   //минимальный элемент
    for (i in 1 until nt) {
        if (numbers[i] < mint) {
            mint = numbers[i]
        }
    }
    for (i in 0 until nt) {
        val number: Int = sst[i].toInt()
        numbers[i] = number - mint

        print(numbers[i].toString() + " ")
    }

    println("----------")

    val ny: Int = readln().toInt()    //Разность индексов максимума и минимума
    val sy: String = readln()
    val ssy: Array<String> = sy.split(' ').toTypedArray()
    val numbersy = IntArray(ny)
    for (i in 0 until ny) {
        val number: Int = ssy[i].toInt()
        numbers[i] = number
    }
    var miny = numbers[0]   //минимальный элемент
    var indexMiny = 0       //индекс min
    for (i in 1 until ny) {
        if (numbers[i] < miny) {
            miny = numbers[i]
            indexMiny = i
        }
    }
    var maxy = numbers[0]  //максимальный элемент
    var indexMaxy = 0       //индекс max
    for (i in 1 until ny) {
        if (numbers[i] > maxy) {
            maxy = numbers[i]
            indexMaxy = i
        }
    }
    println( indexMaxy - indexMiny)

    println("----------")

    val sa: String = readln()
    val ssa: Array<String> = sa.split(' ').toTypedArray()
    var cnta = 0
    val na: Int = ssa.size
    for (i in 0 until na) {
        for (j in i + 1 until na) {
            if (ssa[i] == ssa[j]) {
                cnta++
            }
        }
    }
    println(cnta)

    println("----------")

    val nv: Int = readln().toInt()               // Поменять местами первый минимум и последний максимум
    val s: String = readln()
    val ss: Array<String> = s.split(' ').toTypedArray()


    val numbersv = IntArray(nv)
    for (i in 0 until nv) {
        val number: Int = ss[i].toInt()
        numbers[i] = number
    }
    var min = numbersv[0]
    var max = numbersv[0]
    var indexMinv = 0
    var indexMaxv = 0
    for (i in 1 until nv) {
        if (numbers[i] < min) {
            min = numbers[i]
            indexMinv = i
        }
        if (numbers[i] >= max) {
            max = numbers[i]
            indexMaxv = i
        }
    }
    val t = numbers[indexMaxv]
    numbers[indexMaxv] = numbers[indexMinv]
    numbers[indexMinv] = t

    for (i in 0 until nv) {
        print("${numbers[i]} ")
    }

     println("----------")



}