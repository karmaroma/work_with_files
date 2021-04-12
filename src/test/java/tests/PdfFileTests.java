package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class PdfFileTests {
    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/Files/1.pdf";
        String expecetdData = "Как скачать файл с помощью Selenide"; // ошибка в тексте

        PDF pdf = getPdf((pdfFilePath));
        assertThat(pdf, containsText(expecetdData));


    }



}
