package Week13;

public class HomeClass {
    public String cephesi;
    private double yuzolcumu;
    private int banyo;
    private int oda;
    private boolean garaj;
    private double ucret;
    private double kira;
    private String cephe;
    private  int yil;

    public String getCephesi() {
        return cephesi;
    }

    public void setCephesi(String cephesi) {
        this.cephesi = cephesi;
    }

    public double getYuzolcumu() {
        return yuzolcumu;
    }

    public void setYuzolcumu(double yuzolcumu) {
        this.yuzolcumu = yuzolcumu;
    }

    public int getBanyo() {
        return banyo;
    }

    public void setBanyo(int banyo) {
        this.banyo = banyo;
    }

    public int getOda() {
        return oda;
    }

    public void setOda(int oda) {
        this.oda = oda;
    }

    public boolean isGaraj() {
        return garaj;
    }

    public void setGaraj(boolean garaj) {
        this.garaj = garaj;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public double getKira() {
        return kira;
    }

    public void setKira(double kira) {
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }


    public HomeClass(String cephesi, double yuzolcumu, int banyo, int oda, boolean garaj, double ucret, double kira, String cephe, int yil) {
        this.cephesi = cephesi;
        this.yuzolcumu = yuzolcumu;
        this.banyo = banyo;
        this.oda = oda;
        this.garaj = garaj;
        this.ucret = ucret;
        this.kira = kira;
        this.cephe = cephe;
        this.yil = yil;
    }



    public HomeClass () {

    }



}
