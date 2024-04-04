import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MultiDownloadTest {
    public static void main(String[] args) throws IOException {
        //如果zip文件不存在则创建zip
        String localZipFile = "D:/temp/test.zip" ;
        File file = new File(localZipFile);
        if(!file.exists()){
            file.createNewFile();
        }
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(localZipFile));
        //要批量下载的文件数组
        String[] ids = new String[] {"11.docx","22.xlsx"};
        byte[] buffer = new byte[1024];
        //依次获取批量下载的文件
        for(int i =0; i<ids.length;i++){
            String fileName = ids[i];
            out.putNextEntry(new ZipEntry(fileName));
            int len;
            FileInputStream inStream = new FileInputStream(new File("D:/temp/"+fileName));
            //读入需要下载的文件的内容，打包到zip文件
            while ((len = inStream.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            out.closeEntry();
            inStream.close();
        }
        out.close();
    }

}
