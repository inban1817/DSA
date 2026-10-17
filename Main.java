public class Main{

    public static void Dynamic_array(){
        dynamic_arr darr=new dynamic_arr();
        darr.size();
        darr.add(32);
        darr.size();
        darr.add(43);
        darr.add(45);
        darr.size();
        darr.dispaly();
        darr.delete(1);
        darr.dispaly();
        darr.size();
        System.out.println(darr.get(0));
        darr.dispaly();
        darr.add(324);
        darr.add(5324);
        darr.add(234);

    }
    public static void main(String[] args){
        Dynamic_array();
        



    }
}