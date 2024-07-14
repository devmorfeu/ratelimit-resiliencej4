package br.com.ganog.ratelimitresiliencej4.port;

import br.com.ganog.ratelimitresiliencej4.port.model.PokeTypeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PokePort", url = "https://pokeapi.co/api/v2/pokemon/")
public interface PokePort {

    @GetMapping(value = "/{name}")
    PokeTypeResponse getInfoPokemon(@PathVariable String name);
}
