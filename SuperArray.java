public class SuperArray{

// 14.(a) instance variables
  private String[] data;
  private int size; //current size
  private int capacity;

// 14. (b) constructor
  public SuperArray(){
    data = new String[10];
    size = 0;
    capacity = 10;
  }

// 15. constructor
  public SuperArray(int initialCapacity){ // create superarray with given starting capacity
    if (initialCapacity<0){
      throw new IllegalArgumentException ("Initial capacity " + initialCapacity + " cannot be negative, you pleb");
    }
    data = new String[initialCapacity];
    size = 0;
    capacity = initialCapacity;
  }

// assignment 14 methods

// 14. (c) size method: return size
  public int size(){
    return size;
  }

// 14. capacity method: not required but here for testing purposes
  public int capacity(){
    return capacity;
  }
// 14. (d) add method: add elements to end of array - modified
  public boolean add(String element){
    if (size>=capacity){
      resize();
    }
    data[size]=element;
    size++;
    return true;
  }

// 14. (e) get method: get element at index
  public String get(int index){
    if (index<0 || index >= size()){
      throw new IndexOutOfBoundsException ("Index " + index + " cannot be negative or greater than the current size of the SuperArray. Smh.");
    }
    return data[index];
  }

// 14. (f) set method: change element at index
  public String set(int index, String element){
    if (index<0 || index >= size()){
      throw new IndexOutOfBoundsException ("Index " + index + " cannot be out of range. Come on dude. I'm disappointed.");
    }
    String old_val=data[index];
    data[index]=element;
    return old_val;
  }

// 14. (g) resize method
  private void resize(){
    String[] bigger = new String[capacity*2];
    for (int i=0; i<size; i++){
      bigger[i]=data[i];
    }
    data = bigger;
    capacity = capacity*2;
  }

//
//
// assignment 15 methods

// 15. clear method
  public void clear(){
    size=0;
    for (int i=0; i<size; i++){
      data[i]=null;
    }
  }

// 15. check if empty method
  public boolean isEmpty(){
    return size==0;
  }


// 15. to string method
  public String toString(){
    String string = "[";
    for (int i=0; i<size-1; i++){
      string+=data[i]+", ";
    }
    if (size!=0){
      string+=data[size-1];
    }
    string+="]";
    return string;
  }

// 15. contains method: check if the superarray contains a given element
  public boolean contains(String s){
    for (int i=0; i < size; i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

// 15. inserts element, shifts right if needed
  public void add(int index, String element){
    if (index<0 || index > size()){
      throw new IndexOutOfBoundsException ("Index " + index + " cannot be out of range. Sigh.");
    }
    if (size>=capacity){
      resize();
    }
    for (int i=(capacity-1); i>=index; i--){
      data[i]=data[i-1];
    }
    data[index]=element; //add element after shift is complete
    size++; //increase size
  }

// 15. removes element, shifts left
  public String remove(int index){
    if (index<0 || index >= size()){
      throw new IndexOutOfBoundsException ("Index " + index + " cannot be negative or greater than the current size of the SuperArray. *facepalm*");
    }
    String elementRemoved=data[index];
    for (int i=index; i<capacity-1; i++){
        data[i]=data[i+1]; //shift left (no need for removal, shifting removes it automatically)
    }
    data[capacity-1]=null;
    size=size-1; //decrease size
    return elementRemoved;
  }

// 15. returns index of first time an element shows up
  public int indexOf(String s){
    for (int i=0; i<size; i++){
      if (data[i].equals(s)){
        return i;
      }
    }
    return (-1);
  }

/* Returns an array containing all of the elements
  in this list in proper sequence (from first to last element).
	The returned array will be "safe" in that
  no references to it are maintained by this list.
  (In other words, this method must allocate a new array).
*/

  public String[] toArray(){
    String[] safe = new String[size];
    for (int i=0; i<size; i++){
      safe[i]=data[i];
    }
    return safe;
  }

//
//
// assignment 16

// 16. (c) last index of
  public int lastIndexOf(String value){
    for (int i=size-1; i>=0; i--){
      if (data[i].equals(value)){
        return i;
      }
    }
    return (-1);
  }

// 16. (d) Checks to see if two superarrays are equal
  public boolean equals(SuperArray other){
    if (size != other.size()){
      return false;
    }
    for (int i=0; i<size(); i++){
      if (! data[i].equals(other.get(i))){
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args){
/*
    SuperArray test = new SuperArray(10);
    SuperArray test2 = new SuperArray(0);
  //  SuperArray testError = new SuperArray(-10);

    test.add("hi");              test.add("hello");            test.add("howdy");
    test.add("greetings");       test.add("good morning");     test.add("hihi");
    test.add("bonjour");         test.add("salut");
    test.add("buenos días");     test.add("hola");

    test.get(1); //should work
  //  test.get(10); //should throw error
  //  test.get(200); //should throw error
    test.get(0); //should work
  //  test.get(-10); //should throw error

    test.set(1, "pie"); //should work
  //  test.set(-1, "piepie"); //should not work
    test.set(0, "piepiepie"); //should work
  //  test.set(10, "piepiepiepie"); //should not work
  //  test.set(200, "piepiepiepiepie"); //should not work

    test.add(10, "PIE"); //should work
  //  test.add(12, "PIE!!"); //should not work
  //  test.add(-1, "PIE PIE PIE PIE PIE PIE"); //should not work

  //  test.remove(11); //should not work
  //  test.remove(-1); //should not work

    try {
    // Code bock that can potentially throw an exception.
    //  If they are not caught, they are said to propagate to the next method.
    SuperArray testError = new SuperArray(-10);
    System.out.println("success");
    }
    catch (IllegalArgumentException e1) {
        // Handle ExceptionType1 exceptions
        System.out.println("fail");
    }
    catch (RuntimeException e2) {
        // Handle ExceptionType2 exceptions
        System.out.println("even more fail");
    }
    */
  }
}
