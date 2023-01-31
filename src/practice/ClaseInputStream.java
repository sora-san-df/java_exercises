package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
public class ClaseInputStream {

    public static void main(String[] args) {

        try{
            InputStream  myReader = new FileInputStream("C:/Users/User/IdeaProjects/Hehe.txt");
            BufferedInputStream myReaderBuffeado = new BufferedInputStream(myReader);

            int byteReaded;

            while((byteReaded = myReaderBuffeado.read())!= -1){
                System.out.print((char)byteReaded);
            }
            myReader.close();
        }catch(IOException e){
            System.out.println("Something went wrong my dude " + e.getMessage());
        }

    }
}
