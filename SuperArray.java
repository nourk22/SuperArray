public class SuperArray{
  private String[] data;
  private int size; //current size

// constructors
  public SuperArray(){
    String[] data = new String[10];
  }

//methods
//c
  public int size(){
    return size;
  }

//d
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


//e
  public String get(int index){
    return data[index];
  }

//f
  public String set(int index, String element){
    String old_val=data[index];
    data[index]=element;
    return old_val;
  }

//g
  private void resize(){
    String[] bigger = new String[data.length+10];
    for (int i=0; i<data.length; i++){
      bigger[i]=data[i];
    }
    data = bigger;
  }

//11.4.20
  public boolean isEmpty(){
    return size==0;
  }

  public void clear(){
    size=0;
    for (int i=0; i<size; i++){
      data[i]=null;
    }
  }

//to String
  public String toString(){
    String string = "[";
    for (int i=0; i<size-1; i++){
      string+=data[i]+", ";
    }
    string+=data[size]+"]";
    return string;
  }

//Returns true if this list contains the specified element
  public boolean contains(String s){
    boolean contains=false;
    for (int i=0; i < size; i++){
      if (data[i].equals(s)){
        contains=true;
      }
    }
    return contains;
  }


  public static void main(String[] args){
  }
}
