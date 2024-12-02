package com.example.viaggi;

public class viaggioVolo extends viaggio {
    private boolean andataRitorno;

    public viaggioVolo(String destinazione, int durata, double costo, boolean andataRitorno) {
        super(destinazione, durata, costo);
        this.andataRitorno = andataRitorno;
    }

    public boolean GetAndataRitorno() {
        return andataRitorno;
    }

    public void setAndataRitorno(boolean andataRitorno) {
        this.andataRitorno = andataRitorno;
    }

    @Override
    public String toString() {
        return super.toString() + " andataRitono" + this.andataRitorno;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof viaggio) {
            viaggio r = (viaggio) o;
            return super.equals(o) && this.andataRitorno == GetAndataRitorno();
        }
        return false;
    }

    @Override
    public double getCosto() {
        if (GetAndataRitorno()) {
            return super.getCosto() + super.getCosto() / 100 * 85;
        }
        return super.getCosto() + super.getCosto() / 100 * 50;
    }
}
