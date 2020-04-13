
package GradesP;
import java.util.*;

public class Grades {
 
  private int[] values;
  private double sum;
  private double numbofgs; 
  int gradeValue = 65;
  int max;
  int min;
  int valuesum = 0;
  int valueamt = 0;
  double avg = 0;
  int fails = 0;
  int nopass = 0;
  int[] gradez;
  int i = 0;
  int enter = 1;
  int j = 0;
  int q = 0;
  int z = 0;
  int temp = 0;
  int input = 0;
  int enterr = 0;
  int x = 0;
  
  
  

  Grades () {
      
  }
  
  Grades (int[] gradez) {
      
  }
  
  public int[] getValues() {    // returns values array
      return values;
  }
  
  public void setValues(int[] gradez) {      // set values declaration
      values = gradez;  
  }
  
  public double getsum(){
      return sum;
  }
  
  public void setsum(double sum){
      this.sum = sum;
  }
  
  public double getnumbofgs(){
      return numbofgs;
  }
  
  public void setnumbofgs(double numbofgs){
      this.numbofgs = numbofgs;
  }

//  =========================================================================================
  
  public int highest(){         // returns the highest value in array
      max = 0;
      for (int i = 0; i < gradez.length; i++){
//          System.out.println(gradez[i]);
           if(max < gradez[i]){
              max = gradez[i];
          }    
      }
      System.out.println("The highest grade is " + max);
      return max;
      
      
  }     

//  =========================================================================================
  
  public int lowest() {         // returns the lowest value in array
      
      min = 102;
      for (int i = 0; i < gradez.length; i++){
           if(min > gradez[i]){
              min = gradez[i];
          }      
      }
      System.out.println("The lowest grade is " + min);
          return min;
      
  } 
  
//  =========================================================================================
  
  public void stuff(){
      int[] list;
      
      System.out.println("How many grades are you entering?");
      
      Scanner scan = new Scanner(System.in);
         j = scan.nextInt();              //value IS THE NUMBER OF ELEMENTS IN THE ARRAY
//      
       gradez = new int[(j)];     //gradez IS THE NAME OF THE ARRAY
//      
        if (j > 0){
        System.out.println("Enter your grades");
        } 
//        
      for(i = 0; i < gradez.length; i++){
          System.out.print("Grade #" + enter + ": ");
          gradez[i] = scan.nextInt();
        enter ++;
      }
      
      
    System.out.println("Entries are as follows... " + Arrays.toString(gradez) + ".");  
//    System.out.println("Array length is" + gradez.length);
    
  }

//  =========================================================================================
  
    public int numOfGrades() {    // returns the number of grades in array
     
      System.out.println("There are " + gradez.length + " entries in this list of grades");
      
    
    return gradez.length;
  } 
  
//  =========================================================================================
  
  public double average() {     // returns the average of array };

    valuesum = 0;
    valueamt = 0;
for (int i = 0; i < gradez.length; i++){
    valuesum = valuesum + gradez[i];
    valueamt++;
    }
      avg = (double) valuesum / valueamt; 
      System.out.println("Average is " + avg);
      return avg;
  }
  
//  =========================================================================================
  
  public int numfails(int gradeValue) {         
// returns the number of values 
//      in the array that are less than input value, gradeValue 
      fails = 0;
      for (int i = 0; i < gradez.length; i++){
          if (gradeValue > gradez[i] ){
           fails ++;   
          }
    }
      if (fails > 1) {
      System.out.println(fails + " grades were below the passing mark.");
      } else System.out.println(fails + " grade was below the passing mark.");
      return fails;
      
  }
  
//  =========================================================================================
  
  public void histogramA() { // prints the histogram of grades };
      System.out.print("90-100 ---- ");
      
      for(i = 0; i < gradez.length; i++){
        if (gradez[i] >= 90 && gradez[i] <= 100){
                System.out.print("* ");
                
          }
           
      }
      System.out.print("\n");
}
  
  
  //  =========================================================================================
  
  public void histogramB() { // prints the histogram of grades };
      System.out.print("80-89 ---- ");
      
      for(i = 0; i < gradez.length; i++){
       if (gradez[i] >= 80 && gradez[i] <= 89){
                System.out.print("* ");
          }
          
           
      }
      System.out.print("\n");
}
 
  
  //  =========================================================================================
  
  public void histogramC() { // prints the histogram of grades };
      System.out.print("70-79 ---- ");
      
      for(i = 0; i < gradez.length; i++){
          if (gradez[i] >= 70 && gradez[i] <= 79){
                System.out.print("* ");
          }
              
      }
      System.out.print("\n");
}
  
  
  //  =========================================================================================
  
  public void histogramD() { // prints the histogram of grades };
      System.out.print("65-69 ---- ");
      
     for(i = 0; i < gradez.length; i++){
          if (gradez[i] >= 65  && gradez[i] <= 69){
                System.out.print("* ");
          }
             
      }
     System.out.print("\n");
}
  
  
 //  =========================================================================================
  
  public void histogramF() { // prints the histogram of grades };
      System.out.print("0-64 ---- ");
      
     for(i = 0; i < gradez.length; i++){
          if (gradez[i] < 64){
                System.out.print("* ");
          }
           
      }
     System.out.print("\n");
}
  
 //  =========================================================================================
    
  public void bubbasort() {
	  
System.out.println("The original order of the grades entered was " + Arrays.toString(gradez));
      
//      THE BUBBLE SORT ALGORHITHM AT ITS FINEST 
      
      for(q = gradez.length - 1; q > 0; q--){
          for(z = 0; z < q; z++){
              if(gradez[z] > gradez[z + 1]){
                  temp = gradez[z];
                  gradez[z] = gradez[z + 1];
                  gradez[z + 1] = temp;
                  
//      THE BUBBLE SORT ALGORHITHM AT ITS FINEST 
              }
          }
      }
   
      System.out.println("After using the bubble sort algorithm, ");
      System.out.print("The order of the entered grades is now: [");
          
              System.out.println(Arrays.toString(gradez));
              
          }
      
      
      
	  
  }
  
  


