package calculator

import java.util.regex.Pattern

class Calculators {
    private val DELIMETERPATTERN = "//(.*)\\\\n(.*)"
    private val pattern = Pattern.compile(DELIMETERPATTERN)

    // 입력받은 문자열로부터 숫자 추출
    fun extractNumber(text: String): List<String> {
        var delimiter = mutableListOf(",",":")
        var numbers = text

        if(numbers.isNullOrEmpty()) return emptyList()

        val matcher = pattern.matcher(numbers)

        if(matcher.find()) {
            val customDelimiter = matcher.group(1)
            if(customDelimiter.isNotEmpty()) {
                delimiter.add(customDelimiter)
            }
            numbers = matcher.group(2)
        }

        val numberTokens = numbers.split(*delimiter.toTypedArray())

        return numberTokens
    }

    // 잘못된 입력에 대한 예외 처리
    fun validateNumber(numberTokens: List<String>): List<Int> {
        var returnNumbers = mutableListOf<Int>()
        var negativeNum = mutableListOf<Int>()
        for(token in numberTokens) {
            if(token == ""){
                continue
            }

            var tempNum = try {
                token.toInt()
            } catch (e: NumberFormatException) {
                throw IllegalArgumentException("[ERROR] 잘못된 형식의 문자열 : $token")
            }

            if (tempNum < 0) {
                negativeNum.add(tempNum)
            } else {
                returnNumbers.add(tempNum)
            }
        }
        if (negativeNum.size > 0) {
            throw IllegalArgumentException("[ERROR] 음수 입력: $negativeNum")
        }

        return returnNumbers
    }

    fun sumNumbers(numbers: List<Int>): Int {
        var sum = 0
        for (number in numbers) {
            sum += number
        }

        return sum
    }
}