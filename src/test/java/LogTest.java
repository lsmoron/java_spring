import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by luke on 4/16/14.
 */
public class LogTest {
    @Test
    public void simpleTest(){
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }
}
