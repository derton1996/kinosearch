package org.kinosearch.repository;

import org.kinosearch.dto.ArticleDesignDTO;
import org.kinosearch.dto.BlockDTO;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ArticleDesignRepository extends CrudRepository<ArticleDesignDTO,Integer> {

}
