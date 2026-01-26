package ch15.sec04;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args){
        //제네릭 첫번째 타입: key 타입
        //제네릭 두번째 타입: value 타입
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);

        System.out.println("value2: "+ map.get("홍길동"));
        map.put("홍길동", 95); //추가되지 않고 덮어쓰기 됨
        System.out.println("value2: "+ map.get("홍길동"));

        int value1 = map.get("신용권");
        System.out.println("value1: "+ value1);
        System.out.println("value2: "+ map.get("동장군"));
        System.out.println("value1: "+ map.get("크크크"));

        System.out.println("size: "+ map.size());

        //Set은 Value만 저장하고 중복값 저장 X
        Set<String> keySet = map.keySet();//key값들만 빼나서 set으로 만듬
        //Set 객체를 이용해 Itorator 반복자를 생성
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){//다음을 가리켰을때 데이터가 있으면 True
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.printf("%s - %d\n", k,v);
        }
    }

}
