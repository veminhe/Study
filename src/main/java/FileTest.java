import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
    public static boolean check(String path) {
        try {
            FileReader fr = new FileReader(path);// 字符流
            BufferedReader br = new BufferedReader(fr);// 缓冲流

            StringBuffer sb = new StringBuffer();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            String content = sb.toString();

            if (content.contains("<<seal>>")) {
                return true;
            }

//            // 单行
//            if (content.contains("//") && content.contains("abc")) {
//                return true;
//            }
//
//            // 多行
//            if (content.contains("/*") && content.contains("abc") && content.contains("*/")) {
//                int start = content.indexOf("/*");
//                int end = content.indexOf("*/");
//
//                String innerContent = "";
//                if (start <= end) {// */ /*  abc
//                    innerContent = content.substring(start, end);
//                }
//
//                if (innerContent.contains("abc")) {
//                    return true;
//                }
//            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        String path = "E://fileTest.docx";
        boolean res = check(path);
        System.out.println("result:" + res);
    }
}