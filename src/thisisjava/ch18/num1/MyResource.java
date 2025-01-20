package thisisjava.ch18.num1;




public class MyResource implements AutoCloseable{

    //입출력 스트림이 정상적으로 종료되었거나 예외가발생하였을때 닫아주는 close()
    //메서드를 try(값) try-catch블럭에 try괄호에 리소스를 여는 코드를 작성하면
    //try블록이 정상적으로 실행을완료했거나 도중에 예외가 생겼을때 close()메서드를 자동 호출해준다.
    //try-with-resource블럭이라고한다
    //하지만 이블럭을 사용하기위해선 그 여는 리소스 클래스나 인터페이스는 무조건 AutoCloseAble을
    //구현해야만 자동적으로 close를 호출해준다.
    @Override
    public void close() throws Exception {
        System.out.println("");
    }

}
