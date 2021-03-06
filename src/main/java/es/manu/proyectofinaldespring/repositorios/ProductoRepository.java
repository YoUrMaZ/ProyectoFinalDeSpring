package es.manu.proyectofinaldespring.repositorios;

import es.manu.proyectofinaldespring.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
  List<Producto> findByTituloContainsOrMaterialContains(String titulo, String material);




}
