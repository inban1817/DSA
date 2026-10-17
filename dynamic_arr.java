import java.util.*;

public class dynamic_arr {
    private int[] arr;
    private int size;

    public dynamic_arr(){
        arr=new int[2];
        size=0;
    }

    public void add(int i){
        if(size==arr.length){
            resize();
        }
        arr[size]=i;
        size++;
    }
    
    private void resize(){
        int[] rearr=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            rearr[i]=arr[i];
        }
        arr=rearr;
        System.out.println("resized");
    }

    public int get(int p){
        if(p>=size){
            throw new IndexOutOfBoundsException();
        }
        return arr[p];

    }

    public void size(){
        System.out.println(size);
    }

    public void delete(int p){
        System.out.println(arr[p]+" deleted");
        for(int i=p;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        arr[size]=0;
    }

    public void dispaly(){
        System.out.println(Arrays.toString(Arrays.copyOf(arr,size)));
    }


}
