package multithreading;

public class MessageThreadMain {

	public static void main(String[] args) {
		Thread t1=new MessageThread("Hello", 500);//2sec
		Thread t2=new MessageThread("Good Morning", 300);//half sec
		Thread t3=new MessageThread("Swapnil", 600);
		t1.start();
		t2.start();
		t1.stop();//not recommended
//		t3.run();
//		t1.run();
//		t2.run();
//		t3.run();
		t3.currentThread();
		//after run() method it will creating one thread it jut single thread come.
	}

}


/*
 *Working with runnable: In order to implement multithreding, java provides another option: 
 *Runnable Interface.
 *If a thread specific class is already extended from some different class, it cannot inherit Thread bcz multiple inhritance is not suppported  
 *in this case, runnable interface implemented
 *
 *Thread class Methods:
 *The thread class provide several methods meant for handling  various functionalities.
 *start();=>it request to os for creating an thread.(windows, linux support multithreding)//does not create thread by java it create by 
 *operating system. It brings the created thread into READY state and when the schedular shedules the thread, it invokes run()method.
 *stop();=>It will stop the thread with explicitly or terminate the thread. If you call dead state it call the stop() method. 
 *Terminated the thread explicirely is not disirablee by lates version of java, this method has been declared  as deprecated(out dated)
 *sleep();=> clss name.sleep static method. causes the currently running thread to enter into SLEEPING state. the thread into SLEEPING	state until the sleep 
 *time interval is over. the time interval is terms of milliseconds.
 *yeild();=>A staic method causes the currently running thread to give up the control to some other thread. The currently running thread in running state and 
 *goes back to 	READY state. In general yeild() scheduler schedule the thread of which the opriority is at least as high as that yeilded thread.
 *suspend();/resume();=> this method is used to thread in suspended state. The reusme method causes to thread to leave SUSPENDED state and enter into ready state.
 *the thread remains SUSPENDED until resume() is invoked and therfore both thse method are deprecated
 *currentThread();=>a static that return a reference to the thread that is currently running.
 *join();=>It causes a parent thread to wait until the death of child thread on which it is invoked.
*/