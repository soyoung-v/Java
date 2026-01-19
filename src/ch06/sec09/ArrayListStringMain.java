package ch06.sec09;

import java.util.Arrays;

public class ArrayListStringMain {
    public static void main(String[] args){
        ArrayListString list = new ArrayListString();

        System.out.println(Arrays.toString(list.arr));
        list.add("하하");
        System.out.println(Arrays.toString(list.arr));
        list.add("후후");
        System.out.println(Arrays.toString(list.arr));
        list.add("크크");
        System.out.println(Arrays.toString(list.arr));
        list.add("와우");
        System.out.println(Arrays.toString(list.arr));
        list.add("대단해");
        System.out.println(Arrays.toString(list.arr));

        String val = list.get(1);
        System.out.println(val);

        String removeVal = list.remove();
        System.out.println(removeVal);
        System.out.println(Arrays.toString(list.arr));
        list.add(1,"나야");
        System.out.println(Arrays.toString(list.arr));
        String removeVal2 = list.remove(2);
        System.out.println(removeVal2);
        System.out.println(Arrays.toString(list.arr));
        String removeVal3 = list.get(1);
        System.out.println(removeVal3);
        list.remove(removeVal3);
        System.out.println(Arrays.toString(list.arr));
    }



}
