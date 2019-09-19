package com.hhovhann.springbootkubernetes.controller;

import com.hhovhann.springbootkubernetes.Kayak;
import com.hhovhann.springbootkubernetes.repository.KayakRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping(path = "/kayaks")
public class KayakController {

    private final KayakRepository kayakRepository;

    public KayakController(KayakRepository kayakRepository) {
        this.kayakRepository = kayakRepository;
    }

    @PostMapping()
    public @ResponseBody Mono<Kayak> addKayak(@RequestBody Kayak kayak) {
        return kayakRepository.save(kayak);
    }

    @GetMapping()
    public @ResponseBody Flux<Kayak> getAllKayaks() {
        Flux<Kayak> result = kayakRepository.findAll();
        return result;
    }
}
