package com.example.springbootgraphql;

import com.example.springbootgraphql.repository.ArtistRepository;
import com.example.springbootgraphql.repository.SongRepository;
import com.example.springbootgraphql.resolver.Mutation;
import com.example.springbootgraphql.resolver.Query;
import com.example.springbootgraphql.resolver.SongResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGraphqlApplication.class, args);
	}

	@Bean
	public SongResolver artistResolver(ArtistRepository artistRepository) {
		return new SongResolver(artistRepository);
	}

	@Bean
	public Query query(SongRepository songRepository, ArtistRepository artistRepository) {
		return new Query(songRepository, artistRepository);
	}

	@Bean
	public Mutation mutation(SongRepository songRepository, ArtistRepository artistRepository) {
		return new Mutation(songRepository, artistRepository);
	}
}
