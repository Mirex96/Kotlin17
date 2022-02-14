// 6. Написать функцию, которая на вход принимает массив чисел.
// Если все числа деляется на 2 вернуть true, иначе false. Дескриптор: (Array<Int>) -> Boolean
fun main() {
    val array = arrayOf(2, 4, 6, 8)
    println(check(array))
}

fun check(array: Array<Int>): Boolean {
    if (array.size % 2 == 0) {
        return true
    }
    return false
}









