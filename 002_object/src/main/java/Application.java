import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student("李莉","20岁","女");
        System.out.println(stu1.getName()+","+stu1.getAge()+","+stu1.getGender());
        stu1.study();
        stu1.rest();

        Student stu2 = new Student("王其","21岁","男");

        Student[] stuArr = {stu1,stu2};
        Student stu3 = new Student("赵毅","22岁","男");

        Teacher teacher = new Teacher("张龙",stuArr);
        teacher.addStudent(stu3);
        teacher.printAllStudentInfo();
    }
}
