public class operators {
    public static void main(String[] args){
        //arithmatic

        int a = 1;
        int b = 2;
        int sum = a+b;
        int diff =a-b;
        int mul = a*b;
        int div= a/b; //won't count float values 1/2=0.5 but it will count 0
        System.out.println(mul);
        System.out.println(diff);
        System.out.println(sum);
        System.out.println(div);
        double c = 20;
        double d = 30;
        double div2 =c/d;
        double mod2 = c%d;
        System.out.println(mod2);
        System.out.println(div2);

        //assignment operator =
        
        int numb =3;
        numb = numb +1;
        int num =3;
        //using binary operator
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(numb);


    }
    
}
