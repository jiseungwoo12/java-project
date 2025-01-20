package thisisjava.ch17_2.num10.Comparable;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


    @Override
    public int compareTo(Student o) {
        //비교대상객체가 null일시를 대비해 if문으로 검색하고 시작한다.
//        if (o == null){
//            throw new NullPointerException("비교 대상 객체가 null입니다.");
//        }
//        if(o instanceof Student){
//            Student s1 = (Student)o;
//            return Integer.compare(this.score,s1.score);
//        } else  {
//            throw new IllegalArgumentException("비교대상이 student타입이 아닙니다.");
//        }
            return Integer.compare(score,o.score);
  }



}
