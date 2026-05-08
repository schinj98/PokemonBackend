package com.pokemon.assessment.client;


import com.pokemon.assessment.dto.vendor.PokeApiPokemonResponse;
import com.pokemon.assessment.exception.PokemonNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Component
@RequiredArgsConstructor
public class PokeApiClient {

    private final WebClient webClient;

    public PokeApiPokemonResponse fetchPokemon(String name) {

        try {

            return webClient.get()
                    .uri("/pokemon/{name}", name)
                    .retrieve()
                    .bodyToMono(PokeApiPokemonResponse.class)
                    .block();

        } catch (WebClientResponseException.NotFound ex) {

            throw new PokemonNotFoundException(
                    "Pokemon not found: " + name
            );
        }
    }
}