import java.util.*;

public class pro2404 {
    public static int n,count=0;
    public static Set<String> set = new HashSet<>();
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        //StringBuilder s = new StringBuilder();
        Scanner scanner =new Scanner(System.in);
        n = scanner.nextInt();
        fun(0);
        for (String value : set) {
            System.out.println(value.replaceAll("", "+").substring(1));
        }
    }
    
    
    public static void fun(int a){
        if(a==n){
            if(list.size()==1) return;
            count++;
            StringBuilder s = new StringBuilder();
            for (Integer integer : list) {
                s.append(integer);
            }
            set.add(s.toString());
            return;
        }
        for (int i = 1; i<n+1; i++) {
            if(a+i>n)
                continue;
            if(list.size()==0 || list.get(list.size()-1)<=i){
                list.add(i);
                a+=i;
                fun(a);
                list.remove(list.size()-1);
                a-=i;
            }
        }
    }
}
