public class Toggle {
    private volatile boolean ofOrOn = false;
    private int count;

    public  void on() {
        if (!ofOrOn) {
            ofOrOn = true;
            System.out.println("ВКЛ");
            count++;
        }

    }

    public void of() {
        if(ofOrOn){
            ofOrOn = false;
            System.out.println("ВЫКЛ");
        }
    }

    public int getCount() {
        return count;
    }
}
