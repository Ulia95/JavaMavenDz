import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.JavaMavenDz.service.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200, 300, 3",
            "500, 800, 6"
    })

    public void testCvadrSQRS(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.cvadrSQRS(min,max);

        Assertions.assertEquals(actual, expected);

    }
}
