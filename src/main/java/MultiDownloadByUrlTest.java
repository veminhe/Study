import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MultiDownloadByUrlTest {
    public static void main(String[] args) throws IOException {
        //如果zip文件不存在则创建zip
        String localZipFile = "D:/temp/testUrl.zip" ;
        File file = new File(localZipFile);
        if(!file.exists()){
            file.createNewFile();
        }
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(localZipFile));
        byte[] buffer = new byte[1024];
        //要批量下载的文件数组
        String[] urls = new String[] {"http://www.baidu.com/img/PCfb_5bf082d29588c07f842ccde3f97243ea.png",
                "https://img-home.csdnimg.cn/images/20201124032511.png"};
        //依次获取批量下载的文件
        for(int i =0; i<urls.length;i++){
            //从数据库中获取文件的路径和文件名,并放入zip文件中
            String urlFile = urls[i];
            out.putNextEntry(new ZipEntry(i+".png"));
            int len;
            URL url = new URL(urlFile);
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
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
