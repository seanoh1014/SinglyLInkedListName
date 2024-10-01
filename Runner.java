import java.util.*;

public class Runner {

  public static void main(String[] args) {

      NamesList list = new NamesList();

      list.add("aaa");
      list.add("AAA");
      list.add("Nisha");
      list.add("ZZZ");
      list.add("YYY");
      list.add("Rohit");
      list.add("Katie");
      list.add("zzz");
      list.add("Andy");
      list.add("Nalla");

      System.out.println(list);

      list.remove("zzz");
  }
}

