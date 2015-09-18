package test; 

import database.DbFacade;
import entity.Person;
import entity.PhDStudent;

public class Tester { 
    public static void main(String[] args) {
        DbFacade dbFacade = new DbFacade();
        
        dbFacade.addPhDStudient("Peter", "Hansen");
        dbFacade.addPhDStudient("Niels", "Jensen");
        
        PhDStudent phDStudent = dbFacade.findPhDStudient(2);
        phDStudent.setAge(20);
        dbFacade.editPhDStudient(phDStudent);
        
        dbFacade.deletePhDStudient(1);
    }
}