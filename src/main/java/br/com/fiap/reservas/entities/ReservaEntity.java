package br.com.fiap.reservas.entities;

import br.com.fiap.reservas.enums.StatusMesa;

public class ReservaEntity {
    private final RestauranteEntity restaurante;
    private final UsuarioEntity usuario;
    private final MesaEntity mesa;

    public ReservaEntity(RestauranteEntity restaurante, UsuarioEntity usuario, MesaEntity mesa) {
        if (restaurante == null) {
            throw new IllegalArgumentException("Restaurante deve ser informado");
        }
        if (usuario == null) {
            throw new IllegalArgumentException("Usuário deve ser informado");
        }

        this.restaurante = restaurante;
        this.usuario = usuario;
        this.mesa = mesa;
    }
}
