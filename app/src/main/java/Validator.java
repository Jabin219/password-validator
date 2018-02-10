/**
 * Created by JIABIN on 2018/2/10.
 */

public class Validator {
    private String password;
    private int a=0;
    public Validator(String p){
        password=p;
    }
    public void setPassword(String p){
        password=p;
    }
    public String getPassword(){
        return password;
    }
    public int validate(){
        if(!password.equalsIgnoreCase("password")){
            a=a+1;
        }
        if(password.length()>=8){
            a=a+1;
        }
        return a;
    }
}