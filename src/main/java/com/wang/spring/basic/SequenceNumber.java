package com.wang.spring.basic;

/**
 * Created by wang on 2018/1/18.
 */
public class SequenceNumber {
    private static ThreadLocal<Integer> seqNum=new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() { //覆盖initialValue方法指定初始值
            return 0;
        }
    };
    public int getNextNumber(){
        seqNum.set(seqNum.get()+1);
        return seqNum.get();
    }

    private static class TestThread extends Thread{
        private SequenceNumber sn;
        public TestThread(SequenceNumber sn){
            this.sn=sn;
        }
        @Override
        public void run() {
            for(int i=0;i<3;i++){
                System.out.println(Thread.currentThread().getName()+" "+sn.getNextNumber());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String args[]){
        SequenceNumber sn=new SequenceNumber();//虽然3个线程对象都引用了同一个SequenceNumber对象，但SequenceNumber里面的seqNum是人手一份的
        Thread t1=new TestThread(sn);
        Thread t2=new TestThread(sn);
        Thread t3=new TestThread(sn);
        t1.start();
        t2.start();
        t3.start();
    }
}
