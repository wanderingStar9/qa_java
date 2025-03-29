import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    @Mock
    private Feline feline;
    private final String sex;
    private final boolean expected;

    @Parameterized.Parameters(name = "Тестовые данные: sex: {0}, hasMane: {1}")
    public static Object[][] dataForLionGender() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    public LionParametrizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Test
    public void doesHaveManeDifferentSex() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }
}
