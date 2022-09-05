package PrototypeScope;

public class HelloWorld {

    private String Message;

    public void setMessage(String message){
        this.Message =message;
    }

    public void getMessage(){
        System.out.println("Your Message: + " + Message);
    }

}
