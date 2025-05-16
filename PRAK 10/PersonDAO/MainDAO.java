/* Nama  : Kaila Talitha Putri 
 * Nim   : 24060123140179
 * Kelas : C
 * Lab   : C1 
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Xiao");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
