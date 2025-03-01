package MCHprojetoI.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MCHprojetoI.project.Entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
