package tests;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.getPdf;
import static utils.Files.getXls;

public class XlsFileTests {
    @Test
    void xlsSimpleTest() throws IOException {
        String xlsFilePath = "./src/test/resources/Files/1.xls";
        String expecetdData = "test5"; // ошибка в тексте

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expecetdData));

    }

    @Test
    void xlsCellTest() throws IOException {
        String xlsFilePath = "./src/test/resources/Files/1.xls";
        String expecetdData = "test5"; // ошибка в тексте

        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(0).getCell(4).toString();
        assertThat(actualData, containsString(expecetdData));

    }



}
