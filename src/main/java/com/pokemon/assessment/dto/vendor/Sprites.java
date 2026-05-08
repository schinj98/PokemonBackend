package com.pokemon.assessment.dto.vendor;


import com.fasterxml.jackson.annotation.JsonProperty;

public record Sprites(

        @JsonProperty("front_default")
        String frontDefault
) {
}