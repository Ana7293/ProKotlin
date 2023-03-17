import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    /*println("Здравствуй,")
    println("Мир!")

    println("----------")

    var a: Int          //Операции производятся справа налево – взять число 5 и записать его в переменную a
    a = 5
    var b = a * 8
    a = a + 10;
    var c: Int = b + a
    println(a)
    println(b)
    println(c)

    println("----------")

    var x: Int = 7      //объявили переменную и сразу записали значение
    println(x)

    var y = 17          // Тип данных определяется автоматически
    println(y)

    var m: Int = 6
    var n: Int = m * 8
    m = n - 8
    n = n - 8
    val f = m + n           //  val неизменяемая переменная
    println(f)

    println("----------")

    val name: String = "Настя"
    val age: Int = 33
    val weight: Double = 72.5
    val stringToShow: String = name + ", возраст " + age + ", вес " + weight
    println(stringToShow)

    println("----------")

    val a1: Int = 5
    val b1: Int = 10
    println(a1 + b1)                                          // 15,т.к здесь знак + складывает значения

    val s1: String = "5"
    val s2: String = "10"
    println(s1 + s2)                                          // 510, т.к. здесь знак + склеивает строки

    println("----------")

    val firstName = "Anna"                                    // Примеры хороших имен переменных
    val dayOfWeek = 7
    val currentYear = 2023
    println(firstName + " " + dayOfWeek + " " + currentYear)

    println("----------")

    val monthsPerYear = 12                                   // форматирование
    println("5 + 7 = $monthsPerYear") // 5 + 7 = 12
    println("Количество месяцев в году: $monthsPerYear")
    print("В трех годах ${monthsPerYear * 3} месяцев")
    println("В трех годах \${monthsPerYear * 3} месяцев")

    println("----------")

    println("Привет! Как тебя зовут?")
    val newName: String = readln()                             // пользователь вводит свое имя. Сохраняем в переменную "name"
    println("Привет, $newName")                                // приветствуем пользователя. Вместо переменной подставиться его значение, то есть то что ввел пользователь.
    println("Исполню три твоих желания. Загадывай!")
    val raw1: String = readln()
    val raw2: String = readln()
    val raw3: String = readln()
    println("1 " + raw1 + " 2 " + raw2 + " 3 " + raw3)

    val name1 = readln()
    println("Привет, $name1")                                   // используем форматирование

    val bookName = readln()
    println("$bookName - лучшая книга!")

    var row = readln()                                       //  \n - символ, который является переносом строки
    row = "${readln()}\n$row"
    row = "${readln()}\n$row"
    println(row)

    val raaw1: String = readln()
    val raaw2: String = readln()
    val raaw3: String = readln()
    println(raaw3)
    println(raaw2)
    println(raaw1)

    val num1: Int = readln().toInt()                         // ввели первое число
    val num2: Int = readln().toInt()                         // ввели второе число
    println(num1 + num2)                                   // посчитали сумму и вывел

    println("----------")

    val a2: Int = 5
    val b2: Int = 2
    println(a2 + b2)                                      //бинарные арифметические операции
    println(a2 - b2)
    println(a2 * b2)

    println("----------")

    println(12 / 3)                                     //Оператор целочисленного деления
    println(12 / 4)
    println(12 / 5)
    println(12 / 6)
    println(12 / 7)
    println(12 / 12)
    println(12 / 14)

    println("----------")

    println(12 % 3)                                 //Оператор деления с остатком
    println(12 % 4)
    println(12 % 5)
    println(12 % 6)
    println(12 % 7)
    println(12 % 12)
    println(12 % 14)

    println("----------")

    val num2: Int = 2 + 2 * 2                        //порядок выполнения (приоритет) операций
    println(num2)
    val num3: Int = (2 + 2) * 2
    println(num3)

    println("----------")

    var k = 0                                        //Унарные арифметические операторы
    var l = 5

    k++
    l--

    println("----------")

    var num4: Int = readln().toInt()     //квадрат числа, считанного с консоли
    println(num4 * num4)

    println("----------")

    var km: Int = readln().toInt()
    println(km / 1000)

    println("----------")

    val st: Int = readln().toInt()          //число в 6 степени
    val st1 = (st * st)
    println(st1 * st1 * st1)

    println("----------")

    val d: Int = readln().toInt()
    val t: Int = readln().toInt()
    val s: Int = readln().toInt()
    println(d * t * s)

    println("----------")

    val students: Int = readln().toInt()
    val apples: Int = readln().toInt()
    val fr = apples / students
    println(fr)

    println("----------")

    val students1: Int = readln().toInt()
    val apples1: Int = readln().toInt()
    val fr1 = apples1 % students1
    println(fr1)

    println("----------")

    val pt: Int = readln().toInt()
    var pt1 = pt + 1
    var pt2 = pt1 + 1
    println(pt)
    println(pt1)
    println(pt2)

    val ph1: Int = readln().toInt()
    val ca1: Int = readln().toInt()
    val he1: Int = readln().toInt()
    val ch1: Int = readln().toInt()

    val ph2: Int = readln().toInt()
    val ca2: Int = readln().toInt()
    val he2: Int = readln().toInt()
    val ch2: Int = readln().toInt()

    val ph3: Int = readln().toInt()
    val ca3: Int = readln().toInt()
    val he3: Int = readln().toInt()
    val ch3: Int = readln().toInt()

    val sum2: Int = ph2 + ca2 + he2 + ch2
    val sum1: Int = ph1 + ca1 + he1 + ch1
    val sum3: Int = ph3 + ca3 + he3 + ch3
    println(sum1 + sum2 + sum3)

    println("----------")

    val rub: Int = readln().toInt()
    val kop: Int = readln().toInt()
    val cakes: Int = readln().toInt()
    val sum = ((rub * 100) + kop) * cakes
    val sumRub: Int = sum / 100
    val sumKop: Int= sum % 100
    println("$sumRub $sumKop")

    println("----------")

    val min: Int = readln().toInt()
    val hour = min / 60
    val ost = (min - hour * 60) % 60
    println("$min мин - это $hour час $ost мин.")

    println("----------")

    val number: Int = readln().toInt()
    val prev = number - 1
    val next=  number + 1
    println("Следующее за числом $number число: $next")
    println("Для числа $number предыдущее число: $prev")

    println("----------")

// урок 3.6 Целые числа
    val number1: Int = 1324
    println(number1 % 10)     // 4 Дано натуральное число, выведите его последнюю цифру.
    println(number1 % 100)    // 24
    println(number1 % 1000)   // 324
    println(number1 % 10000)  // 1324
    println(number1 / 10)     // 132
    println(number1 / 100)    // 13
    println(number1 / 1000)   // 1
    println(number1 / 10000)  //

    println("----------")

    val nst: Int = readln().toInt()         //Дано целое число. Найдите число десятков
    val nst1: Int = nst % 100
    val nst2: Int = nst1 / 10
    println(nst2)

    println("----------")

    val nl = readln().toInt()               //Дано целое число. Найдите число десятков
    print(nl / 10 % 10)

    println("----------")

    val nkl: Int = readln().toInt()         //Дано трехзначное число. Найдите сумму его цифр(1вариант)
    val nkl1: Int = nkl / 100
    val nkl2: Int = nkl / 10 % 10
    val nkl3: Int = nkl % 10
    println(nkl1 + nkl2 + nkl3)

    println("----------")

    val n = readln().toInt()                //Дано трехзначное число. Найдите сумму его цифр(2вариант)
    val n1 = n / 100
    val n2 = n % 100 / 10
    val n3 = n % 10
    println(n1 + n2 + n3)

    println("----------")

    val fn = readln().toInt()                //Дано трехзначное число. Переверните число и выведите.
    val fn1 = fn / 100
    val fn2 = fn % 100 / 10
    val fn3 = fn % 10
    println("$fn3$fn2$fn1")

    // урок 3.7 Данные вещественного (Double) типа
    println("----------")

    val alf: Double = 5.0
    val blf: Double = 2.0

    val sumlf: Double = alf + blf
    val diff: Double = alf - blf
    val mult: Double = alf * blf

    println("$alf + $blf = $sumlf")
    println("$alf - $blf = $diff")
    println("$alf * $blf = $mult")

    println("----------")

    val nm: Int = 5
    val doubleDivider: Double = 2.0
    println(nm / doubleDivider) // 2.5

    println("----------")

    val nj: Int = 7
    val dj: Double = nj.toDouble()        // Целое число n преобразуется в вещественное (Double)
    println(dj)                            // 7.0
    val dj1: Double = 7.9
    val nj1: Int = dj1.toInt()             // Вещественное число d преобразуется в целое (Int)
    println(nj1)                          // 7

    println("----------")

    val du1: Double = 7.9
    val du2: Double = 7.5
    val du3: Double = 7.3

    val nu1: Int = du1.roundToInt()   // Вещественное число d1 преобразуется в целое (Int)
    val nu2: Int = du2.roundToInt()
    val nu3: Int = du3.roundToInt()

    println(nu1)                     // 8 ⬅️
    println(nu2)                     // 8 ⬅️
    println(nu3)                     // 7 ⬅️

    println("----------")

    val radius = readln().toInt()           // Площадь круга
    val pi: Double = 3.14
    val square = pi * radius * radius
    println(square)

    println("----------")

    val katet1 = readln().toDouble()        //Площадь треугольника
    val katet2 = readln().toDouble()
    val squareTriangle = katet1 * katet2 / 2
    println(squareTriangle)

    println("----------")

    val far = readln().toDouble()           //По Фаренгейту
    val cel = (far - 32) * 5 / 9
    println(cel)

    println("----------")

    val kpr = readln().toInt()              //Среднее арифметическое
    val kpr1 = readln().toInt()
    val avr: Double = (kpr.toDouble() + kpr1) / 2
    println(avr)

    println("----------")

    val ap: Int = -9                    //Для нахождения модуля числа используется функция abs
    val bp: Int = Math.abs(ap)
    println(bp)

    val ak: Int = 25
    val moduleA: Int = Math.abs(ak)         // 25. Переменная moduleA целого типа
    println(moduleA)

    val bk: Double = -25.5
    val moduleB: Double = Math.abs(bk)      // 25,5. Переменная moduleB вещественного типа
    println(moduleB)

    println("----------")

    val at: Double = 9.0                // Для нахождения квадратного корня служит функция sqrt
    val bt: Double = sqrt(at)
    println(bt)                          // выводит на экран число 3

    println("----------")

    val au: Double = 3.0                 //Для возведения числа в степень используется функция pow
    val bu: Double = au.pow(3)

    println("----------")

    val aw: Double = 3.1                //Для нахождения максимума или минимума двух чисел служит функция max или min
    val bw: Double = 9.8
    val max: Double = Math.max(aw, bw)   // результат вещественное число!
    println(max)                       // выводит на экран число 9,8

    val dw: Int = 10
    val ew: Int = 25
    val min: Int = Math.min(ew, dw)      // результат целое число!
    println(min)                       // выводит на экран число 10

    println("----------")

    val a: Double = 9.0
    val b: Double = Math.pow(a, 2.0)    // возводим 9 в степень 2
    println(b)                        // выводит на экран число 81

    println("----------")

    val bit = readln().toInt()          //Переведите биты в килобайты (1вар)
    val kByte: Double = bit / 8192.0
    println(kByte)

    val totalBit = readln().toInt()     //Переведите биты в килобайты (2вар)
    val kb = Math.pow(2.0, 13.0)
    println(totalBit / kb)

    println("----------")

    val kat1 = readln().toDouble()          //Найти периметр прямоугольного треугольника с заданными катетами.
    val kat2 = readln().toDouble()
    val gip1: Double = kat1 * kat1 + kat2 * kat2
    val gip: Double = Math.sqrt(gip1)
    println(kat1 + kat2 + gip)

    println("----------")

    val xx1 = readln().toInt()              //определить расстояние между двумя точками, координаты которых заданы.
    val yy1 = readln().toInt()
    val xx2 = readln().toInt()
    val yy2 = readln().toInt()
    val dist1: Double = Math.pow((xx1 - xx2).toDouble(),2.0) + Math.pow((yy1 - yy2).toDouble(),2.0)
    val dist: Double = Math.sqrt(dist1)
    println(dist.toInt())

    println("----------")

    val xxx1 = readln().toInt()              //определить манхеттенское расстояние между двумя точками, координаты которых заданы
    val yyy1 = readln().toInt()
    val xxx2 = readln().toInt()
    val yyy2 = readln().toInt()
    val mod1: Int = Math.abs(xxx1 -xxx2)
    val mod2: Int = Math.abs(yyy1 -yyy2)
    val mod: Int = mod1 + mod2
    println(mod)

    println("----------")

// урок 3.8 Итоговый тест

    val aaa = readln().toInt()              //сумму и произведение трёх целых чисел, введённых с клавиатуры
    val bbb = readln().toInt()
    val ccc = readln().toInt()
    val ssum: Int = aaa + bbb + ccc
    val prod: Int = aaa * bbb * ccc
    print("$ssum $prod")

    println("----------")

    val nlh = readln().toInt()               //Дано целое число. Найдите число сотен(то есть третью справа цифру)
    print(nlh / 100 % 10)

    println("----------")

    val aaa1 = readln().toInt()              //Выведите n-ый член арифметический прогрессии
    val bbb1 = readln().toInt()
    val ccc1 = readln().toInt()
    val ari: Int = aaa1 + bbb1 * (ccc1 - 1)
    print(ari)

    println("----------")

    val alp = readln().toInt()      //Найдите сумму последних трех цифр
    val alp1: Int = alp % 10
    val alp2: Int = alp % 100 / 10
    val alp3: Int = alp % 1000 / 100
    val alp4: Int = alp1 + alp2 + alp3
    print(alp3)

    println("----------")

    val kato1 = readln().toDouble()          //Найдите гипотенузу прямоугольного треугольника с заданными катетами.
    val kato2 = readln().toDouble()
    val gipo1: Double = kato1 * kato1 + kato2 * kato2
    val gipo: Double = Math.sqrt(gipo1)
    print(gipo)

    println("----------")

    // урок 4.1 Условный оператор

        println("Выйти из дома")
        println("Дойти до магазина")
        println("Хлеб есть? Введите Есть или Нет")
        val answer: String = readln()
        if (answer == "Есть") {
            println("Купить хлеб")
        }
        println("Дойти до дома")
        println("Зайти в дом")

    println("----------")

    val xf = readln().toInt()
    if (xf > 10) { // если введенное число больше 10
        println(xf)
    }

    println("----------")

    val xft: Int = readln().toInt()
    if (xft > 0)
    {
        println("Положительное")
    }
    else
    {
        println("Не положительное")
    }

    println("----------")

    val xf1 = readln().toInt()              //Вывести максимальное из двух чисел. Если числа равны, вывести любое из них.
    val xf2 = readln().toInt()
    if (xf1 >= xf2)
    {
        println(xf1)
    }
    else
    {
        println(xf2)
    }

    println("----------")

    val pass1 = readln().toString()              //Напишите программу, которая сравнивает пароль и его подтверждение.
    val pass2 = readln().toString()
    if (pass1 == pass2)
    {
        println("Пароль принят")
    }
    else
    {
        println("Пароль не принят")
    }

    println("----------")

    val age = readln().toInt()              //разрешен пользователю доступ к курсам
    if (age < 12)
    {
        println("Доступ запрещен")
    }
    else
    {
        println("Доступ разрешен")
    }

    println("----------")

    val age0 = readln().toInt()              //Определите, является ли число четным.
    if (age0 % 2 == 0)
    {
        println("YES")
    }
    else
    {
        println("NO")
    }

    println("----------")

    val age1 = readln().toInt()              //Определите, делится ли число без остатка
    val age2 = readln().toInt()

    if (age1 % age2 == 0)
    {
        println("YES")
    }
    else
    {
        println("NO")
    }

    println("----------")

    val nmr = readln().toInt()              //Для данного числа выведите значение sign(x)
    if (nmr < 0)
    {
        println(-1)
    }
    else if(nmr == 0) {
        println(0)
    }
    else
    {
        println(1)
    }

        println("----------")

   // Урок 4.2 Логические операторы

    val xdr: Int = readln().toInt()
    val ydr: Int = readln().toInt()

    if (xdr > 5 && ydr < 10) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val alo: Boolean = true
    val blo: Boolean = true

    var clo: Boolean = alo && blo // true
    clo = !alo && blo             // false
    clo = alo && !blo             // false
    clo = !alo && !blo            // false

    println("----------")

    val xte: Int = readln().toInt()
    val yte: Int = readln().toInt()

    if (xte > 5 || yte < 10) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val amu: Boolean = true
    val bmu: Boolean = true
    var cmu: Boolean = amu || bmu     // true
    cmu = !amu || bmu                 // true
    cmu = amu || !bmu                 // true
    cmu = !amu || !bmu                // false

    println("----------")

    val avc = readln().toInt()
    val bvc = readln().toInt()
    val cvc = readln().toInt()
    if (avc == bvc && bvc == cvc)
    {
        println("YES")
    }
    else
    {
        println("NO")
    }

    println("----------")

    val avcy = readln().toInt()         //определить, является ли заданное натуральное число трёхзначным.
    if (avcy >= 100  && avcy <= 999)
    {
        println("YES")
    }
    else
    {
        println("NO")
    }

    println("----------")

    val avy = readln().toInt()         //определить, принадлежит ли данное число указанному промежутку
    if (avy < -2 || avy > 6   )
    {
        println("Принадлежит")
    }
    else
    {
        println("Не принадлежит")
    }

    println("----------")

    val avy1 = readln().toInt()         //определить, принадлежит ли данное число указанному промежутку
    if (avy1 > -1  && avy1 < 17)
    {
        println("Принадлежит")
    }
    else
    {
        println("Не принадлежит")
    }

    println("----------")

    val guf = readln().toInt()                 // По данному трехзначному числу, определите все ли его цифры различны.
    val guf1: Int = guf % 10   // последн цифра
    val guf2: Int = guf / 10 % 10 // вторая цифра
    val guf3: Int = guf / 100   //первая цифра

    if (guf1 != guf2 && guf1 != guf3 && guf2 != guf3 )
    {
        println("YES")
    }
    else
    {
        println("NO")
    }

    println("----------")

    val nhm = readln().toInt()    // По данному трехзначному числу, определите все ли его цифры различны.

    val chm1 = nhm / 100
    val chm2 = nhm % 100 / 10
    val chm3 = nhm % 10

    if (chm1 == chm2 || chm2 == chm3 || chm1 == chm3) {
        println("NO")
    } else {
        println("YES")
    }

    println("----------")

    val nhz = readln().toInt()           // счастливый билет
    val chz1 = nhz % 1000000 / 100000
    val chz2 = nhz % 100000 / 10000
    val chz3 = nhz % 10000 / 1000
    val chz4 = nhz % 1000 / 100
    val chz5 = nhz % 100 / 10
    val chz6 = nhz % 10
    if ((chz6 + chz5 + chz4) == (chz1 + chz2 + chz3)) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val year1 = readln().toInt() //Год является високосным, если его номер кратен 4, но не кратен 100, или если он кратен 400.
    if (((year1 % 4 == 0) && (year1 % 100 != 0 )) || (year1 % 400 == 0)) {
        println("YES")
    } else {
        println("NO")
    }
    println("----------")

    val ageYou = readln().toInt()           // возраст
    if (ageYou <= 13) {
        println("детство")
    } else if (ageYou > 13 && ageYou <= 24) {
        println("молодость")
    }else if (ageYou > 24 && ageYou <= 59) {
        println("зрелость")
    }else {
        println("старость")
    }

    println("----------")

    val chessX1 = readln().toInt()          //бьет ли ладья за один ход
    val chessY1 = readln().toInt()
    val chessX2 = readln().toInt()
    val chessY2 = readln().toInt()
    if (chessX1 == chessX2 || chessY1 == chessY2) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")

    val chessElX1 = readln().toInt()          //бьет ли слон за один ход
    val chessELY1 = readln().toInt()
    val chessElX2 = readln().toInt()
    val chessElY2 = readln().toInt()
    if (Math.abs(chessElX2 - chessElX1) == Math.abs(chessElY2 - chessELY1)) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------")*/

