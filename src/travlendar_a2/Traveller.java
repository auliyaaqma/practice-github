/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travlendar_a2;

/**
 *
 * @author Auliya Aqma Dinillah
 */
public class Traveller {
    //atribut pada kelas traveller
    private int id_traveller;
    private String username;
    private String email;
    private String password;
    private String fullname;

    /**
     * @return the id_traveller
     */
    public int getId_traveller() { //mengambil value id_traveller
        return id_traveller;
    }

    /**
     * @param id_traveller the id_traveller to set
     */
//mengubah value id_traveller
    public void setId_traveller(int id_traveller) { 
        this.id_traveller = id_traveller;
    }

    /**
     * @return the username
     */
    public String getUsername() { //mengambil value username
        return username;
    }

    /**
     * @param username the username to set
     */
	//mengubah value username
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() { //mengambil value email
        return email;
    }

    /**
     * @param email the email to set
     */
	//mengubah value email
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() { //mengambil value password
        return password;
    }

    /**
     * @param password the password to set
     */
	//mengubah value password
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the fullname
     */
    public String getFullname() {//mengambil value fullname
        return fullname;
    }

    /**
     * @param fullname the fullname to set
     */
	//mengubah value fullname
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
