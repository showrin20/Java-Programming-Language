import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("Input your name: ");
        String name = sc.next();
        System.out.println(name);

        System.out.println("Input your sentence: ");
        String sent = sc.nextLine();
        System.out.println(sent);

    }

}
