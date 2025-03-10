package br.com.fiap.reservas.entities;

import br.com.fiap.reservas.enums.StatusMesa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MesaEntityTest {

    @Test
    void validaNumeroMenorQueZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new MesaEntity(-1, StatusMesa.LIVRE),
                "Numero de mesa inválido"
        );
    }

    @Test
    void validaStatusMesaNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new MesaEntity(1, null),
                "Status inválido"
        );
    }

    @Test
    void validaMesaComSucesso() {
         MesaEntity mesa = new  MesaEntity(1, StatusMesa.LIVRE);
        assertNotNull(mesa);
        assertEquals(1, mesa.getNumero());
        assertEquals(StatusMesa.LIVRE, mesa.getStatusMesa());
    }
}
