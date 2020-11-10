import java.util.Arrays;

public class Tester{

  public static void main(String[] args){
    //Assignment 14 tests
    SuperArray test = new SuperArray();

    System.out.println();
    System.out.println("TESTING ASSIGNMENT 14");
    System.out.println();
    System.out.println();
    System.out.print("Here is the empty SuperArray:");
    System.out.println(test);
    System.out.print("Here is its size:");
    System.out.print(test.size());
    System.out.println();
    System.out.println();

    System.out.println("Now I will add 10 greetings to the superarray.");
    test.add("hi");
    test.add("hello");
    test.add("howdy");
    test.add("greetings");
    test.add("good morning");
    test.add("hihi");
    test.add("bonjour");
    test.add("salut");
    test.add("buenos días");
    test.add("hola");

    System.out.println("Here is the new SuperArray:");
    System.out.print(test);
    if (test.size()!=10){
      System.out.println("oh no! something's wrong");
    }
    System.out.println();
    System.out.println();

    System.out.println("Now let's try to add an 11th element, which should make it resize.");
    test.add("ca va?");
    if (test.size()==11 && test.capacity()==20){
      System.out.println("success!");
    }else{
      System.out.println("uh oh... looks like something went wrong");
    }
    System.out.println("New capacity of array: "+test.capacity());

    System.out.println();
    System.out.println();
    System.out.println("Wait... what is this mysterious 11th element that we just added?");
    System.out.println("The 11th element is: " + test.get(10));

    System.out.println();
    System.out.println();
    System.out.println("Ok, great! Not gonna lie, I don't really like this 11th element, so let's change it.");
    test.set(10, "Goodbye");
    if (test.get(10).equals("Goodbye")){
      System.out.println("Mission successful!");
    }else{
      System.out.println("Mission failed (womp womp womp)");
    }

    System.out.println();
    System.out.println();
    System.out.println("-----------ASSIGNMENT 14 TESTING COMPLETE-----------");

    System.out.println();
    System.out.println();

    System.out.println("TESTING ASSIGNMENT 15");

    System.out.println();
    System.out.println();

    System.out.print("I've changed my mind. ");
    System.out.print("I don't feel like this last element really fits with the rest of the array, ");
    System.out.println("you know, especially considering that it's ~not~ a greeting.");
    System.out.println("I'm gonna remove it.");
    System.out.println("Here's the element I removed: "+test.remove(10));

    System.out.println();

    System.out.println("Back to our array of only greetings. Good riddance! We don't need that negativity in our lives.");
    System.out.println(test);
    System.out.println("Here's the current size of this array, in case you can't count: " + test.size());
    System.out.println("Did everything shift properly?");
    if (test.get(11)==null){
      System.out.println("The answer is YES!");
    }else{
      System.out.println("The answer is NO! ;-;");
    }

    System.out.println();
    System.out.println();

    System.out.println("I forgot if my string contains 'hello'! Let's check.");
    System.out.println("Hint hint: It should.");
    if (test.contains("hello")){
      System.out.println("it does! (success!)");
    }else{
      System.out.println("Uh oh... go back and check your contains method.");
    }

    System.out.println();

    System.out.println("Now, let's check if it contains 'goodbye'.");
    System.out.println("Hint hint: It should not.");
    if (test.contains("goodbye")){
      System.out.println("Uh oh... go back and check your contains method.");
    }else{
      System.out.println("it doesn't! (success!)");
    }

    System.out.println();
    System.out.println();

    System.out.println("I want to add an element in the middle.");
    System.out.println("Element to add: HELLO");
    System.out.println("Index for insertion: 3");
    test.add(3, "HELLO");
    System.out.println("What does our array look like now?");
    System.out.println(test);
    if (test.size()==11 && test.capacity()==20){
      System.out.println("success!");
    }else{
      System.out.println("Check your add method for assignment #15");
    }

    System.out.println("Let's add another one.");
    System.out.println("Element to add: Croissant");
    System.out.println("Index for insertion: 11");
    test.add(11, "Croissant");
    System.out.println("What does our array look like now?");
    System.out.println(test);
    if (test.size()==12 && test.capacity()==20){
      System.out.println("success!");
    }else{
      System.out.println("Check your add method for assignment #15");
    }

    System.out.println();
    System.out.println();

    test.add("Croissant");
    System.out.println("Testing indexOf method");
    if (test.indexOf("HELLO")!=3 || test.indexOf("Croissant")!=11 || test.indexOf("not an element in this array")!=-1){
      System.out.println("We've got a problem.");
    }else{
      System.out.println("All good!");
    }

    System.out.println();
    System.out.println();
    System.out.println("Testing toArray method");
    System.out.println(test.toArray());
    System.out.println(Arrays.toString(test.toArray()));

    System.out.println();
    System.out.println();
/*
    System.out.println("Next up: let's clear our superarray.");
    test.clear();
    System.out.println("Back to an empty array: " + test);
    System.out.println("Size is " + test.size());
    System.out.println("Capacity is " + test.capacity());

    System.out.println();
    System.out.println("Let's confirm that it's empty.");
    if (test.isEmpty()){
      System.out.println("It is!");
    }else{
      System.out.println("The isEmpty function is being wonky...");
    }

    System.out.println();
    System.out.println(); */
    System.out.println("-----------ASSIGNMENT 15 TESTING COMPLETE-----------");

    System.out.println();
    System.out.println();

    System.out.println("TESTING ASSIGNMENT 16");
    System.out.println();

    SuperArray tester = new SuperArray(20);

    System.out.println();

    tester.add("apple");   tester.add("pear");   tester.add("apple");   tester.add("apple");
    tester.add("pear");   tester.add("orange");   tester.add("banana");   tester.add("pear");
    tester.add("pear");   tester.add("strawberry");    tester.add("banana");

    System.out.println("Here's the original array: " + tester);
    System.out.println("Here's its size: " + tester.size());
    System.out.println("Here's its capacity: " + tester.capacity());

    System.out.println();
    System.out.println();
    System.out.println("Testing last index of method (16c:)");
    System.out.println("1. Last index of 'apple'");
    if (tester.lastIndexOf("apple")==3){
      System.out.println("Test 1 PASSED");
    }else{
      System.out.println("Test 1 FAILED");
    }
    System.out.println("2. Last index of 'pear'");
    if (tester.lastIndexOf("pear")==8){
      System.out.println("Test 2 PASSED");
    }else{
      System.out.println("Test 2 FAILED");
    }
    System.out.println("3. Last index of 'banana'");
    if (tester.lastIndexOf("banana")==10){
      System.out.println("Test 3 PASSED");
    }else{
      System.out.println("Test 3 FAILED");
    }
    System.out.println("4. Last index of 'orange'");
    if (tester.lastIndexOf("orange")==5){
      System.out.println("Test 4 PASSED");
    }else{
      System.out.println("Test 4 FAILED");
    }
    System.out.println("5. Last index of 'strawberry'");
    if (tester.lastIndexOf("strawberry")==9){
      System.out.println("Test 5 PASSED");
    }else{
      System.out.println("Test 5 FAILED");
    }

    System.out.println();
    System.out.println();
    System.out.println("Testing equal superarrays method:");

    SuperArray fruit = new SuperArray(20);

    System.out.println();

    fruit.add("apple");   fruit.add("pear");   fruit.add("apple");   fruit.add("apple");
    fruit.add("pear");   fruit.add("orange");   fruit.add("banana");   fruit.add("pear");
    fruit.add("pear");   fruit.add("strawberry");    fruit.add("banana");

    System.out.println("FRUIT: Here's the original array: " + fruit);
    System.out.println("FRUIT: Here's its size: " + tester.size());
    System.out.println("FRUIT: Here's its capacity: " + tester.capacity());

    System.out.println();
    System.out.println("TEST 1: fruit should be equal to tester.");
    if (tester.equals(fruit)){
      System.out.println("Test 1: PASSED");
    }else{
      System.out.println("Test 1: FAILED");
    }

    System.out.println("TEST 2: fruit should not be equal to test.");
    if (! fruit.equals(test)){
      System.out.println("Test 2: PASSED");
    }else{
      System.out.println("Test 2: FAILED");
    }

    fruit.add("blueberry");
    System.out.println("TEST 3: fruit should NOT be equal to tester.");
    if (! tester.equals(fruit)){
      System.out.println("Test 3: PASSED");
    }else{
      System.out.println("Test 3: FAILED");
    }




  }
}
