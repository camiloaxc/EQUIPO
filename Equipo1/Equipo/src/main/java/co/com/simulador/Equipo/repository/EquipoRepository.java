package co.com.simulador.Equipo.repository;

import co.com.simulador.Equipo.entity.EquipoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<EquipoEntity, Integer> {
}
