/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

/**
 *
 * @author USER
 */
class concus {
    private String USERNAME,PHONENUMB,DSE;
    public concus(String USERNAME,String PHONENUMB,String DSE){
        
        
        this.USERNAME=USERNAME;
        this.PHONENUMB= PHONENUMB;
        this.DSE=DSE;
        
    }
    
     public String getUSERNAME(){
        return USERNAME;
    }
     public String getPHONENUMB(){
        return PHONENUMB;
    }
   
      public String getDSE(){
        return DSE;
    }
}
