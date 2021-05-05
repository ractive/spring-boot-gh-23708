package mockfailure.data;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

public interface MyCrudRepository extends CrudRepository<MyModelClass, BigDecimal> {
}
