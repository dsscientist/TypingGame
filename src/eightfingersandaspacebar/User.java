package eightfingersandaspacebar;

public class User {
    private String name;
    private int wpm;
    private int timeElapsed;
    private int wordNum;
    
    public User(String name) {
        this.name = name;
    }
    
    public int getwpm() {
        return wpm;
    }
    
    public void setwpm() {
        wpm = (int)(1.0 * wordNum / timeElapsed);
    }
    
    public void setwpm(int timeE, int wordNumber) {
        wpm = (int)(1.0 * wordNumber / timeE);
    }
}
