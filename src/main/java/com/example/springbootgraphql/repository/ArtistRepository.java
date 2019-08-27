package com.example.springbootgraphql.repository;

import com.example.springbootgraphql.model.Artist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}

