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
    builder.append(aaronSaysHello());
    builder.append(adamSaysHello());
    builder.append(ellisSaysHello());
    builder.append(jaydonSaysHello());
    builder.append(jonSaysHello());
    builder.append(kkSaysHello());
    builder.append(kaelanSaysHello());
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

  private static String kaelanSaysHello() {
    return "Kaelan says 'Hi!'\n";
  }

  private static String jonSaysHello() {
    return "Jon says 'Yo!'\n";
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

  private static String aaronSaysHello() { return "Aaron says 'Hello!'\n"; }

  private static String ellisSaysHello() { return "Ellis says 'Hello!'\n"; }

}
