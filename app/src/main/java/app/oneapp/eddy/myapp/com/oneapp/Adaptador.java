package app.oneapp.eddy.myapp.com.oneapp;


public class Adaptador {

    public static final String tabla_empresa = "empresa";
    public static final String nombre = "nombre";
    public static final String mechardising = "mechardising";
    public static final String emisora = "emisora";
    public static final String codigo = "codigo";

    public static final String sqlCreate = "CREATE TABLE " + tabla_empresa + " ("
            + nombre + " TEXT, " + mechardising + " TEXT, "
            + emisora + " TEXT, " + codigo + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)";



}
