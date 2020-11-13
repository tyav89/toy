public class Toggle {
     private volatile boolean toggleStatus = false;

     public boolean getStatus() {
          return toggleStatus;
     }

     public void on() {
          toggleStatus = true;
     }

     public void off() {
          toggleStatus = false;

     }
}
