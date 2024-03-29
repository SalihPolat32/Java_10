package com.salihpolat.repository;

import com.salihpolat.repository.entity.UserProfile;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserProfileRepository extends ElasticsearchRepository<UserProfile, Long> {


    // TODO existsUserProfilesId
    boolean existsUserProfileById(Long id);

    Optional<UserProfile> findOptionalByAuthid(Long authid);

    Optional<UserProfile> deleteOptionalByAuthid(Long authid);
}