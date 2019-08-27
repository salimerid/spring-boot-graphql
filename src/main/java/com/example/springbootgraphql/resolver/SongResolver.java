package com.example.springbootgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.springbootgraphql.model.Artist;
import com.example.springbootgraphql.model.Song;
import com.example.springbootgraphql.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SongResolver implements GraphQLResolver<Song> {

    @Autowired
    private ArtistRepository artistRepository;

    public SongResolver(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Optional<Artist> getArtist(Song song) {
        return artistRepository.findById(song.getArtist().getId());
    }
}
