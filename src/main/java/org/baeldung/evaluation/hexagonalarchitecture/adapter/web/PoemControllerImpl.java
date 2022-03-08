package org.baeldung.evaluation.hexagonalarchitecture.adapter.web;

import java.util.List;
import java.util.UUID;

import org.baeldung.evaluation.hexagonalarchitecture.core.PoemService;
import org.baeldung.evaluation.hexagonalarchitecture.data.PoemDTO;
import org.baeldung.evaluation.hexagonalarchitecture.excpetion.PoemNotFoundException;
import org.baeldung.evaluation.hexagonalarchitecture.port.input.web.PoemController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class PoemControllerImpl implements PoemController{

    private final PoemService poemService;

    PoemControllerImpl(PoemService poemService){
        this.poemService=poemService;
    }
    @Override
    public ResponseEntity<Void> addPoems(PoemDTO poemDTO) {
        poemService.addPoems(poemDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> removePoems(PoemDTO poemDTO) {
        poemService.removePoems(poemDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> updatePoems(PoemDTO poemDTO) {
        poemService.updatePoems(poemDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PoemDTO> getPoemsById(UUID poemId) {
        try{
            return new ResponseEntity<>((poemService.getPoemById(poemId)),HttpStatus.OK);
        }catch(PoemNotFoundException ex){
            log.error("ERROR | {}", ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<List<PoemDTO>> poems() {
        return new ResponseEntity<>((poemService.getAllPoems()),HttpStatus.OK);
    }   
}
