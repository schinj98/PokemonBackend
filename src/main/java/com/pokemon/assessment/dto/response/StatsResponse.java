package com.pokemon.assessment.dto.response;

public record StatsResponse(
        Integer hp,
        Integer attack,
        Integer defense,
        Integer specialAttack,
        Integer specialDefense,
        Integer speed
) {
}