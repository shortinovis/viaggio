package com.example.viaggi;


public class agenziaViaggi {
    private viaggio [] v;
    private int inseriti;

    public agenziaViaggi(viaggio[] viaggios,int inseriti) {
        this.v = viaggios;
        this.inseriti=inseriti;
    }
    public agenziaViaggi(int nViaggio) {
        this(new viaggio[nViaggio],0);
    }
    public agenziaViaggi() {
        this(new viaggio[100],0);
    }


    public viaggio[] getViaggio() { return v; }
    public void setViaggio(viaggio[] viaggio) { this.v = viaggio; }

    public int getInseriti() { return inseriti; }
    public void setInseriti(int inseriti) { this.inseriti = inseriti; }


    @Override
    public String toString() {
        String s="Elenco:\n";
        for (int i=0;i<this.inseriti;i++){
            s=s+v[i].toString()+", costo: "+v[i].getCostoViaggio()+" \n";
        }
        return s;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof agenziaViaggi){
            agenziaViaggi r=(agenziaViaggi) o;
            for (int i=0;i<this.inseriti;i++){
                if (!v[i].equals(r.getViaggio()[i])){
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public boolean inserisci(viaggio viaggio){
        if (this.inseriti== v.length)
            return false;
        else {
            v[this.inseriti] = viaggio;
            this.inseriti++;
            return true;
        }
    }
    public double getCostoMedio(){
        double costo=0.0;
        for (int i=0;i<this.inseriti;i++){
            costo+=v[i].getCostoViaggio();
        }
        return costo/this.inseriti;
    }
    public int getPosizionePacchettoMin(){
        double costoMin=v[0].getCostoViaggio();
        int posMin=0;
        for (int i=0;i<this.inseriti;i++){
            if (costoMin>v[i].getCostoViaggio()){
                costoMin=v[i].getCostoViaggio();
                posMin=i;
            }
        }
        return posMin;
    }
    public int getPosizionePacchettoMax(){
        double costoMax=v[0].getCostoViaggio();
        int posMax=0;
        for (int i=0;i<this.inseriti;i++){
            if (costoMax<v[i].getCostoViaggio()){
                costoMax=v[i].getCostoViaggio();
                posMax=i;
            }
        }
        return posMax;
    }
    public String getMinMax(){
        return "Max: "+v[getPosizionePacchettoMax()].toString()+"\n\n Min: "+v[getPosizionePacchettoMin()].toString();
    }
}