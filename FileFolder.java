import java.io.File;
public class FileFolder{
    public static void main(String[] args){
        File f = new File("C:\\mass");
        f.mkdir();
        System.out.print("Folder Creater Sucessfully");
    }
}