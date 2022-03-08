package org.baeldung.evaluation.hexagonalarchitecture.port.input.web;

import java.util.List;
import java.util.UUID;

import org.baeldung.evaluation.hexagonalarchitecture.data.PoemDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface PoemController {
    
    @PostMapping("/poems")
    ResponseEntity<Void> addPoems(@RequestBody PoemDTO pomeDTO);

    @DeleteMapping("/poems")
    ResponseEntity<String> removePoems(@RequestBody PoemDTO pomeDTO);

    @PutMapping("/poems")
    ResponseEntity<String> updatePoems(@RequestBody PoemDTO pomeDTO);

    @GetMapping("/poems/{pomeId}")
    ResponseEntity<PoemDTO> getPoemsById(@PathVariable(name = "pomeId") UUID poemId);

    @GetMapping("/poems")
    ResponseEntity<List<PoemDTO>> poems();

}