package Test.Graf

import org.testng.Assert.assertEquals
import org.testng.annotations.Test


class GraphTest {

    @Test
    fun testExample1() {
        val input = """
            10 9
            2 9
            6 9
            1 9
            5 9
            8 9
            10 9
            3 9
            4 9
            7 9
        """.trimIndent()
        val expectedOutput = "9"
        assertEquals(expectedOutput, processGraph(input).trim())
    }

    @Test
    fun testExample2() {
        val input = """
            3 2
            1 2
            2 3
        """.trimIndent()
        val expectedOutput = "2"
        assertEquals(expectedOutput, processGraph(input).trim())
    }

    @Test
    fun testNoEdges() {
        val input = """
            3 0
        """.trimIndent()
        val expectedOutput = "-1"
        assertEquals(expectedOutput, processGraph(input).trim())
    }

    @Test
    fun testSingleNode() {
        val input = """
            1 0
        """.trimIndent()
        val expectedOutput = "-1"
        assertEquals(expectedOutput, processGraph(input).trim())
    }
}