package ChainOfResponsibility;
import java.io.*;

//logger, ATM, Vending machine
class ChainOfResponsibility {
    public static void main(String[] args){
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(logger.INFO,"This is a info log");
        logger.log(logger.DEBUG,"This is a Debug log");
        logger.log(logger.ERROR,"This is a Errorlog");
    }
}