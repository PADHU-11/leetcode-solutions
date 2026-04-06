import java.util.*;
class User{
    String id;
    ArrayList<Long> t;
    User(String id){
    this.id=id;
    t=new ArrayList<>();
    }
}
abstract class Limiter{
    int max;
    long win;
    HashMap<String,User> map;
    Limiter(int max,long win){
        this.max=max;
        this.win=win;
        map=new HashMap<>();
    }
    abstract boolean allow(String id);
}
class Simple extends Limiter{
    Simple(int max,long win){
        super(max,win);
    }
boolean allow(String id){
    long now=System.currentTimeMillis();
    if(!map.containsKey(id)){
    map.put(id,new User(id));
    }
    User u=map.get(id);
    ArrayList<Long> t=u.t;
    t.removeIf(x->(now-x)>win);
    if(t.size()<max){
        t.add(now);
        return true;
    }
    return false;
}
}
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        Limiter l=new Simple(3,10000);
        String id=sc.nextLine();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        if(l.allow(id)){
        System.out.println("Allowed");
        }else{
        System.out.println("Blocked");
        }
        Thread.sleep(2000);
        }
    }
}