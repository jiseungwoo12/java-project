package thisisjava.ch12.checkproblem.number1;

public class Student {
    private String studentNum;

    public Student(String studentNum){
        this.studentNum = studentNum;
    }

    public String getStudentNum(){
        return studentNum;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Student){
            Student target = (Student)obj;
            if(this.studentNum.equals(target.studentNum)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return studentNum.hashCode();
    }
}
