public class SuperArray{
  private String[] data;
  private int size; //current size

// constructors

// from ASSIGNMENT 14
  public SuperArray(){
    String[] data = new String[10];
  }

// from ASSIGNMENT 15
//CREATE SUPERARRAY WITH GIVEN STARTING CAPACITY
  public SuperArray(int initialCapacity){
    String[] data = new String[initialCapacity];
  }

// methods

//RETURN SIZE
  public int size(){
    return size;
  }

//RETURN ELEMENT AT GIVEN INDEX
  public String get(int index){
    return data[index];
  }


//CHANGE ELEMENT AT GIVEN INDEX
  public String set(int index, String element){
    String old_val=data[index];
    data[index]=element;
    return old_val;
  }

//ADD ELEMENTS TO STRING
  public boolean add(String element){
    if (size<data.length){
      data[size]=element;
      size++;
      return true;
    }else if (size>=data.length){
      //Problem: program  might crash if the size is still > than the resize
      //how to fix?
      //while loop that repeats until size is < length of array
      while (size>=data.length){
        resize();
      }
      data[size]=element;
      size++;
      return true;
    }
    //this shouldn't happen
    return false;
  }

//RESIZE
  private void resize(){
    String[] bigger = new String[data.length*2];
    for (int i=0; i<data.length; i++){
      bigger[i]=data[i];
    }
    data = bigger;
  }

// from ASSIGNMENT 15

//CLEARS LIST
  public void clear(){
    size=0;
    for (int i=0; i<size; i++){
      data[i]=null;
    }
  }

//RETURNS TRUE IF LIST IS EMPTY
  public boolean isEmpty(){
    return size==0;
  }


//TO STRING
  public String toString(){
    String string = "[";
    for (int i=0; i<size-2; i++){
      string+=data[i]+", ";
    }
    string+=data[size-1]+"]";
    return string;
  }

//RETURNS TRUE IF LIST CONTAINS GIVEN ELEMENT
  public boolean contains(String s){
    for (int i=0; i < size; i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

//INSERTS ELEMENT AT SPECIFIED POS; SHIFTS EVERYTHING RIGHT IF NEEDED
  public void add(int index, String element){
    if (index+1>=data.length){
      //Problem: program  might crash if the size is still > than the resize
      //how to fix?
      //while loop that repeats until size is < length of array
      while (index>=data.length){
        resize();
      }
    }

    if (index<data.length){
      //if shift not necessary
      if (data[index]==null){
        data[index]=element;
      }
      //shift
      for (int i=(data.length-1); i>=index && i<(data.length-index); i=i-1){
        data[i]=data[i-1];
        if (i==index){
          data[i]=element; //add element after shift is complete
        }
      }
      size++; //increase size
    }else{
      //this shouldn't happen
      System.out.println(";-;");
    }
  }

//REMOVES ELEMENT AT SPECIFIED POS; SHIFTS EVERYTHING LEFT IF NEEDED
  public String remove(int index){
    String elementRemoved=data[index];
    for (int i=index; i<(data.length); i++){
        data[i]=data[i+1]; //shift left (no need for removal, shifting removes it automatically)
    }
    size=size-1; //decrease size
    return elementRemoved;
  }

//RETURNS INDEX OF FIRST OCCURRENCE OF ELEMENT OR -1 IF IT'S NOT THERE
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

//not fully sure about this one (regarding memory things)
  public String[] toArray(){
    String[] safe = new String[data.length];
    String placeholder="";
    for (int i=0; i<data.length; i++){
      placeholder=data[i];
      safe[i]=placeholder;
    }
    return safe;
  }

  public static void main(String[] args){
  }
}
