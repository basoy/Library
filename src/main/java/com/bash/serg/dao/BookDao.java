package com.bash.serg.dao;

import com.bash.serg.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by serg on 29.03.17.
 */
public interface BookDao extends JpaRepository<BookEntity, Integer> {
}
