package modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadosRepo extends JpaRepository<Empleados, Integer> {
	
}
