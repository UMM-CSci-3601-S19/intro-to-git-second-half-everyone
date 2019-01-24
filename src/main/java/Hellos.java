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

    builder.append(ananyaSaysHello());
    builder.append(averySaysHello());
    builder.append(ellisSaysHello());
    builder.append(foxSaysHello());
    builder.append(jacksonSaysHello());
    builder.append(jaydonSaysHello());
    builder.append(joeSaysHello());
    builder.append(jonSaysHello());
    builder.append(kkSaysHello());
    builder.append(kaelanSaysHello());

    builder.append(lalySaysHello());

    builder.append(leahSay<<<<<<< HEADsHello());
    builder.append(michaelSaysHello());
    builder.append(mitchSaysHello());
    builder.append(nateSaysHello());

    builder.append(ellisSaysHello());
    builder.append(jaydonSaysHello());
    builder.append(kkSaysHello());
    builder.append(michaelSaysHello());

    builder.append(nicSaysHello());
    builder.append(nicolasSaysHello());
    builder.append(roenSaysHello());
    builder.append(sonicSaysHello());
    builder.append(taylorSaysHello());
    builder.append(tylerSaysHello());
    builder.append(utkarshsaysHello());
    builder.append(vantouSaysHello());


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

  private static String tylerSaysHello() { return "Tyler says 'Hey!'\n"; }

  private static String roenSaysHello() {
    return "Roen says 'Hey!'\n";
  }

  private static String nicolasSaysHello() { return "Nicolas says 'Yo!'\n"; }

  private static String adamSaysHello() { return "Adam says 'Ha Yee!'\n"; }


  private static String nicolasSaysHello() { return "Nicolas says 'Yo!'\n"; }

  private static String adamSaysHello() {
    return "Adam says 'Ha Yee!'\n";
  }

  private static String foxSaysHello() {
    return "Fox says 'Fire!'\n";
  }

  private static String aaronSaysHello() { return "Aaron says 'Hello!'\n"; }

  private static String ellisSaysHello() { return "Ellis says 'Hello!'\n"; }

  private static String joeSaysHello(){
    return "Joe says 'Hello!'\n";
  }

  private static String mitchSaysHello(){
    return "Mitch says 'Hello!'\n";
  }

  private static String nateSaysHello() {
    return "Nate says 'Ahoy!'\n";
  }

  private static String leahSaysHello() {
    return "Leah says 'Hewwo!'\n";
  }

  private static String sonicSaysHello() {
    return "Sonic says 'Gotta Go FAST!'\n";
  }

  private static String lalySaysHello() { return "Laly says 'Hello!'\n"; }

  private static String vantouSaysHello() { return "Vantou says 'Hello!'\n"; }

  private static String averySaysHello() { return "Avery says 'Hey!'\n"; }

  private static String utkarshsaysHello() {return "Utkarsh says 'Namaste!'\n";}

  private static String ananyaSaysHello() {return "Ananya says 'hey!'\n"; }

  private static String jacksonSaysHello() {return "Jackson says 'Hi!'\n"; }

  private static String aaronSaysHello() { return "Aaron says 'Hello!'\n"; }


  private static String ellisSaysHello() { return "Ellis says 'Hello!'\n"; }

}
