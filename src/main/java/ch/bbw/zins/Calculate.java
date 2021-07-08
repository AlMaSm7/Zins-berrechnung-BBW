package ch.bbw.zins;

import java.util.HashMap;

public class Calculate {
    ;
    private int netto;
    private int rest;
    private int anzahlung;
    private double zins;
    private int laufzeit;
    private double zinsCost;
    private int amort;
    private double rate;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlung() {
        return anzahlung;
    }

    public void setAnzahlung(int anzahlung) {
        this.anzahlung = anzahlung;
    }



    public double getZinsCost() {
        double zinsDuration = (this.getNetto() - this.getAnzahlung()) + this.getRest() * this.zins * this.getLaufzeit() / 200;
        this.zinsCost = zinsDuration;
        return zinsDuration;
    }

    public void setZinsCost(double zinsCost) {
        this.zinsCost = zinsCost;
    }

    public int getAmort() {
        int amort = this.getNetto() - this.getRest();
        this.amort = amort;
        return this.amort;
    }

    public void setAmort(int amort) {
        this.amort = amort;
    }

    public int getNetto() {
        return netto;
    }

    public void setNetto(int netto) {
        this.netto = netto;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public double getZins() {
        return zins;
    }

    public void setZins(double zins) {
        this.zins = zins;
    }

    public int getLaufzeit() {
        return laufzeit;
    }

    public void setLaufzeit(int laufzeit) {
        this.laufzeit = laufzeit;
    }
    public double getRate() {
        int months = 1;
        if (this.getLaufzeit() == 1){
            months = 12;
        } else if(this.getLaufzeit() == 2){
            months = 24;
        }
        else if(this.getLaufzeit() == 3){
            months = 36;
        }
        else if(this.getLaufzeit() == 4){
            months = 48;
        }
        else if(this.getLaufzeit() == 5){
            months = 50;
        }

        double rate = this.getZinsCost() + this.getAmort() / months;
        this.rate = rate;
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
