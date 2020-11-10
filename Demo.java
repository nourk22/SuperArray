public class Demo{

// 16. (a) removes duplicates
  public static void removeDuplicates(SuperArray s){
    String curr="";
    for (int i=0; i<s.size(); i++){
      curr=s.get(i);
      for (int j=s.indexOf(curr)+1; j<s.size(); j++){
        if (s.get(j).equals(curr)){
          s.remove(j);
          j--;
        }
      }
    }
  }

// 16. (b) finds overlap between two SuperArrays
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray overlap = new SuperArray();
    for (int i=0; i<a.size(); i++){
      for (int j=0; j<b.size(); j++){
        if (a.get(i).equals(b.get(j))){
          overlap.add(a.get(i));
        }
      }
    }
    removeDuplicates(overlap);
    return overlap;
  }


// main method with test cases
  public static void main(String[]args){

    SuperArray tester = new SuperArray(20);

    System.out.println();
    System.out.println("-----------TESTING REMOVE DUPLICATES-----------");

    tester.add("apple");   tester.add("pear");   tester.add("apple");   tester.add("apple");
    tester.add("pear");   tester.add("orange");   tester.add("banana");   tester.add("pear");
    tester.add("pear");   tester.add("strawberry");    tester.add("banana");

    System.out.println("Here's the original array: " + tester);
    System.out.println("Here's its size: " + tester.size());
    System.out.println("Here's its capacity: " + tester.capacity());

  /*  System.out.println();
    removeDuplicates(tester);
    System.out.println();

    System.out.println("Duplicates are removed: " + tester);
    System.out.println("Here's the size: " + tester.size());
    System.out.println("Here's the capacity: " + tester.capacity());
*/
    System.out.println();
    System.out.println();

    /*  SuperArray words = new SuperArray();
      //grouped to save vertical space
      words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
      words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
      words.add("una");    words.add("ebi");     words.add("toro");

      System.out.println(words);
      removeDuplicates(words);
      System.out.println(words);
      */

    System.out.println("-----------TESTING FIND OVERLAPS-----------");

    SuperArray fruits = new SuperArray(20);

    System.out.println();

    fruits.add("apple");   fruits.add("pear");   fruits.add("apple");   fruits.add("apple");
    fruits.add("blueberry");   fruits.add("orange");   fruits.add("banana");   fruits.add("pear");
    fruits.add("blackberry");   fruits.add("blueberry");    fruits.add("banana");

    System.out.println("Here's the original array: " + fruits);
    System.out.println("Here's its size: " + fruits.size());
    System.out.println("Here's its capacity: " + fruits.capacity());

    System.out.println();
    System.out.println();
    System.out.println("Here is the overlap: " + findOverlap(tester, fruits));



  }
}
