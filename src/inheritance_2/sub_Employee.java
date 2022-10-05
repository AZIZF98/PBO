/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_2;

/**
 *
 * @author LENOVO
 */
public class sub_Employee extends super_person {
    
    private String departement,tittle;

    public sub_Employee(String id, String name, String addres, String departement, String tittle) {
        super(id,name,addres);
        this.departement = "IT";
        this.tittle = tittle;
    }

    public String getDepartement() {
        return departement;
    }

    public String getTittle() {
        return tittle;
    }
    
    public void data() {
        System.out.println(super.getId() + ". " + super.getName() + " " + getAddres()+" "+getDepartement()+" "+getTittle());
    }
    
}
