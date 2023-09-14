package Day6;

import java.io.*;

public class FileNot {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\mariappan.sivakumar\\Documents\\Java\\practice\\src\\Day6\\text.txt");
        FileReader fileReader;

        {
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                System.out.println(bufferedReader.readLine());
                System.out.println(bufferedReader.readLine());
            } catch (FileNotFoundException e) { //exception is capture here
                throw new RuntimeException(e); // new exeption is thrown here  this is chained excepition
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
