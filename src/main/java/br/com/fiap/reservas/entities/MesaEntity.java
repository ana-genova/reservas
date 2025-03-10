package br.com.fiap.reservas.entities;

import br.com.fiap.reservas.enums.StatusMesa;
import br.com.fiap.reservas.infra.repository.mesa.MesaPK;

public class MesaEntity {

    private Long restauranteId;
    private final Integer numero;
    private StatusMesa statusMesa;

    public MesaEntity(Integer numero, StatusMesa statusMesa) {
        validarNumero(numero);
        validarStatusMesa(statusMesa);

        this.numero = numero;
        this.statusMesa = statusMesa;
    }

    public MesaEntity(Long restauranteId, Integer numero, StatusMesa statusMesa) {
        validarNumero(numero);
        validarStatusMesa(statusMesa);

        this.restauranteId = restauranteId;
        this.numero = numero;
        this.statusMesa = statusMesa;
    }

    private static void validarNumero(Integer numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Numero de mesa inválido");
        }
    }

    private static void validarStatusMesa(StatusMesa statusMesa) {
        if (statusMesa == null) {
            throw new IllegalArgumentException("Status inválido");
        }
    }

    public Integer getNumero() {
        return numero;
    }

    public StatusMesa getStatusMesa() {
        return statusMesa;
    }

    public Long getRestauranteId() {
        return restauranteId;
    }
}
