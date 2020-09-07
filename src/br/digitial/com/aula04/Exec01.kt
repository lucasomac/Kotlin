package br.digitial.com.aula04

fun main() {
    print(q1(23, 56, 89))
}

fun q1(a: Int, b: Int, c: Int): Int {
    if (a > b && b > c) {
        return a
    } else {
        if (c > a) {
            return c
        } else {
            return b
        }
    }
}

fun q2(a: String, b: String): Boolean {
    return a.equals(b)
}

fun q3(a: Int): Boolean {
    return a % 2 == 0;
}

fun q4() {
    for (num in 1..200 step 2) {
        print(num)
    }
}

fun q5(a: Int, b: Int, c: Int, d: Int): Boolean {
    return (a > c && a > d) || (b > c && b > d);
}

fun q6() {
    for (num in 1..200) {
        print(num)
    }
}