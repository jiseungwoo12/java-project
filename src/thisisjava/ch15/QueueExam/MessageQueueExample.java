package thisisjava.ch15.QueueExam;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueExample {
    public static void main(String[] args) {
        //Queue는 스택과다르게 인터페이스다.
        //Queue를 구현한 클래스중 대표적인 클래스론 LinkedList이다
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("sendmail","지승우"));
        messageQueue.offer(new Message("sendSNS","지종우"));
        messageQueue.offer(new Message("sendKakaoTalk","유진실"));

        while (!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
           switch (message.command) {
               case "sendmail":
                   System.out.println(message.to+" 님에게 메일을 보냅니다");
                   break;
               case "sendSNS":
                   System.out.println(message.to+" 님에게 SNS를 보냅니다.");
                   break;
               case "sendKakaoTalk" :
                   System.out.println(message.to+" 님에게 카카오톡을 보냅니다.");
                   break;
           }

        }



    }
}
