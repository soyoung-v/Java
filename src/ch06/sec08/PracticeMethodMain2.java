package ch06.sec08;

import java.util.Arrays;

public class PracticeMethodMain2 {
    public static void main(String[] args){
        PracticeMethod2 pm = new PracticeMethod2();

        String randomFileName = pm.getRandomFileName();
        System.out.println(randomFileName);

        String originalFileName = "크크크.dfs-werds.sdfs.jpg";
        String ext = pm.getExt(originalFileName);
        System.out.println(ext);

        String rFileName2 = pm.getRandomFileName(originalFileName);
        System.out.println(rFileName2);

        int[] arr = { 10, 5, 8, 11 };
        int sum = pm.sumArr(arr);
        System.out.println(sum);

        int[] arr2 = pm.deepCopy(arr);
        System.out.println(Arrays.toString(arr2));

        int max = pm.getMax(arr);
        System.out.println(max);

    }

}
