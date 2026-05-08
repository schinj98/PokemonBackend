package com.pokemon.assessment.dto.response;

import java.util.List;

public record PokemonResponse(

        Integer id,
        String name,
        String imageUrl,
        Integer height,
        Integer weight,
        Integer baseExperience,

        String cryAudio,

        List<String> types,
        List<String> forms,
        List<String> moves,

        List<AbilityResponse> abilities,

        StatsResponse stats
) {
}