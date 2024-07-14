package br.com.ganog.ratelimitresiliencej4;

import br.com.ganog.ratelimitresiliencej4.controller.PokeController;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RatelimitResiliencej4Application {

    public static void main(String[] args) {
        SpringApplication.run(RatelimitResiliencej4Application.class, args);
    }

    private final PokeController pokeController;

    public RatelimitResiliencej4Application(PokeController pokeController) {
        this.pokeController = pokeController;
    }
    @PostConstruct
    public void init() {
        System.out.println(pokeController.getPokemon("pikachu"));
    }

}
