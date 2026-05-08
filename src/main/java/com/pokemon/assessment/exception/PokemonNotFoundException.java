package com.pokemon.assessment.exception;

public class PokemonNotFoundException
        extends RuntimeException {

    public PokemonNotFoundException(String message) {
        super(message);
    }
}