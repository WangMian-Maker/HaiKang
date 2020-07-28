import java.io.UnsupportedEncodingException;

public class DLLPath {
    public static String DLL_PATH;
    static{
        String path=(DLLPath.class.getResource("/DLL/").getPath()).replaceAll("%20", " ")
                .substring(1).replace("/", "\\");
        try {
            DLL_PATH= java.net.URLDecoder.decode(path,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("======================================"+DLL_PATH);
    }
}
