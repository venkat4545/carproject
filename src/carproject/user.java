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

class user {
    private String MODEL,NEOL,PRICE,NAME,CC;
    public user(String MODEL,String NEOL,String PRICE,String NAME,String CC){
        this.MODEL=MODEL;
        this.NEOL=NEOL;
        this.PRICE=PRICE;
        this.NAME=NAME;
        this.CC= CC;
    }
    public String getMODEL(){
        return MODEL;
    }
    public String getNEOL(){
        return NEOL;
    }
     public String getNAME(){
        return NAME;
    }
      public String getPRICE(){
        return PRICE;
    }
       public String getCC(){
        return CC;
    }
    
}
