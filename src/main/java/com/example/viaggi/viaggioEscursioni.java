package com.example.viaggi;

public class viaggioEscursioni extends viaggioPasti{
    private  int escursioni;

    public viaggioEscursioni(String destinazione, int durata, double costo, boolean pensioneComp,int escursioni){
        super(destinazione,  durata, costo, pensioneComp);
        this.escursioni=escursioni;
    }

    public int getEscursioni() {
        return escursioni;
    }

    public void setEscursioni(int escursioni) {
        this.escursioni = escursioni;
    }
    public String toString() {
        return super.toString() + " escursioni " + this.escursioni;
    }
    public boolean equals(Object o){
        if(o instanceof viaggio){
            viaggio r=(viaggio) o;
            return super.equals(o) && this.escursioni==getEscursioni();
        }
        return false;
    }
    public double getCosto() {
        return super.getCosto() + getEscursioni()*15;
    }
}
