package killexcel;

import java.io.IOException;

public class KillExcel {

    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("taskkill /IM EXCEL.EXE");
        p.destroy();
    }
}
