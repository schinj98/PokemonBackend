package com.pokemon.assessment.service;

import com.pokemon.assessment.dto.response.PokemonResponse;

public interface PokemonService {

    PokemonResponse getPokemon(String name);
}