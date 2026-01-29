package es.fplumara.dam1.operaciones;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperacionesTest {

    @ParameterizedTest
    @CsvSource({
            "0.0,INSUFICIENTE",
            "4.99,INSUFICIENTE",
            "5.0, APROBADO",
            "6.99, APROBADO",
            "7.0, NOTABLE",
            "8.99, NOTABLE",
            "9.0, SOBRESALIENTE",
            "10.0, SOBRESALIENTE",
    })
    @DisplayName("Comprueba las notas")
    public void clasificacionNotasValidas(double nota, String resultadoEsperado) {
        String resultado = Operaciones.calificacion(nota);
        assertEquals(resultadoEsperado,resultado);
    }
    @ParameterizedTest
    @ValueSource(doubles= {-0.01,10.01})
    @DisplayName("comprobar IllegalArgumentException para notas fuera del rango")

    public void clasificacionDeNotasInvalidas(double notaInvalida){
        assertThrows(IllegalArgumentException.class,() -> Operaciones.calificacion(notaInvalida));
    }
 //comprobar el mensaje de excepcion
    @test
    @DisplayName("mensaje de error")

    public void mensajeExcepcionFueraDeRango(){
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                ()-> Operaciones.calificacion(10.01),
                ()-> Operaciones.calificacion(-0.01)
        );
    }


}


