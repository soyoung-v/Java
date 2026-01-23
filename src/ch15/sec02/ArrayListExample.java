package ch15.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    /* 배열은 크기가 고정, 크지 변경이 안된다.
    크기 변경해서 사용하고 싶으면 새로운 배열을 만들어서 복사도하고
    값도 넣고 써야했다.

    한 곳에 여러값을 담을 수 잇는 친구들을 collection이라고 한다.
    배열, ArrayList, LinkedList, HashMap, Set등등
     */
    public static void main(String[] args){
        // List, ArrayList = 상속관계
        // List는 interface이며, 부모이다
        List<String> list = new ArrayList<>();
        //List<String> 나 유연한 배열인데 각 방은 String이야.
        list.add("하하");
        list.add("후후");
        list.add("크크");

        String str1 = list.get(0); //list의 0번방꺼 가져온다
        System.out.println(list);
        System.out.println(str1);

        List<Integer> list1 = new ArrayList<>();
        //List1<Integer> 나 유연한 배열인데 각 방은 Integer이야.
        list1.add(10);
        list1.add(20);
        list1.add(30);
        int int1 = list1.get(1); //list1의 1번방꺼 가져온다

        System.out.println(list1);
        System.out.println(int1);
    }
}
