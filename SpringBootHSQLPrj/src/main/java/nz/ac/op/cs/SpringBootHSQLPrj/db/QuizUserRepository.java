package nz.ac.op.cs.SpringBootHSQLPrj.db;


import nz.ac.op.cs.SpringBootHSQLPrj.models.QuizUser;
import org.springframework.data.repository.CrudRepository;

public interface QuizUserRepository  extends CrudRepository<QuizUser, String>{
}
