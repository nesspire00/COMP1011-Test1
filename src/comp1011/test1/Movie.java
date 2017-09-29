/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1011.test1;

import java.time.LocalDate;

/**
 *
 * @author mykyta
 */
public class Movie {
    private String movieName, genre, description;
    private int yearReleased;

    public Movie(String movieName, String genre, String description, int yearReleased) {
        setMovieName(movieName);
        setGenre(genre);
        setDescription(description);
        setYearReleased(yearReleased);
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        if(!movieName.isEmpty())
            this.movieName = movieName;
        else
            throw new IllegalArgumentException("Name cannot be empty!");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        boolean genreIsSet = false;
        String[] genres = {"comedy","drama","thriller","western","animation","documentary","action","adventure"};
        for(String currentGenre : genres){
            if(genre.equalsIgnoreCase(currentGenre)){
                this.genre = genre.toLowerCase();
                genreIsSet = true;
            }
        }
        if(!genreIsSet)
            throw new IllegalArgumentException("Valid genres are: comedy, drama, thriller, western, animation, documentary, action, adventure.");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(!description.isEmpty())
            this.description = description;
        else
            throw new IllegalArgumentException("Description cannot be empty!");            
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        if(yearReleased <= (LocalDate.now().getYear() + 1) && yearReleased >= 1889){
            this.yearReleased = yearReleased;
        }
        else
            throw new IllegalArgumentException("Please input a valid year in the range of 1889 - " + (LocalDate.now().getYear() + 1));
    }
    
    @Override
    public String toString(){
        return movieName + ", released in " + yearReleased;
    }
}
