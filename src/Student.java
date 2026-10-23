public class Student {
    String emri;
    int nota;
    String email;

  public void afishoTeDhenat(){
      IO.println("Emri: " + emri);
      IO.println("Nota: " + nota);
      IO.println("Email: " +  email);
  }

  public boolean kaKaluar(){
      return nota >= 5;
  }

    public String rezultati() {
        if (nota >= 5) {
            return "Kalues";
        }
        return "Jo kalues";
    }
}
