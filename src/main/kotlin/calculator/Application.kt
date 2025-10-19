package calculator

import camp.nextstep.edu.missionutils.Console

fun main() {
    // TODO: 프로그램 구현
    println("덧셈할 문자열을 입력해 주세요.")
    val input = Console.readLine()

    if (input == null) {
        println(0)
        return
    }

    val func = Calculators()

    var extractedNumber = func.extractNumber(input)
    var validatedNumber: List<Int>? = mutableListOf<Int>()
    try {
        validatedNumber = func.validateNumber(extractedNumber)
    } catch (e: IllegalArgumentException) {
        println("${e.message}")
        return
    }

    var result = func.sumNumbers(validatedNumber)

    println("결과: $result")
}