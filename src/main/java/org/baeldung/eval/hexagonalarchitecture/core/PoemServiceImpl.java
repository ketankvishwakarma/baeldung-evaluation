package org.baeldung.eval.hexagonalarchitecture.core;

import java.util.List;
import java.util.UUID;

import org.baeldung.eval.hexagonalarchitecture.data.PoemDTO;
import org.baeldung.eval.hexagonalarchitecture.port.output.persistence.PoemPersistencePort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PoemServiceImpl implements PoemService{
   
    private final PoemPersistencePort poemPersistencePort;

    public PoemServiceImpl(PoemPersistencePort poemPersistencePort) {
        this.poemPersistencePort = poemPersistencePort;
    }

    @Override
    public void addPoems(PoemDTO poemDTO) {
        poemPersistencePort.addPoem(poemDTO);
    }

    @Override
    @Transactional
    public void removePoems(PoemDTO poemDTO) {
        poemPersistencePort.removePoem(poemDTO);
    }

    @Override
    public void updatePoems(PoemDTO poemDTO) {
        poemPersistencePort.updatePoem(poemDTO);
    }

    @Override
    public List<PoemDTO> getAllPoems() {
        return poemPersistencePort.getAllPoems();
    }

    @Override
    public PoemDTO getPoemById(UUID poemId) {
        return poemPersistencePort.getPoemById(poemId);
    }

}
