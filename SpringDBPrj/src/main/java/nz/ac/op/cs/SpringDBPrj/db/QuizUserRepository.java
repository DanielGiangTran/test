package nz.ac.op.cs.SpringDBPrj.db;

import nz.ac.op.cs.SpringDBPrj.models.QuizUser;

import org.springframework.data.repository.CrudRepository;

public interface QuizUserRepository  extends CrudRepository<QuizUser, String>{
}
