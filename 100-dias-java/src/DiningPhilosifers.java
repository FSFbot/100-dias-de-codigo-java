import javax.print.attribute.standard.RequestingUserName;
import java.util.concurrent.Semaphore;

public class DiningPhilosifers {
    private Semaphore mutex = new Semaphore(1);
    private Semaphore[] semaphore =  new Semaphore[5];

    public  DiningPhilosifers(){
        for(int i = 0; i < 5; i++){
            semaphore[i] = new Semaphore(1);
        }
    }
    public void wantsToEat(int philosofer, Runnable pickLeftFork, Runnable pickRightFork, Runnable eat, Runnable putLeftFork, Runnable putRightFork) throws InterruptedException{
        int leftFork = (philosofer + 1) % 5;
        int rightFork = philosofer;

        mutex.acquire();
        semaphore[leftFork].acquire();
        semaphore[rightFork].acquire();
        mutex.release();

        pickLeftFork.run();
        pickRightFork.run();

        eat.run();

        putLeftFork.run();
        semaphore[leftFork].release();
        semaphore[rightFork].release();
    }
}
