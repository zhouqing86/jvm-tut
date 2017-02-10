import java.io.*;

public class ReadClassFile {
  public static void main(String [] args) {
    try {
      FileInputStream inputStream = new FileInputStream("HelloWorld.class");
      DataInputStream stream = new DataInputStream(inputStream);
      System.out.println(String.format("%X",stream.readInt())); // magic: CAFEBABE
      System.out.println(String.format("%X",stream.readUnsignedShort())); //minor_version: 0
      System.out.println(stream.readUnsignedShort()); //major_version: 51
      System.out.println(stream.readUnsignedShort()); //constant_pool_count: 53
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("IOException happen");
      e.printStackTrace();
    }
  }
}
