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
    for (int i=0; i<size-1; i++){
      string+=data[i]+", ";
    }
    string+=data[size]+"]";
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



  public static void main(String[] args){
  }
}
