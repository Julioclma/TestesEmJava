import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void sumTest(){
        Double soma = Calculadora.sum(5.0,5.0);
        Assertions.assertEquals(10, soma);
    }
}
