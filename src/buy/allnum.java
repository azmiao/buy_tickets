package buy;

class allnum implements Runnable{
    private int ticket = 100;
    private Object obj = new Object();
	@Override
    public void run(){
        while(true){
 			 try {
                Thread.sleep(100);
             } 
 			 catch (InterruptedException e) {
                 e.printStackTrace();
             }
 			 synchronized(obj){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"已卖出第"+ticket+"张票");
                    ticket--;
                }else{
                    System.out.println("100张票已卖完");
                    System.exit(0);
                }
            }
        }
         
    }
}
