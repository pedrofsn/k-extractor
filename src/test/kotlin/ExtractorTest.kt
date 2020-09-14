import org.junit.Test

class ExtractorTest {

    @Test
    fun `GIVEN value null as String WHEN extract value THEN return default value`() {
        val test: String? = null
        val result = extract safe test
        assert("" == result)
    }

    @Test
    fun `GIVEN value null as Int WHEN extract value THEN return default value`() {
        val test: Int? = null
        val result = extract safe test
        assert(-1 == result)
    }

    @Test
    fun `GIVEN value null as Boolean WHEN extract value THEN return default value`() {
        val test: Boolean? = null
        val result = extract safe test
        assert(result.not())
    }

    @Test
    fun `GIVEN value null as Float WHEN extract value THEN return default value`() {
        val test: Float? = null
        val result = extract safe test
        assert(0.0f == result)
    }

    @Test
    fun `GIVEN value null as Double WHEN extract value THEN return default value`() {
        val test: Double? = null
        val result = extract safe test
        assert(0.0 == result)
    }

    @Test
    fun `GIVEN value null as Long WHEN extract value THEN return default value`() {
        val test: Long? = null
        val result = extract safe test
        assert(-1L == result)
    }

}