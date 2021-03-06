package es.manu.proyectofinaldespring.entidades;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "imagen", nullable = false, length = 255)
    private String imagen;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "horario", nullable = false)
    private Integer horario;

    @Column(name = "duracion")
    private Integer duracion;

    @Column(name = "localizacion", nullable = false, length = 200)
    private String localizacion;

    @ManyToOne
    @JoinColumn(name = "area")
    private Area area;

    @ManyToOne
    @JoinColumn(name = "compania")
    private Compania compania;

    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;


    public Servicio(){}

    public Servicio(Long id, String nombre, String imagen, Date fecha, Integer horario, Integer duracion, String localizacion, Area area, Compania compania, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.localizacion = localizacion;
        this.area = area;
        this.compania = compania;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}