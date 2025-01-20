package thisisjava.ch17_2.Quiz.num4;

public class Member {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Member(String name, String job){
        this.name = name;
        this.job = job;
    }

    public String toString(){
        return "{name:" + name +", job:"+job+"}";
    }

}
