package edu.pe.idat.model.login;

public class LoginModel {
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public LoginModel(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    public LoginModel() {
    }
}
