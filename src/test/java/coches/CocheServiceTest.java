package coches;

import es.fplumara.dam1.coche.CocheService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CocheServiceTest {
    private CocheService cocheService;

    @ParameterizedTest
    @ValueSource(strings = {"1111ABC","9090ABC"})

    public void validaMatriculaValidas(String matricula){
        assertTrue(cocheService.validaMatricula(matricula));
    }
    @ParameterizedTest
    @ValueSource(strings = {"1111ABC","9090ABC"})
    public void compruebaMatriculasInvalidas(String matricula){
        assertFalse(cocheService.validaMatricula(matricula));
    }
}
