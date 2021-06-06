package buy;

public class Test {
    public static void main(String[] args) {
        allnum ch = new allnum();
        for(int i=1;i<6;i++){
        	new Thread(ch,i+"ºÅ´°¿Ú ").start();
        }
    }
}
