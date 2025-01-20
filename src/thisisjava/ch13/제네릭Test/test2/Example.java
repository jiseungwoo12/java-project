package thisisjava.ch13.제네릭Test.test2;

public class Example {
    public static void main(String[] args) {
        //<Tv,String> 파라미터를 설정하면
        //A kind가 Tv kind;가되고
        //B model은 String model;이 된다.
        Product<Tv,String> tv = new Product<>();
        tv.kindset(new Tv()); //kindset(Tv kind) 이되고
        tv.modelset("스마트Tv"); //modelset(String model) 이된다는것이다.
        Tv t = tv.getKind(); //A getKind가 Tv getkind로 바뀌면서 리턴타입이 Tv로 변경되는것이다,.
        String tvstr = tv.getModel();
    }
}
