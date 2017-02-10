public class HelloWorld {

  private String helloStr = "Hello World!";

  public String sayHello(String name) {
      return helloStr + name + "!";
  }

  public static void main(String [] args) {
    HelloWorld helloWorld =  new HelloWorld();
    System.out.println(helloWorld.sayHello("Wendll"));
  }
}
