import org.example.Pessoa;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void verificaMaioridadeTest() {
        Pessoa maiorDeIdade = new Pessoa("Julio", 22);
        assertTrue(maiorDeIdade.verificaMaioridade());

        Pessoa menorDeIdade = new Pessoa("Maria", 17);
        assertFalse(menorDeIdade.verificaMaioridade());
    }

}
