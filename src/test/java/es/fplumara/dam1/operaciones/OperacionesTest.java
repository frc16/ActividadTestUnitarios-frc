package es.fplumara.dam1.operaciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperacionesTest {

    @ParameterizedTest
    @CsvSource({
            "1,INSUFICIENTE",
            "7.3,INSUFICIENTE"
    })
    @DisplayName("Comprueba las notas")
    public void clasificacionNotasValidas(double nota, String resultadoEsperado) {
        String resultado = Operaciones.calificacion(nota);
        assertEquals(resultadoEsperado,resultado);
    }
}

