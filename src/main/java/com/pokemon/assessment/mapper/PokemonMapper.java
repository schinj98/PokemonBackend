package com.pokemon.assessment.mapper;

import com.pokemon.assessment.dto.response.*;
import com.pokemon.assessment.dto.vendor.PokeApiPokemonResponse;
import org.springframework.stereotype.Component;

@Component
public class PokemonMapper {

    public PokemonResponse toResponse(
            PokeApiPokemonResponse response
    ) {

        return new PokemonResponse(

                response.id(),

                response.name(),

                response.sprites().frontDefault(),

                response.height(),

                response.weight(),

                response.baseExperience(),

                response.cries().latest(),

                response.types()
                        .stream()
                        .map(type -> type.type().name())
                        .toList(),

                response.forms()
                        .stream()
                        .map(form -> form.name())
                        .toList(),

                response.moves()
                        .stream()
                        .limit(5)
                        .map(move -> move.move().name())
                        .toList(),

                response.abilities()
                        .stream()
                        .map(ability -> new AbilityResponse(
                                ability.ability().name(),
                                ability.hidden()
                        ))
                        .toList(),

                new StatsResponse(
                        getStat(response, "hp"),
                        getStat(response, "attack"),
                        getStat(response, "defense"),
                        getStat(response, "special-attack"),
                        getStat(response, "special-defense"),
                        getStat(response, "speed")
                )
        );
    }

    private Integer getStat(
            PokeApiPokemonResponse response,
            String statName
    ) {

        return response.stats()
                .stream()
                .filter(stat ->
                        stat.stat().name().equals(statName)
                )
                .findFirst()
                .map(stat -> stat.base_stat())
                .orElse(0);
    }
}