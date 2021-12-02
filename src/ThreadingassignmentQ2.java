import java.util.Random;
public class ThreadingassignmentQ2 implements Runnable {
    String colours[]={"white","blue","black","red","yellow"};
    public void run(){
        for (int i=0;i< colours.length;i++){
            if(colours[i]=="red"){
                break;
            }
            System.out.println(colours[i]);
        }
    }

    public static void main(String[] args) {
        ThreadingassignmentQ2 obj=new ThreadingassignmentQ2();
        Thread obj1=new Thread((Runnable) obj);
        obj1.start();
    }
}
