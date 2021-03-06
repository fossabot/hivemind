package io.cyber.hivemind.service

import io.cyber.hivemind.util.getNextFileName
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*
import kotlin.collections.ArrayList

@RunWith(VertxUnitRunner::class)
class WebVerticleTest {

    @Test
    fun testDownloadData(tc: TestContext) {
        var file = getNextFileName(null, "csv")
        assertEquals("0", file)

        file = getNextFileName(Arrays.asList("w", "0", "1000"), "csv")
        assertEquals("1001", file)

        file = getNextFileName(Arrays.asList("1"), "csv")
        assertEquals("2", file)

        file = getNextFileName(ArrayList(), "csv")
        assertEquals("0", file)
    }

}