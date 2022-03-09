import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addTest() {
        // Arrange
        Calculator sut = new Calculator();
        int expectedResult = 3 + 4;

        // Act
        int actualResult = sut.add(3, 4);

        // Assert
        Assertions.assertEquals(expectedResult,actualResult);
    }
}