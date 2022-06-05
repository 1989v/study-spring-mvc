package hello.springmvc.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogTestControllerTest {
    @Test
    public void test() {
        //given
        solution(10);
        //when

        //then
    }

    public int solution(int N) {
        String n = Integer.toBinaryString(N);
        System.out.println("n = " + n);
        
        int length = n.length();
        int answer = 0;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (n.charAt(i) == '0') {
                counter++;
            } else {
                answer = Math.max(answer, counter);
                counter = 0;
            }
        }

        return answer;
    }
}