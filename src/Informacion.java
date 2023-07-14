import java.io.Serializable;
public class Informacion implements Serializable {
    String codico;
    String cedula;
    String nombres;
    String apellidos;
    String sig;
    String f_anio;
    String f_mes;
    String f_dia;
    String color;
    String casado;

    public Informacion(String codico, String cedula, String nombres, String apellidos, String sig, String f_anio, String f_mes, String f_dia) {
        this.codico = codico;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sig = sig;
        this.f_anio = this.f_anio;
        this.f_mes = this.f_mes;
        this.f_dia = this.f_dia;
        this.color = color;
        this.casado = casado;
    }

    public String getCodico() {
        return codico;
    }

    public void setCodico(String codico) {
        this.codico = codico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public String getF_anio() {
        return f_anio;
    }

    public void setF_anio(String f_anio) {
        this.f_anio = f_anio;
    }

    public String getF_mes() {
        return f_mes;
    }

    public void setF_mes(String f_mes) {
        this.f_mes = f_mes;
    }

    public String getF_dia() {
        return f_dia;
    }

    public void setF_dia(String f_dia) {
        this.f_dia = f_dia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }
}
