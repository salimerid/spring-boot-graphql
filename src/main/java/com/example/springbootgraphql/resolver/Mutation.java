package com.example.springbootgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.springbootgraphql.model.Artist;
import com.example.springbootgraphql.model.Song;
import com.example.springbootgraphql.repository.ArtistRepository;
import com.example.springbootgraphql.repository.SongRepository;


public class Mutation implements GraphQLMutationResolver {

    private SongRepository songRepository;
    private ArtistRepository artistRepository;

    public Mutation(SongRepository songRepository, ArtistRepository artistRepository) {
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;
    }

    //----------------- Artist CRUD ---------------------
    public Artist createArtist(String name, String country) {
        Artist artist = new Artist();
        artist.setName(name);
        artist.setCountry(country);
        artistRepository.save(artist);
        return artist;
    }

    //------------------ Song CRUD --------------------
    public Song createSong(String title, Integer duration, Integer artistId) {
        Song song = new Song();
        song.setArtist(new Artist(artistId));
        song.setTitle(title);
        song.setDuration(duration);
        songRepository.save(song);
        return song;
    }

    public Song updateSong(String title, Integer duration, Integer id) {
        Song song = songRepository.findById(id).get();
        song.setTitle(title);
        song.setDuration(duration);
        songRepository.save(song);
        return song;
    }

    public boolean deleteSong(Integer id) {
        songRepository.deleteById(id);
        return true;
    }
}
