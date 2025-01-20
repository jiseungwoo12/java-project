package thisisjava.ch16_2.Exam08;

public class Member {
    private String id;
    private String name;

    public Member(String id){
        this.id = id;
        System.out.println("Member(String id)");
    }
    public Member(String id,String name){
        this.id = id;
        this.name = name;
        System.out.println("Member(String id,String name)");
    }
    @Override
    public String toString(){
        String info = "id: "+id+"\t"+"name:"+name;
        return info;
    }
}
