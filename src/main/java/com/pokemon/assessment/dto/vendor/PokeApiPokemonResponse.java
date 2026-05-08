package com.pokemon.assessment.dto.vendor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PokeApiPokemonResponse(

        Integer id,

        String name,

        Integer height,

        Integer weight,

        @JsonProperty("base_experience")
        Integer baseExperience,

        Sprites sprites,

        List<TypeSlot> types,

        List<AbilitySlot> abilities,

        List<StatSlot> stats,

        List<PokemonForm> forms,

        List<MoveWrapper> moves,

        Cries cries

) {
}