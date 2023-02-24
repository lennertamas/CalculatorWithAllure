import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Epic 1")
public class CalculatorTest {

    @Test
    @Story("User Story1")
    @Description ("Description related to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag 1")
    @Link("https://example.org")
    public void testAdd()
    {
        Calculator calc = new Calculator();;

        Assertions.assertEquals(5, calc.Add(2, 3));
    }


    @Test
    @Story("User Story2")
    @Description ("Description related to testAddWithNegative test")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("Tag 2")
    public void testAddWithNegative()
    {
        Calculator calc = new Calculator();

        Assertions.assertEquals(-6, calc.Add(-2,-3));
    }
}
