package es.manu.proyectofinaldespring.repositorios;

import es.manu.proyectofinaldespring.entidades.Digital;
import es.manu.proyectofinaldespring.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Optional;

public interface DigitalRepository extends JpaRepository<Digital, Long> {

    List<Digital> findByNombreContains(String nombre);



}
