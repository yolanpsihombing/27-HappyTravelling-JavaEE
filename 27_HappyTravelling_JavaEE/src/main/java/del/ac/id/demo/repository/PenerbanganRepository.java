package del.ac.id.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import del.ac.id.demo.model.Penerbangan;

@Repository
public interface PenerbanganRepository extends JpaRepository<Penerbangan, Long>{
}