package ch06.sec08;

import java.util.UUID;

public class PracticeMethod2 {
    public String getRandomFileName(){
        return UUID.randomUUID().toString();
    }
    public String getExt(String name){
        int idx = name.lastIndexOf(".");
        String ext = name.substring(idx);
        return ext;
    }
    public String getRandomFileName(String filename){
        return getRandomFileName() + getExt(filename);
    }
    public int sumArr(int[] a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i] ;
        }
        return sum;
    }
    public int[] deepCopy(int[] copy){
        int[] arr = new int[copy.length];
        for(int i=0; i<copy.length;i++ ){
            arr[i] = copy[i];
        }
        return arr;
    }
    public int getMax(int[] mx){
        int max = mx[0];
        for(int i=0;i<mx.length;i++){
            if(max < mx[i]){
                max = mx[i];
            }
        }
        return max;
    }
}

