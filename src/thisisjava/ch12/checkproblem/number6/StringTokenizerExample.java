package thisisjava.ch12.checkproblem.number6;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

        String name = "아이디,이름,패스워드";

        StringTokenizer st = new StringTokenizer(name,",");


        String tokens[] = new String[st.countTokens()];
        int index = 0;
        while (st.hasMoreTokens()) {  //hasMoreToken으로 토큰이남아있는지 확인한다
                tokens[index] = st.nextToken();
                index++;

            }
        for (String token : tokens){
            System.out.println(token);
        }

        }


    }

