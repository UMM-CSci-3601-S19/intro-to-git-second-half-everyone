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
    builder.append(adamSaysHello());
    builder.append(jaydonSaysHello());
    builder.append(kkSaysHello());
    builder.append(michaelSaysHello());
    builder.append(nicSaysHello());
    builder.append(nicolasSaysHello());
    builder.append(roenSaysHello());
    builder.append(taylorSaysHello());

    return builder.toString();
  }

  private static String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private static String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private static String michaelSaysHello() {
    return "Michael says 'Hello!'\n";
  }

  private static String jaydonSaysHello() {
    return "Jaydon says 'Hello!'\n";
  }

  private static String taylorSaysHello() {
    return "Taylor says 'Hello!'\n";
  }

  private static String roenSaysHello() {
    return "Roen says 'Hey!'\n";
  }

  private static String nicolasSaysHello() { return "Nicolas says 'Yo!'\n"; }

  private static String adamSaysHello() { return "Adam says 'Ha Yee!'\n"; }

}
