interface father {
}

interface mother {
}

interface porgrammer {
  public void coding();
}

interface believer {
}

class Steve implements father, porgrammer, believer {
  public void coding() {
    System.out.println("fast");
  }
}

class Summer implements mother, porgrammer {
  public void coding() {
    System.out.println("smart");
  }
}

public class Workspace {
  public static void main(String[] arg) {
    porgrammer employee1 = new Steve();
    porgrammer employee2 = new Summer();

    employee1.coding();
    employee2.coding();
  }

}
