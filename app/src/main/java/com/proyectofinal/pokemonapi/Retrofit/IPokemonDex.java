package com.proyectofinal.pokemonapi.Retrofit;

import com.proyectofinal.pokemonapi.Model.Pokedex;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();


}
