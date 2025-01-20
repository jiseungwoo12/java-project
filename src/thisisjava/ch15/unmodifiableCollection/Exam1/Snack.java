package thisisjava.ch15.unmodifiableCollection.Exam1;

public class Snack implements Comparable<Snack>{
    public String snackname; //스낵이름
    public int snackno; //스낵개수

    public Snack(String snackname,int no){
        this.snackname =snackname;
        this.snackno = no;
    }
    //compareTo를 이용해 문자열을 비교하고 문자열순으로 나열하도록 설정되어있다.
    @Override
    public int compareTo(Snack s){
        int nameComparison = this.snackname.compareTo(s.snackname);
        if (nameComparison == 0){
            return Integer.compare(this.snackno,s.snackno);
        }

        return nameComparison;
    }
}
