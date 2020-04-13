
package GradesP;
import java.util.*;


public class TestGrades {
    public static void main(String[] args){
Grades tex = new Grades();
       
        tex.stuff();
        tex.numOfGrades();
        tex.bubbasort();
        tex.highest();
        tex.lowest();
        tex.average();
        tex.numfails(65);
        
        System.out.println("Alphanumerical breakdown by grade range");
        
        tex.histogramA();
        tex.histogramB();
        tex.histogramC();
        tex.histogramD();
        tex.histogramF();
      
    }
    }