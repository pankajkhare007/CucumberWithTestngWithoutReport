package reports;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ReportClass {

    static String a2Path;
    public static void moveallureresult()  {

        DateTimeFormatter dtn = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        LocalDateTime now = LocalDateTime.now();
        String datetime = "Result" + dtn.format(now);
        String aPath = System.getProperty("user.dir") + "\\allure-results\\";
        File f1 = new File(aPath);
        // File filesList[] = f1.listFiles();
        //System.getProperty("user.dir")+
       // a2Path = System.getProperty("user.dir")+"\\Reports\\AllureReports\\" + datetime;
        a2Path="C:\\Users\\pkhare\\.jenkins\\workspace\\CucumberWithTestngWithoutReport\\allure-results\\";
       // Arrays.stream(new File(a2Path).listFiles()).forEach(File::delete);
        File f2 = new File(a2Path);

            try {
                Files.move(new File(aPath).toPath(), new File(a2Path).toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }


//        File batchf = new File(a2Path + "\\Reports.bat");
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream(batchf);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        DataOutputStream dos = new DataOutputStream(fos);
//        try {
//            dos.writeBytes("cmd /k allure serve " + a2Path);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    public static void deleteDirectory(File file)
    {

        for (File subfile : file.listFiles()) {


            if (subfile.isDirectory()) {
                deleteDirectory(subfile);
            }


            subfile.delete();
        }
    }
}
