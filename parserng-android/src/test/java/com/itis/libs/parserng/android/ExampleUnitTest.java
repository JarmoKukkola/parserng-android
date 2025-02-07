package com.itis.libs.parserng.android;

import com.itis.libs.parserng.android.expressParser.MathExpression;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        MathExpression expression = new MathExpression("4+4*2");
        assertEquals("12.0", expression.solve());
    }
}