import java.util.*;
public class Student {
    String name;
    int year;
    int studentID;
    ArrayList<Integer> uniqueID = new ArrayList<Integer>();
    ArrayList<Integer> tuition = new ArrayList<Integer>();
    ArrayList<String> courseArray = new ArrayList<String>();
    ArrayList<Integer> balance = new ArrayList<Integer>();
    int tuitionCost;
    int balanceNum;
    boolean run = true;
    public Student(String name, int year) {
        this.name = name;
        this.year = year;
        int[] numberArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i <= 3; i++) {
            int m = (int) (Math.random() * 9);
            uniqueID.add(numberArr[m]);
        }
        uniqueID.add(0, year);
        System.out.println(uniqueID);
        System.out.println(balanceNum);
        System.out.println(courseArray);
    }
    public void enroll() {
        System.out.println("How many courses will the student take?: ");
        Scanner in = new Scanner(System.in);
        int courseNum = in.nextInt();
        for(int i = 0; i < courseNum; i++) {
            System.out.println("Enter the course name: ");
            Scanner c = new Scanner(System.in);
            String course = c.nextLine();
            courseArray.add(course);
            tuition.add(600);
            tuitionCost += tuition.get(i);
        }
        System.out.println(tuitionCost);
        System.out.print(courseArray);
    }
    public void addBalance() {
        while(run) {
            System.out.println("Please enter a deposit: ");
            Scanner i = new Scanner(System.in);
            int balNum = i.nextInt();
            balance.add(balNum);
            for (int j = 0; j < balance.size(); j++) {
                balanceNum += balance.get(j);
            }
            if(balNum == 0) {
                run = false;
            }
        }
        System.out.println(balanceNum);
    }
    public void payment() {
       balanceNum = balanceNum - tuitionCost;
    }

}
