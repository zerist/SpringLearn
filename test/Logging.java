package test;

public class Logging {
    public void beforeAdvice(){
        System.out.println("going to setup student profile");
    }

    public void afterAdvice(){
        System.out.println("Student profile has been setup");
    }

    public void afterReturningAdvice(Object retVal){
        System.out.println("Return value: " + retVal.toString());
    }

    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("there has been an exception: " + ex.toString());
    }
}
