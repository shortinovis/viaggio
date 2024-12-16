package com.example.viaggi;

public class viaggioPasti extends viaggio{
    private  boolean PensioneComp;

    public viaggioPasti(String destinazione, int durata, double costo, boolean PensioneComp){
        super(destinazione,  durata, costo);
        this.PensioneComp=PensioneComp;
    }

    public boolean GetPensioneComp() {
        return PensioneComp;
    }

    public void setPensioneComp(boolean pensioneComp) {
        PensioneComp = pensioneComp;
    }

    @Override
    public String toString() {
        return super.toString() + " pensioneCompleta " + this.PensioneComp;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof viaggio){
            viaggio r=(viaggio) o;
            return super.equals(o) && this.PensioneComp==GetPensioneComp();
        }
        return false;
    }

    @Override
    public double getCostoViaggio() {
        if (GetPensioneComp()) {
            return super.getCosto() + getDurata()*35;
        }
        return super.getCosto() + getDurata()*25;
    }
}
