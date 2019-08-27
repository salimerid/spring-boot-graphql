
# GraphQL With Spring Boot

### What's inside

   - Spring Boot
   - GraphQL
   - Maven
   - H2
   - JPA
   
### Prerequisites
      - Java 8
      - Maven 3


#### Usage

  Run the project through the IDE and head out to http://localhost:8080
    
  or
    
  Go on the project's root folder, run this command in the command line:
  
     $ mvn spring-boot:run

### Once Application will be started successfully

    http://localhost:8080/graphiql 
   to start executing queries / mutation. 
   
   For example:
 
     {
       findAllSongs {
         id
         title
         duration
         artist {
           name
           country
           id
         }
       }
       findAllArtists {
         name
       }
     }
     
   Create:
     
      mutation {
        createArtist(name: "Jon Doe", country: "BD") {
          id
          name
          country
        }
      }
      
      mutation {
        createSong(title: "Aa aa aa", duration: 4, artist: 2) {
          id
          title
          duration
        }
      }   
     
   Update:
     
      mutation {
        updateSong(title: "Aa bb bb", duration: 5, id: 1) {
          id
          title
          duration
        }
      }

         
   Delete:
   
       mutation {
         deleteSong(id: 1)
       }
      
         
