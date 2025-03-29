import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void getFamilyReturnFeline() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(actualFamily, expectedFamily);
    }

    @Test
    public void eatMeatReturnFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getKittenValueFelineTest() {
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount);
    }

}
