package Interface;

import java.sql.SQLException;

import Etudiant.Etudiant;

public interface IEtudiantRepository {
	void add(Etudiant E) throws SQLException;
	boolean Exists(String email) throws SQLException;
	boolean Exists(int mat) throws SQLException;
}
