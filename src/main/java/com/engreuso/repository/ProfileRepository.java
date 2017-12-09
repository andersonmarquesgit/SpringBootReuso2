package com.engreuso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.engreuso.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