// урок 4.3 Вложенные условия

    val yfcnz = readln().toInt()                 // Отрезок Принадлежность точки

    if (yfcnz >= -3 && yfcnz <= 1 || yfcnz >= 5 && yfcnz <= 9)
    {
        println("YES")
    }
    else
    {
        println("NO")
    }

    println("----------")

    val weight = readln().toInt()           // вес боксера
    if (weight < 60) {
        println("Легкий вес")
    } else if (weight < 64) {
        println("Первый полусредний вес")
    }else {
        println("Полусредний вес")
    }

    println("----------")

    val cfif1 = readln().toInt()          //сравнить числа
    val cfif2 = readln().toInt()
    val cfif3 = readln().toInt()

    if (cfif1 == cfif2 && cfif1 == cfif3 && cfif2 == cfif3) {
        println("3")
    } else if (cfif1 == cfif2 || cfif1 == cfif3 || cfif2 == cfif3) {
        println("2")
    }else {
        println("0")
    }

    println("----------")

    val aur = readln().toInt()          //сравнить числа
    val bur = readln().toInt()
    val cur = readln().toInt()

    if (aur == bur && bur == cur) {
        print(3)
    } else if (aur != bur && bur != cur && aur != cur) {
        println(0)
    } else {
        println(2)
    }

    println("----------")

    val aur1 = readln().toDouble()          //Координатная четверть
    val bur1 = readln().toDouble()

    if (aur1 > 0 && bur1 > 0) {
        print(1)
    } else if (aur1 < 0 && bur1 > 0) {
        println(2)
    } else if (aur1 < 0 && bur1 < 0) {
        println(3)
    } else {
        println(4)
    }

    println("----------")

    val drug1 = readln().toInt()          //калькулятор
    val drug2 = readln().toInt()
    val znak = readln().toString()

    if (znak == "*") {
        print(drug1 * drug2)
    } else if (znak == "+") {
        println(drug1 + drug2)
    } else if (znak == "-") {
        println(drug1 - drug2)
    } else if (znak == "/") {
        if (drug2 == 0) {
            println("На ноль делить нельзя!")
        } else {
            println(drug1.toDouble() / drug2)
        }
    } else {
        println("Неверная операция")
    }

    println("----------")

    val ura = readln().toDouble()          //Квадратное уравнение
    val urb = readln().toDouble()
    val urc = readln().toDouble()
    val urD: Double = (urb * urb) - (4.0 * ura * urc)
    if (urD < 0 ){
    } else if (urD == 0.0) {
        val urx: Double = (-1 * urb) / (2 * ura)
        println(urx)
    } else if (urD > 0) {
        val urx1: Double = ((-1.0 * urb) - Math.sqrt(urD)) / (2.0 * ura)
        val urx2: Double = ((-1.0 * urb) + Math.sqrt(urD)) / (2.0 * ura)
        val urmax: Double = Math.max(urx1, urx2)
        val urmin: Double = Math.min(urx1, urx2)
        println(urmin)
        println(urmax)
    }

    println("----------")

    val months1 = readln().toInt()           //календарь, используем when
    when (months1) {
        1, 3, 5, 7, 8, 10, 12 -> println("31")
        4, 6, 9, 11 -> println("30")
        2 -> println("29")
    }

    println("----------")

    val months = readln().toInt()               //календарь, используем when-else
    when (months) {
        1, 2, 12  -> println("Зима")
        3, 4, 5 -> println("Весна")
        6, 7, 8  -> println("Лето")
        else -> println("Осень")
    }

    println("----------")

}




