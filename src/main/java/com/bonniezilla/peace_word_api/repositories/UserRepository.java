package com.bonniezilla.peace_word_api.repositories;

import com.bonniezilla.peace_word_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
