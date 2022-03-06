package javafx_app.app;

import static javafx_app.app.MessageUtils.getMessage;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx_app.utilities.StringUtils;

public class App {

	private static final Logger log = LogManager.getLogger();

	public static void main(String[] args) {
		List<String> tokens = Arrays.asList(getMessage().split("\s"));
		log.info(StringUtils.join(tokens));
	}
}
