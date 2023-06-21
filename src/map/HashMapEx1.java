package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("id01","1234");
        map.put("id02","5678");
        map.put("id03","0909");

        Scanner s = new Scanner(System.in); //화면으로부터 라인 단위로 입력받는다.

        while(true){
            System.out.println("id와 pw를 입력해주세요");
            System.out.println("id: ");
            String id = s.nextLine().trim();

            System.out.println("pw: ");
            String pw = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("아이디가 존재하지 않아요");
            }
            else{
                if(!(map.get(id).equals(pw))){
                    System.out.println("비밀번호가 일치하지 않아요");
                }
                else{
                    System.out.println("로그인 성공!");
                    break;
                }
            }
        }
    }
}
