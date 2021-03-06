package tp2;


public class EtudFac implements IEtudiantFac{
    @Override
	public Etudiant createEtu(int matricule, String nom, String prenom, String email,String pwd, int id_universite, TypePackage p) throws Exception
    {
        switch(p)
        {
            case Standard: return new StandardEtud( matricule, nom, prenom, email,pwd,id_universite); 
            case Premium: return new PremiumEtud(matricule, nom, prenom, email,pwd,id_universite); 
            default: throw new Exception("Il n'y a pas d'étudiant associé pour ce paquet");
        }
    }
}
