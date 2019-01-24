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
    builder.append(averySaysHello());
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());
    builder.append(utkarshsaysHello());

    return builder.toString();
  }

  private static String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private static String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private static String averySaysHello() { return "Avery says 'Hey!'\n"; }

  private static String utkarshsaysHello() {return "Utkarsh says 'Namaste!'\n";}

}
