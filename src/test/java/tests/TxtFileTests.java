package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;

public class TxtFileTests {
    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/Files/1.txt";
        String expecetdData = "Welcome to my world1!"; // ошибка в тексте

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expecetdData));

    }

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/Files/1.csv";
        String expecetdData = "Welcome to my world!";

        String actualData = readTextFromPath(csvFilePath);

        assertThat(actualData, containsString(expecetdData));

    }





}
