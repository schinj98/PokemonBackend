package com.pokemon.assessment.service;


import com.pokemon.assessment.client.PokeApiClient;
import com.pokemon.assessment.dto.response.PokemonResponse;
import com.pokemon.assessment.mapper.PokemonMapper;
import com.pokemon.assessment.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class PokemonServiceImplement implements PokemonService {

    private final PokeApiClient pokeApiClient;
    private final PokemonMapper pokemonMapper;

    @Override
    @Cacheable(value = "pokemon", key = "#name.toLowerCase()")
    public PokemonResponse getPokemon(String name) {

        log.info("Fetching pokemon from external API: {}", name);

        var response = pokeApiClient.fetchPokemon(
                name.trim().toLowerCase()
        );

        return pokemonMapper.toResponse(response);
    }
}