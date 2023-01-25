import java.util.Arrays;
public class marks {
    public static void main(String[] args) {
        int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;

        int[] marks = new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        System.out.println(marks[2]);
        //length
        System.out.println(marks.length);
        //sort
        //before sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        //after sort
        System.out.println(marks[0]);
        //2D arrays
        int[] marks2 ={97,98,95};
        int[][] finalmarks ={{97,98,95},{95,95,98}};
        System.out.println(finalmarks[1][1]);
        //implicit casting
        double price =100.0;
        double finalPrice = price +18;
        System.out.println(finalPrice);
        //explicit casting
        int p =100;
        int fp = p + (int)18.99; //it won't take double value 18.99 it will take int value 18 
        System.out.println(fp);
        //constant
        //int age = 30;
       // age = 31;
        //age = 32;
        //final float PI =3.14F;
        

    
        
    }

    
}
