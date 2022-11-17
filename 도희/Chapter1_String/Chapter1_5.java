package CodingTest_Study.도희.Chapter1_String;
//강의
import java.util.*;
public class Chapter1_5 {
        public String solution(String str){
            String answer;
            char[] s=str.toCharArray();
            int lt=0, rt=str.length()-1;
            while(lt<rt){
                if(!Character.isAlphabetic(s[lt])) lt++;
                else if(!Character.isAlphabetic(s[rt])) rt--;
                else{
                    char tmp=s[lt];
                    s[lt]=s[rt];
                    s[rt]=tmp;
                    lt++;
                    rt--;
                }
            }
            answer=String.valueOf(s);
            return answer;
        }

        public static void main(String[] args) {
            Chapter1_5 T = new Chapter1_5();
            Scanner kb = new Scanner(System.in);
            String str = kb.next();
            System.out.println(T.solution(str));
        }
}
