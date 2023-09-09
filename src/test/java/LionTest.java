import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getLionDoNotHaveKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedGetKittens = 0;
        int actualGetKittens = lion.getKittens();
        assertEquals(expectedGetKittens, actualGetKittens);
    }

    @Test
    public void getKittensLionReturnOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void checkLionUnknownSex() {
        try {
            Lion lion = new Lion("Unknown", feline);
            lion.doesHaveMane();
        } catch (Exception thrown) {
            String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(expectedResult, thrown.getMessage());
        }
    }

    @Test
    public void getFoodListLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }

}