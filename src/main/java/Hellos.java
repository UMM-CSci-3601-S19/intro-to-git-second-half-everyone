/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public static final String WELCOME_LINE = "Hello, folks!";

  public static void main(String[] args) {
    String output = generateOutput();
    System.out.println(output);
  }

  public static String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(WELCOME_LINE + "\n");
    builder.append(kkSaysHello());
    builder.append(leahSaysHello());
    builder.append(nateSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private static String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private static String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private static String nateSaysHello() {
    return "Nate says 'Ahoy!'\n";
  }

  private static String leahSaysHello() {
    return "Leah says 'Hewwo!'\n";
  }



}
