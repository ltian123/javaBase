package day28.线程间通信.生产与消费;

public class Factory {
	//表示库存中的产品数量
	int count = 1;
	
	public synchronized void produce()
	{
		if(count==1){
			System.out.println("仓库有产品，当前线程开始等待....");
			try {
				this.wait();
			} catch (InterruptedException e) {
				
			}
		}
		//说明仓库中没有产品，生产线程开始生产
		count = 1;
		System.out.println("生产者生产完产品，并唤醒消费者.....");
		//用于唤醒所有通过this对象发出的wait线程
		this.notifyAll();
		System.out.println("生产者唤醒结束....");
	
	}
	
	public synchronized void consume()
	{
		if(count==0){
			System.out.println("仓库没产品，消费线程开始等待...");
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
			System.out.println("消费者等待重新启动....");
		}
		//此时count为1,进行消费
		count = 0;
		System.out.println("消费者消费完了产品，并唤醒生产者生产....");
		this.notify();
		System.out.println("消费者唤醒结束...");
	}
}
