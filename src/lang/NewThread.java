package lang;

public class NewThread extends Thread{

    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb){
        super(tgOb, threadname);
        System.out.println("Nowy wątek: " + this);
        suspendFlag = false;
        start();
    }

    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch(Exception e){
            System.out.println("Wyjątek w: " + getName());
        }
        System.out.println(getName() + " zakończony");
    }

    void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }

}

class ThreadGroupDemo{
    public static void main(String args[]){

        ThreadGroup groupA = new ThreadGroup("Grupa A");
        ThreadGroup groupB = new ThreadGroup("Grupa B");

        NewThread ob1 = new NewThread("jeden", groupA);
        NewThread ob2 = new NewThread("dwa", groupA);
        NewThread ob3 = new NewThread("trzy", groupB);
        NewThread ob4 = new NewThread("cztery", groupB);

        groupA.list();
        groupB.list();

        System.out.println("Zawieszenie grupy A");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);
        for(int i = 0; i < tga.length; i++)
            ((NewThread)tga[i]).mysuspend();

        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println("przerwano glowny watek");
        }

        System.out.println("Wznowienie grupy A");
        for(int i = 0; i < tga.length; i++)
            ((NewThread)tga[i]).myresume();

        try{
            System.out.println("Oczekiwanie na zakonczenie watkow");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        }catch(Exception e){
            System.out.println("Wyjatek w glownym watku");
        }
        System.out.println("Koniec watku glownego");
    }
}