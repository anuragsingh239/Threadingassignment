public class ThreadingassignmentQ4 implements Runnable{
    static int a=10;

    public static void main(String[] args) {
        ThreadingassignmentQ4 obj=new ThreadingassignmentQ4();
        Thread t1=new Thread(obj);
        t1.start();
    }
    public void run(){
        for(int i=1; i<a;i++){
            if(i==5){
                try {
                    Thread.sleep(5000);
                    System.out.println(i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }else {
                System.out.println(i);
            }
        }
    }
}
