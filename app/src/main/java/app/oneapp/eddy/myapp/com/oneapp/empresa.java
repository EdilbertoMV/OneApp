package app.oneapp.eddy.myapp.com.oneapp;


public class empresa {

    private int indice;
    private int codigo;
    private String nombre;
    private String mechardising;
    private String emisora;

    //Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMechardising() {
        return mechardising;
    }

    public String getEmisora() {
        return emisora;
    }

    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMechardising(String mechardising) {
        this.mechardising = mechardising;
    }

    public void setEmisora(String emisora) {
        this.emisora = emisora;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


}
