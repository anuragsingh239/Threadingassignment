import java.util.Scanner;
public class ThreadingassignmentQ3 implements Runnable{
    static int a=20;
    public void run(){
        try{
            for(int i=0;i<a;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadingassignmentQ3 obj=new ThreadingassignmentQ3();
        ThreadingassignmentQ3 obj1=new ThreadingassignmentQ3();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
        try{
            t1.join(1000);
            for(int i=0; i<a; i++) {
                if(i%2!=0){
                    System.out.println(i);
                }
            }
        }catch (Exception o){
            System.out.println(o);
        }

    }

}
