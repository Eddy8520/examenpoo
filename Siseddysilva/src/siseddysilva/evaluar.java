/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siseddysilva;

/**
 *
 * @author alexa
 */
public class evaluar {
    
    private int[] n=new int[15];
    private int Mayor;
    private int menor;
    private double media;

    public evaluar() {
    }

    public evaluar(int Mayor, int menor, double media) {
        this.Mayor = Mayor;
        this.menor = menor;
        this.media = media;
    }

    public int[] getN() {
        return n;
    }

    public void setN(int[] n,int cont) {
        this.n = n;
       setMayor(n,cont);
        setMedia(n,cont);
        setMenor(n,cont);
    }

    public int getMayor() {
        return Mayor;
    }

    public void setMayor(int[] n ,int cont) {
        int temp=n[0];
        for (int i = 0; i < cont+1; i++) {
            if(temp<n[i]){
                temp=n[i];
            }
        }
        this.Mayor = temp;
    }

    public int getMenor() {
        
        return menor;
    }

    public void setMenor(int[] n,int cont) {
          int temp1=n[0];
        for (int i = 0; i < cont+1; i++) {
            if(temp1>n[i]){
                temp1=n[i];
            }
        }
        
        this.menor =temp1;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(int[] n, int cont) {
        double aux=0;
        for (int i = 0; i < cont+1; i++) {
            aux=aux+n[i];
        }
        this.media = aux/(cont+1);
    }
    
    
    
    
    
}
