package spring.demo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String user_nombre;
    private String user_apellidos;
    private String user_fecha_naci;
    private String user_genero;
    private String user_tipo;
    private String user_correo;
    private String user_password;
    
    public Usuario() {
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_nombre() {
        return user_nombre;
    }

    public void setUser_nombre(String user_nombre) {
        this.user_nombre = user_nombre;
    }

    public String getUser_apellidos() {
        return user_apellidos;
    }

    public void setUser_apellidos(String user_apellidos) {
        this.user_apellidos = user_apellidos;
    }

    public String getUser_fecha_naci() {
        return user_fecha_naci;
    }

    public void setUser_fecha_naci(String user_fecha_naci) {
        this.user_fecha_naci = user_fecha_naci;
    }

    public String getUser_genero() {
        return user_genero;
    }

    public void setUser_genero(String user_genero) {
        this.user_genero = user_genero;
    }

    public String getUser_tipo() {
        return user_tipo;
    }

    public void setUser_tipo(String user_tipo) {
        this.user_tipo = user_tipo;
    }

    public String getUser_correo() {
        return user_correo;
    }

    public void setUser_correo(String user_correo) {
        this.user_correo = user_correo;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user_id=" + user_id + ", user_nombre=" + user_nombre + ", user_apellidos=" + user_apellidos + ", user_fecha_naci=" + user_fecha_naci + ", user_genero=" + user_genero + ", user_tipo=" + user_tipo + ", user_correo=" + user_correo + ", user_password=" + user_password + '}';
    }
    
    
}
