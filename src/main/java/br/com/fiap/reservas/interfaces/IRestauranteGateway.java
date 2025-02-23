package br.com.fiap.reservas.interfaces;

import br.com.fiap.reservas.entities.RestauranteEntity;

import java.util.List;

public interface IRestauranteGateway {

    RestauranteEntity buscarRestaurantePorNomeELocalizacaoETipo(String nome, String endereco, String tipo);

    RestauranteEntity cadastrarRestaurante(RestauranteEntity restauranteEntity);

    List<RestauranteEntity> buscarRestaurantePorNome(String nome);

}
