package eif.viko.lt.s031684.entities;

/**
 * Class representing game info
 * @author M
 */
public class Game {
    
    int id;
    int accountId;
    String name;
    String type;
    int achievements;
    int level;
    String rank;
    boolean rareSkins;
    
    
    /**
     * Constructor for setting game info
     * @param id Game id
     * @param accountId Id of game owner
     * @param name Game name
     * @param type Game type
     * @param achievements Achievements number in game
     * @param level In-game level
     * @param rank In-game rank
     * @param rareSkins Game skins status
     */
    public Game(int id, int accountId, String name,String type, int achievements, int level, String rank , boolean rareSkins){
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.type = type;
        this.achievements = achievements;
        this.level = level;
        this.rank = rank;
        this.rareSkins = rareSkins;
    }

    
    /**
     * Default constructor
     */
    public Game(){
        
    }

    /**
     * Method for getting game ID
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Method for setting game ID
     * @param id Game ID
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Method for getting account ID
     * @return 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Method for setting account ID
     * @param accountId Account ID
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    

    /**
     * Method for getting game name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Method for setting game name
     * @param name Game name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Method for getting game type
     * @return Game type
     */
    public String getType() {
        return type;
    }
    
    /**
     * Method for setting game type
     * @param type Game type
     */
    public void setType(String type){
        this.type = type;
    }

    /**
     * Method for getting number of achievements
     * @return
     */
    public int getAchievements() {
        return achievements;
    }

    /**
     * Method for setting number of achievements
     * @param achievements Game achievements
     */
    public void setAchievements(int achievements) {
        this.achievements = achievements;
    }

    /**
     * Method for getting In-game level
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     * Method for setting In-game level
     * @param level In-game level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Method for getting In-game rank
     * @return
     */
    public String getRank() {
        return rank;
    }

    /**
     * Method for setting In-game rank
     * @param rank In-game rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * Method for getting status of rare skins in game 
     * @return
     */
    public boolean isRareSkins() {
        return rareSkins;
    }

    /**
     * Method for setting status of rare skins in game
     * @param rareSkins
     */
    public void setRareSkins(boolean rareSkins) {
        this.rareSkins = rareSkins;
    }
    
    
    
}
