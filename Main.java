
class Main {
  public static void main(String[] args) {
  char[] x = strinArr("hello");
  for(int i=0; i<x.length; i++){
    System.out.print(x[i]+ ",");
  }
  
  }

public static char[] strinArr(String x){
  char[] yass = new char[x.length()];
  for(int i=0; i<x.length(); i++){
    yass[i] = x.charAt(i);
  }
  return yass;
}


}


/*Write a method called strToArr() that takes in a string and returns an array where each element in the array is one letter from the string. For example, if the string passed in is “Java” then the method should return the array ['J', ‘a’, ‘v’, ‘a’]. 
  */