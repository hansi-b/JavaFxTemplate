/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javafx_app.app;

import static javafx_app.app.MessageUtils.getMessage;

import java.util.Arrays;
import java.util.List;

import javafx_app.utilities.StringUtils;


public class App {
    public static void main(String[] args) {
        List<String> tokens  = Arrays.asList(getMessage().split("\s"));
		System.out.println(StringUtils.join(tokens));
    }
}