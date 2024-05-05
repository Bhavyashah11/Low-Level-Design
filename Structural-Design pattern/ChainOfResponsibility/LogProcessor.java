package ChainOfResponsibility;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    LogProcessor nexLogProcessor;
     LogProcessor(LogProcessor logProcessor){
        this.nexLogProcessor = logProcessor;
    }

    public void log(int loglevel , String message){
        if(nexLogProcessor!=null) 
            nexLogProcessor.log(loglevel, message);
    }
}
