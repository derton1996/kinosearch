package org.kinosearch.repository;

import org.kinosearch.dto.BlockDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends CrudRepository<BlockDTO,Integer> {
}
