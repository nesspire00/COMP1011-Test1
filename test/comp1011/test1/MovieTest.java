/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1011.test1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class MovieTest {
    Movie validMovie;
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validMovie = new Movie("test Movie", "coMedy", "funny mOvie!", 2015);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMovieName method, of class Movie.
     */
    @Test
    public void testGetMovieName() {
        String expResult = "test Movie";
        String result = validMovie.getMovieName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setMovieName method, of class Movie.
     */
    @Test
    public void testSetMovieNameValid() {
        try{
            validMovie.setMovieName("Jdubs great adventure");
            assertEquals("Jdubs great adventure", validMovie.getMovieName());
        }
        catch (IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
            fail("Jdubs great adventure is a valid movie name");
        }
    }

    /**
     * Test of setMovieName method, of class Movie.
     */
    @Test
    public void testSetMovieNameInvalid() {
        try{
            validMovie.setMovieName("");
            fail("An empty movie name should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.print(e.getMessage());            
        }
    }

    
    /**
     * Test of getGenre method, of class Movie.
     */
    @Test
    public void testGetGenre() {
        String expResult = "comedy";
        String result = validMovie.getGenre();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of setGenre method, of class Movie.
     */
    @Test
    public void testSetGenreComedy() {
        try
        {
            validMovie.setGenre("cOmEdY");
            assertEquals("comedy",validMovie.getGenre());
        }
        catch (IllegalArgumentException e)
        {
            fail("cOmedy is a valid genre-ensure your code is case insensitive");
        }
    }

    
     /**
     * Test of setGenre method, of class Movie.
     */
    @Test
    public void testSetGenreInvalid() {
        try
        {
            validMovie.setGenre("come");
            fail("come is not a valid genre and should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Test of setGenre method, of class Movie.
     */
    @Test
    public void testSetGenreDrama() {
        try
        {
            validMovie.setGenre("DRAMA");
            assertEquals("drama",validMovie.getGenre());
        }
        catch (IllegalArgumentException e)
        {
            fail("DRAMA is a valid genre-ensure your code is case insensitive");
        }
    }

    /**
     * Test of setGenre method, of class Movie.
     */
    @Test
    public void testSetGenreThriller() {
        try
        {
            validMovie.setGenre("thrilLer");
            assertEquals("thriller",validMovie.getGenre());
        }
        catch (IllegalArgumentException e)
        {
            fail("thrilLer is a valid genre-ensure your code is case insensitive");
        }
    }
    
    /**
     * Test of setGenre method, of class Movie.
     */
    @Test
    public void testSetGenreWestern() {
        try
        {
            validMovie.setGenre("western");
            assertEquals("western",validMovie.getGenre());
        }
        catch (IllegalArgumentException e)
        {
            fail("western is a valid genre");
        }
    }
    
    /**
     * Test of setGenre method, of class Movie.
     */
    @Test
    public void testSetGenreAction() {
        try
        {
            validMovie.setGenre("aCTIon");
            assertEquals("action",validMovie.getGenre());
        }
        catch (IllegalArgumentException e)
        {
            fail("aCTIon is a valid genre");
        }
    }
}
    /**
     * Test of setGenre method, of class Movie.
     */