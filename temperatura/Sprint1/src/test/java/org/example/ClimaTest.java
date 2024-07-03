package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClimaTest {

    @Test
    void testAlertaLluviaIntensa() {
        // Arrange
        Clima clima = new Clima(25.0f, 12.0f, 10.0f, 60.0f, 1010.0f);

        // Act
        boolean alertaLluviaIntensa = clima.getCantidad() > 10;

        // Assert
        assertTrue(alertaLluviaIntensa, "debe haber una alerta de lluvia intensa.");
    }

    @Test
    void testNoAlertaLluviaIntensa() {
        // Arrange
        Clima clima = new Clima(25.0F, 5.0f , 10.0f, 60.0f, 1010.0f);

        // Act
        boolean alertaLluviaIntensa = clima.getCantidad() > 10;

        // Assert
        assertFalse(alertaLluviaIntensa, "no debe haber una alerta de lluvia intensa.");
    }

    @Test
    void testAlertaVientoFuerte() {
        // Arrange
        Clima clima = new Clima(25.0f, 12.0f, 20.0f, 60.0f, 1010.0f);

        // Act
        boolean alertaVientoFuerte = clima.getVelocidad() > 15;

        // Assert
        assertTrue(alertaVientoFuerte, "debe haber una alerta de viento fuerte.");
    }

    @Test
    void testNoAlertaVientoFuerte() {
        // Arrange
        Clima clima = new Clima(25.0f, 12.0f, 10.0f, 60.0f, 1010.0f);

        // Act
        boolean alertaVientoFuerte = clima.getVelocidad() > 15;

        // Assert
        assertFalse(alertaVientoFuerte, "No debe haber una alerta de viento fuerte.");
    }
    @Test
    void notificacion() {

        // Arrange
        Clima clima = new Clima(25.0f, 12.0f, 20.0f, 60.0f, 1010.0f);
        // Act
        float temperatura = clima.getTemperatura();
        float humedad = clima.getHumedad();
        // Assert
        assertEquals(25.0f, temperatura, 0.01, "La temperatura debe ser 25.0C°.");
        assertEquals(60.0f, humedad, 0.01, "La humedad debe ser 60.0%.");
    }
}