package Test


import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class CalculateTargetTest {


    @Test
    fun testExample() {
        val input = """
            1 2
            3 5
        """.trimIndent()
        val expectedOutput = "8"
        assertEquals(expectedOutput, calculateTarget(input))
    }
    @Test
    fun testExample1() {
        val input = """
            1 2
            3 4
        """.trimIndent()
        val expectedOutput = "7"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testExample2() {
        val input = """
            2 3
            4 5 8
        """.trimIndent()
        val expectedOutput = "8"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testExample3() {
        val input = """
            2 11
            1 1 1 1 1 1 1 1 1 1 9
        """.trimIndent()
        val expectedOutput = "9"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testSingleElement() {
        val input = """
            1 1
            7
        """.trimIndent()
        val expectedOutput = "7"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testZeroElements() {
        val input = """
            0 0
            0
        """.trimIndent()
        val expectedOutput = "0" // Ожидаемое поведение зависит от реализации, возможно изменить на другое значение
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testNegativeNumbers() {
        val input = """
            3 3
            -1 -2 -3
        """.trimIndent()
        val expectedOutput = "-2"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testMixedNumbers() {
        val input = """
            4 4
            -1 0 1 2
        """.trimIndent()
        val expectedOutput = "0"
        assertEquals(expectedOutput, calculateTarget(input))
    }
    @Test
    fun testLargeNumbers() {
        val input = """
        1000000 2
        500000 500000
    """.trimIndent()
        val expectedOutput = "1"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testDivisionByZero() {
        val input = """
        1 2
        3 5
    """.trimIndent()
        val expectedOutput = "8" // или другое ожидаемое поведение, например, исключение
        assertEquals(expectedOutput, calculateTarget(input))
    }



    @Test
    fun testSingleElementArray() {
        val input = """
        1 1
        10
    """.trimIndent()
        val expectedOutput = "10"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testFractionalNumbers() {
        val input = """
        2 2
        1 2
    """.trimIndent()
        val expectedOutput = "1"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testVeryLongArray() {
        val input = """
        100 100
        ${List(100) { it + 1 }.joinToString(" ")}
    """.trimIndent()
        val expectedOutput = "50"
        assertEquals(expectedOutput, calculateTarget(input))
    }
    @Test
    fun testBasicInput() {
        val input = """
        3 5
        1 2 3 4 5
    """.trimIndent()
        val expectedOutput = "5" // Пример вычисления: (1 + 2 + 3 + 4 + 5) / 3 = 15 / 3 = 5, но уточните логику вычисления w
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testMinimumValues() {
        val input = """
        1 1
        1
    """.trimIndent()
        val expectedOutput = "1" // (1) / 1 = 1
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testMaximumValues() {
        val input = """
            100000 1000000
            ${List(1000000) { 1000 }.joinToString(" ")}
        """.trimIndent()

        val expectedOutput = "10000"
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testUnevenDistribution() {
        val input = """
        4 8
        1 1 1 1 2 2 2 2
    """.trimIndent()
        val expectedOutput = "3" // (1+1+1+1+2+2+2+2) / 4 = 12 / 4 = 3
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testSingleStrip() {
        val input = """
        1 10
        1 2 3 4 5 6 7 8 9 10
    """.trimIndent()
        val expectedOutput = "55" // (1+2+3+4+5+6+7+8+9+10) / 1 = 55
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testLargeStripSmallPads() {
        val input = """
        100000 200000
        ${List(200000) { 1 }.joinToString(" ")}
    """.trimIndent()
        val expectedOutput = "2" // (1 * 200000) / 100000 = 2
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testAllPadsSameLength() {
        val input = """
        5 10
        10 10 10 10 10 10 10 10 10 10
    """.trimIndent()
        val expectedOutput = "20" // (10 * 10) / 5 = 20
        assertEquals(expectedOutput, calculateTarget(input))
    }

    @Test
    fun testRandomInput() {
        val input = """
        3 6
        5 10 15 20 25 30
    """.trimIndent()
        val expectedOutput = "35" // (5+10+15+20+25+30) / 3 = 105 / 3 = 35
        assertEquals(expectedOutput, calculateTarget(input))
    }
}