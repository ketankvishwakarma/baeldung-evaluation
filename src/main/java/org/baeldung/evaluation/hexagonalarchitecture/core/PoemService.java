package org.baeldung.evaluation.hexagonalarchitecture.core;

import java.util.List;
import java.util.UUID;

import org.baeldung.evaluation.hexagonalarchitecture.data.PoemDTO;

public interface PoemService {
    public void addPoems(PoemDTO poemDTO);

    public void removePoems(PoemDTO poemDTO);

    public void updatePoems(PoemDTO poemDTO);

    public List<PoemDTO> getAllPoems();

    public PoemDTO getPoemById(UUID poemId);
}
