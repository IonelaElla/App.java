package ro.siit.gad.session5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Locale;

public class ReadString {

    static Logger LOGGER = LogManager.getLogger(ReadString.class);
    public static void main(String[] args) {
        LOGGER.info("program started" + args[2]);
        // java ReadString arg0 arg1 "arg2 arg2 bis" arg3 100
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println(args[4] + args[4] );

        try {
            Integer number = Integer.parseInt(args[4]);
            System.out.println(number + number);
            args[5].toUpperCase(Locale.ROOT);
            main(number);
        } catch (NumberFormatException numberFormatException){
            LOGGER.debug("A aparut aceasta exceptie: " + numberFormatException.getMessage(), numberFormatException);
        } catch (MyException myException){
            LOGGER.debug("MyException appeared", myException);
        } catch(Exception ex){
            LOGGER.error("a aparut o exceptie " + ex.getMessage(), ex);
        } finally {
            System.out.println("this is finally");
        }

        System.out.println("Super!");
    }

    static void main(Integer number) throws MyException{
        LOGGER.debug("Main method called with " + number);
        throw new MyException();
    }
}
