package com.example.springbootgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springbootgraphql.model.Artist;
import com.example.springbootgraphql.model.Song;
import com.example.springbootgraphql.repository.ArtistRepository;
import com.example.springbootgraphql.repository.SongRepository;
import org.springframework.transaction.annotation.Transactional;


public class Query implements GraphQLQueryResolver {
    private SongRepository songRepository;
    private ArtistRepository artistRepository;

    public Query(SongRepository songRepository, ArtistRepository artistRepository) {
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;
    }

    @Transactional
    public Iterable<Song> findAllSongs() {
        return songRepository.findAll();
    }

    public Iterable<Artist> findAllArtists() {
        return artistRepository.findAll();
    }

    public long countSongs() {
        return songRepository.count();
    }
    public long countArtists() {
        return artistRepository.count();
    }
}
