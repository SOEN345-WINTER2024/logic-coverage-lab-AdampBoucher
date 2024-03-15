import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckItTest {

    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream testOutput = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(testOutput));
    }

    @Test
    public void testPredicateCoverageAssertTrue() {
        // Arrange


        // Act
        CheckIt.checkIt(true, false, false);

        // Assert
        assertEquals("P is true", testOutput.toString().trim());

    }

    @Test
    public void testPredicateCoverageAssertFalse() {
        // Arrange


        // Act
        CheckIt.checkIt(false, false, false);

        // Assert
        assertEquals("P isn't true", testOutput.toString().trim());

    }

    @Test
    public void testFirstClauseCoverage() {
        // Arrange


        // Act
        CheckIt.checkIt(true, true, true);

        // Assert
        assertEquals("P is true", testOutput.toString().trim());
    }

    @Test
    public void testSecondClauseCoverage() {
        // Arrange


        // Act
        CheckIt.checkIt(false, false, false);

        // Assert
        assertEquals("P isn't true", testOutput.toString().trim());
    }

    @Test
    public void testCACC_T_F_F() {
        // Arrange

        // Act
        CheckIt.checkIt(true, false, false);

        // Assert
        assertEquals("P is true", testOutput.toString().trim());


    }

    @Test
    public void testCACC_F_F_F() {
        // Arrange

        // Act
        CheckIt.checkIt(false, false, false);

        // Assert
        assertEquals("P isn't true", testOutput.toString().trim());


    }

    @Test
    public void testCACC_F_T_T() {
        // Arrange

        // Act
        CheckIt.checkIt(false, true, true);

        // Assert
        assertEquals("P is true", testOutput.toString().trim());


    }

    @Test
    public void testCACC_F_T_F() {
        // Arrange

        // Act
        CheckIt.checkIt(false, true, false);

        // Assert
        assertEquals("P isn't true", testOutput.toString().trim());


    }

    @Test
    public void testRACC_T_T_F() {
        // Arrange

        // Act
        CheckIt.checkIt(true, true, false);

        // Assert
        assertEquals("P is true", testOutput.toString().trim());

    }

    @Test
    public void testRACC_F_T_F() {
        // Arrange

        // Act
        CheckIt.checkIt(false, true, false);

        // Assert
        assertEquals("P isn't true", testOutput.toString().trim());

    }


}
