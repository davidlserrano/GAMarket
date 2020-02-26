package sample.GAMarket.src.app;



public class Login {
    private String username;
    private String password;

    void setUsername(String user){
        username = user;
    }

    void setPassword(String user){
        username = user;
    }

    void createNewUser(String username, String password){
        //create new
    }

    boolean checkLogin(String username, String password){
        //go into database to check whether username & password are correct
        return false;
    }

    void loginRecovery(){
        //some how assist the user to recover their account, preferably through email verification
    }

}
