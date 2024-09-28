import java.io.*;

public class Main {

    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("D:\\Work\\iDEL\\untitled\\src\\notes.txt"))
        {
            byte[] buffer = new byte[256];
            System.out.println("File data:");

            int count;
            while((count = fin.read(buffer)) != -1){
                for (int i = 0; i < count; i ++)
                {
                    System.out.print((char)buffer[i]);
                }
                System.out.println();
                System.out.println(count);
            }
            System.out.println(count);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}