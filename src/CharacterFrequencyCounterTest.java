import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest 
{
    @Test
     public void testLAppearsThreeTimesInHelloWorld()
    {
          // Arrange - where we set up our test
          CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello world");
          // Act - actually making something happen
          int actualCount = counter.getFrequency('l');
          // Assert - make an assertion that what we got should match what we expected
          assertEquals(3, actualCount);
    }

    @Test
    public void testNonOccuringCharacterPercentageIsZero()
    {
          // Arrange
          CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");
          // Act
          double actualPercentage = counter.getRelativePercentage('z');
          // Assert
          assertEquals(0.0, actualPercentage,  0.0001);
    }

}