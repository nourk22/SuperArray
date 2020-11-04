public class SuperArray{
  private String[] data;
  private int size; //current size

// constructors
  public SuperArray(){
    String[] data = new String[10];
  }

//methods
  public int size(){
    return size;
  }

  public boolean add(String element){
    if (size<data.length){
      data[size]=element;
      size++;
      return true;
    }
    return false;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String old_val=data[index];
    data[index]=element;
    return old_val;
  }


  public static void main(String[] args){
  }
}
