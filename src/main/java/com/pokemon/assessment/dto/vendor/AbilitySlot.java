package com.pokemon.assessment.dto.vendor;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AbilitySlot(

        AbilityWrapper ability,

        @JsonProperty("is_hidden")
        Boolean hidden
) {
}