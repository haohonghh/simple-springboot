package com.boot.srimplespringboot.thread;

/**
 * 
 * @author SnailClimb
 * @date 2018年10月30日
 * @Description: 使用interrupt()方法终止线程
 */
public class InterruptThread2 extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("已经是停止状态了!我要退出了!");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
		System.out.println("看到这句话说明线程并未终止------");
	}

	public static void main(String[] args) {
		try {
			InterruptThread2 thread = new InterruptThread2();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
