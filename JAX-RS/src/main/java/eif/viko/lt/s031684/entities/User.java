package eif.viko.lt.s031684.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing account info
 * @author M
 */
public class User {
    
    List<Game> games = new ArrayList();
    int id;
    String username;
    String password;
    String email;
    boolean emailVer;
    double price;
    
    /**
     * Constructor for setting user info
     * @param id Account ID
     * @param username Account username
     * @param password Account password
     * @param email Email of account
     * @param emailVer Email verification status
     * @param price Price of account
     */
    public User(int id, String username, String password, String email, boolean emailVer, double price){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.emailVer = emailVer;
        this.price = price;
    }
    
    /**
     * Default constructor
     */
    public User(){
    }

    /**
     * Method for getting game list
     * @return Games list
     */
    public List<Game> getGames() {
        return games;
    }

    /**
     * Method for setting games list
     * @param games Games list
     */
    public void setGames(List<Game> games) {
        this.games = games;
    }
    
    /**
     * Method for adding games to list 
     * @param game Game object 
     */
    public void addGames(Game game){
        this.games.add(game);
    }
    
    /**
     * Method for removing game from list 
     * @param game Game object
     */
    public void removeGame(Game game){
        this.games.remove(game);
    }

    /**
     * Method for getting account ID
     * @return Account ID
     */
    public int getId() {
        return id;
    }

    /**
     * Method for setting account ID
     * @param id Account ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method for getting account username
     * @return Account username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Method for setting account username
     * @param username Account username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Method for getting account password
     * @return Account password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method for setting account password
     * @param password Account password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method for getting account email
     * @return Account email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method for setting account email
     * @param email Account email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method for getting email verification status
     * @return Email verification status
     */
    public boolean isEmailVer() {
        return emailVer;
    }

    /**
     * Method for setting email verification status 
     * @param emailVer Email verification status
     */
    public void setEmailVer(boolean emailVer) {
        this.emailVer = emailVer;
    }

    /**
     * Method for getting account price
     * @return Account price 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Method for setting account price
     * @param price Account price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
}
