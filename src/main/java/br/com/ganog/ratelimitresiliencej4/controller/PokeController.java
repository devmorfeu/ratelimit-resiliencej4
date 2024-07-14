package br.com.ganog.ratelimitresiliencej4.controller;

import br.com.ganog.ratelimitresiliencej4.service.PokeService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PokeController {

    private final PokeService pokeService;

    @GetMapping("/tipo_pokemon/{name}")
    @RateLimiter(name="poke-limit")
    public ResponseEntity<?> getPokemon(@PathVariable String name) {

        final var pokemon = pokeService.findPokemon(name);

        return ResponseEntity.ok(pokemon);
    }
}
