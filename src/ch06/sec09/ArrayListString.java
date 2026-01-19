package ch06.sec09;

public class ArrayListString {
    public String[] arr;

    public ArrayListString() {
        arr = new String[0];
    }

    public void add(String ha) {
        String[] arr1 = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[arr.length] = ha;
        arr = arr1;

    }

    public String get(int x) {
        return arr[x];
    }

    public String remove() {
        int idx = arr.length - 1;
        String get = arr[idx];
        String arr1[] = new String[idx];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        arr = arr1;
        return get;
    }
    public void add(int x, String val){
        this.add("");
        for(int i=arr.length-1; i>x;i--){
           arr[i] = arr[i-1];
        }
        arr[x] = val;
    }
    public String remove(int x) {
        int idx = arr.length - 1;
        String get = arr[x];
        String arr1[] = new String[idx];

        for (int i = 0; i < arr1.length; i++) {
            if(i < x){
            arr1[i] = arr[i];}
            else {arr1[i] = arr[i+1];}
        }
        arr = arr1;
        return get;
    }
    public void remove(String val) {
        for(int i=0; i<arr.length; i++){
            if(val == arr[i]){
                remove(i);
            }
        }
    }
}
