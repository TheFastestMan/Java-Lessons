package mainCurseProf.lesson13Thread.echo;

public class Message {
    private boolean sent;
    private String massage;

    public Message(String massage, boolean sent) {
        this.sent = sent;
        this.massage = massage;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public synchronized void say(String massage){
        try {
            while (isSent()){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setMassage(massage);
        this.setSent(true);
        System.out.println("Massage has sent. "+ this.getMassage());
        notify();
    }
    public synchronized void reply(){
        try {
            while (!isSent()){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Received. "+this.getMassage());
        this.setSent(false);
        notify();
    }
}
