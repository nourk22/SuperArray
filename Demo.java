public class Demo{

// 16. (a) removes duplicates
  public static void removeDuplicates(SuperArray s){
    String curr="";
    for (int i=0; i<s.size(); i++){
      curr=s.get(i);
      for (int j=s.indexOf(curr)+1; j<s.size(); j++){
        if (s.get(j).equals(curr)){
          s.remove(j);
          i--;
        }
      }
    }
  }

  public static void main(String[]args){

    SuperArray tester = new SuperArray(20);

    System.out.println();
    System.out.println("-----------TESTING REMOVE DUPLICATES-----------");
    tester.add("apple");
    tester.add("pear");
    tester.add("apple");
    tester.add("apple");
    tester.add("pear");
    tester.add("orange");
    tester.add("banana");
    tester.add("pear");
    tester.add("pear");
    tester.add("strawberry");
    tester.add("banana");
    System.out.println("Here's the original array: " + tester);
    System.out.println("Here's its size: " + tester.size());
    System.out.println("Here's its capacity: " + tester.capacity());
    System.out.println();
    removeDuplicates(tester);
    System.out.println();
    System.out.println("Duplicates are removed: " + tester);
    System.out.println("Here's the size: " + tester.size());
    System.out.println("Here's the capacity: " + tester.capacity());

    System.out.println();
    System.out.println();

    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
