import model.Student;

public class Application {

    public static void main(String[] args) {
        Student stu = new Student("李莉","20岁","女");
        System.out.println(stu.getName()+","+stu.getAge()+","+stu.getGender());
        stu.study();
        stu.rest();
    }
}
