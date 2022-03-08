package org.baeldung.eval.hexagonalarchitecture.port.output.persistence;

import java.util.List;
import java.util.UUID;

import org.baeldung.eval.hexagonalarchitecture.data.PoemDTO;

public interface PoemPersistencePort {
    public void addPoem(PoemDTO poemDTO);

    public void removePoem(PoemDTO poemDTO);

    public void updatePoem(PoemDTO poemDTO);

    public List<PoemDTO> getAllPoems();

    public PoemDTO getPoemById(UUID poemId);
}
