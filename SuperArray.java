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
    return data[index];
  }

// 14. (f) set method: change element at index
  public String set(int index, String element){
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
  }
}
