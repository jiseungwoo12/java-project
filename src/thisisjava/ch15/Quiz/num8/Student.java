package thisisjava.ch15.Quiz.num8;

public class Student {
    public int StudentNum;
    public String name;

    public Student(int studentNum,String name){
        this.StudentNum = studentNum;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return StudentNum;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Student student){
            if (student.StudentNum == this.StudentNum){
                return true;
            }
        }
        return false;
    }

}
