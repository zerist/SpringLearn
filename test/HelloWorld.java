package test;

public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        System.out.println("message: " + message);
        return message;
    }

    public void init(){
        System.out.println("Bean init");
    }

    public void destroy(){
        System.out.println("Bean destroy");
    }
}
