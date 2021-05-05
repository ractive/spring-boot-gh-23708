package mockfailure.data;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyModelClass {
	@Id
	protected BigDecimal id = null;
}
