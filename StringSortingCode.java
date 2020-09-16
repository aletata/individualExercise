import java.util.Arrays;
public static void main(String[] args) {
 
 String []str = {"abc","bca","cab","cba","aaa","111","232","112","ABC"};
 
 Arrays.sort(str);
 
 //A for loop to print out the sorted String Array
 for(int i=0;i<str.length;i++){
  System.out.println(str[i]);
 }
}
