package lesson5;

public class Methods {

    static final int SIZE =10000000;
    static final int H=SIZE/2;



    public static void monoThreat(){
        float[] arr =new float[SIZE];
        for (int i = 0; i <SIZE; i++) {
            arr[i]=1;
        }
        long a =System.currentTimeMillis();
        for (int i = 0; i <SIZE ; i++) {
            arr[i]=(float)(arr[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
        System.out.println(System.currentTimeMillis()-a+"ms");
    }

    public static void multyThreat(){
        float[] arr =new float[SIZE];
        for (int i = 0; i <SIZE; i++) {
            arr[i]=1;
        }
        long a =System.currentTimeMillis();

        float[] a1 = new float[H];
        float[] a2 = new float[H];
        System.arraycopy(arr,0,a1,0,H);
        System.arraycopy(arr,H,a2,0,H);

        Thread firstThread = new Thread(()->{
            for (int i = 0; i <H ; i++) {
                arr[i]=(float)(arr[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
            }
        });

        Thread secondThread = new Thread(()->{
            for (int i = H; i <SIZE ; i++) {
                arr[i]=(float)(arr[i]*Math.sin(0.2f+i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f+i/2));
            }
        });

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1,0,arr,0,H);
        System.arraycopy(a2,0,arr,H,H);


        System.out.println(System.currentTimeMillis()-a+"ms");
    }
}
