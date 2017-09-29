/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1011.test1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author mykyta
 */
public class CreateMovieController implements Initializable {
    @FXML private TextField movieNameTextField;
    @FXML private TextField genreTextField;
    @FXML private TextField descriptionTextField;
    @FXML private TextField yearReleasedTextField;

    @FXML private Button createMovieButton;
    @FXML private Label messageLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        messageLabel.setText("");
        createMovieButton.setOnAction(e -> createMovieButtonClicked());
    }

    private void createMovieButtonClicked(){
        messageLabel.setText("");
        String name = movieNameTextField.getText();
        String desc = descriptionTextField.getText();
        String genre = genreTextField.getText();
        int year = 0;
        
        try{
        year = Integer.parseInt(yearReleasedTextField.getText());
        } catch (NumberFormatException e){
            messageLabel.setText("Year Released must be a valid number!");
        }
        
        try {
            Movie movie = new Movie(name, genre, desc, year);
            messageLabel.setText(movie.toString());
        } catch (IllegalArgumentException e){
            messageLabel.setVisible(true);
            messageLabel.setText(e.getMessage());
        }
    }
}
