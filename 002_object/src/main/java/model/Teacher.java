package model;

public class Teacher {
    private String name;
    private Student[] studentList;

    public Teacher() {
    }

    public Teacher(String name, Student[] studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student stu) {
        Student[] newStuList = new Student[studentList.length + 1];
        for (int i = 0; i < studentList.length; i++) {
            newStuList[i] = studentList[i];
        }
        newStuList[newStuList.length - 1] = stu;
        setStudentList(newStuList);
    }

    public void printAllStudentInfo() {
        System.out.println("==================================");
        System.out.println("我是"+this.name+"老师，我管理的学生如下：");
        for (Student eachStudent : studentList) {
            System.out.println(eachStudent.getName() + "," + eachStudent.getAge() + "," + eachStudent.getGender());
        }
    }
}
