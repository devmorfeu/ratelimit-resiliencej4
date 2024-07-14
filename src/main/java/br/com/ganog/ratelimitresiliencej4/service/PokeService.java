package br.com.ganog.ratelimitresiliencej4.service;

import br.com.ganog.ratelimitresiliencej4.port.PokePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PokeService {

    private final PokePort pokePort;

    public Object findPokemon(String name) {
        return pokePort.getInfoPokemon(name);
    }
}
