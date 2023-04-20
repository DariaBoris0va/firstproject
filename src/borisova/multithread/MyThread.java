package borisova.multithread;

public class MyThread extends Thread {
    public int threadNumber;

    public MyThread(String name,int threadNumber){

        super(name);

        this.threadNumber=threadNumber;
    }

    public void run(){
        System.out.println(threadNumber);
    }

    // Create a method to retrieve whatever your task creates
    public Integer getInput(){
        return this.threadNumber;
    }
}


