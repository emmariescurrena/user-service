package com.emmariescurrena.bookesy.user_service.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emmariescurrena.bookesy.user_service.models.Favorite;
import com.emmariescurrena.bookesy.user_service.models.Recommendation;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Recommendation> findByUser_Id(Long userId);
}
