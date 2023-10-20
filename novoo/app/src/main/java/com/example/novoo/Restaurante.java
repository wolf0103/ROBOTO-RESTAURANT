package com.example.novoo;

public class Restaurante {


    private String txtlasanha;
    private int Plasanha; // vai armazenar o identificador do recurso
    private String Dlasanha;
    public Restaurante(String Dlasanha, String txtlasanha, int Plasanha) {
        this.Dlasanha = Dlasanha;
        this.txtlasanha = txtlasanha;
        this.Plasanha = Plasanha;

    }

    public String getTxtlasanha() {
        return txtlasanha;
    }

    public void setTxtlasanha(String txtlasanha) {
        this.txtlasanha = txtlasanha;
    }

    public int getPlasanha() {
        return Plasanha;
    }

    public void setPlasanha(int plasanha) {
        Plasanha = plasanha;
    }

    public String getDlasanha() {
        return Dlasanha;
    }

    public void setDlasanha(String dlasanha) {
        Dlasanha = dlasanha;
    }
}
