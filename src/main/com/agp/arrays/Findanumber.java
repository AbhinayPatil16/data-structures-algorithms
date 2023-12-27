package src.main.com.agp.arrays;

class Findanumber {
  public static void main(String[] args) {
    Findanumber mn = new Findanumber();
    int[] intArray = {1,2,3,4,5,6};
    mn.linearSearch(intArray, 4);

  }

  // Search Method
  public void linearSearch(int[] intArray, int value) {
    for(int i=0; i<intArray.length; i++) {
      if (intArray[i] == value) {
        System.out.println("Value is found at the index of " + i);
        return;
      }
    }
    System.out.println(value + " is not found");
  }
}
