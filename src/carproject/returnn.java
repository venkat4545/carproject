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
class returnn {
    private String NAME,CAR,PRICE,FRS,CARNO,OWNER,ONO;
    public returnn(String NAME,String CAR,String PRICE,String FRS,String CARNO,String OWNER,String ONO){
        
        
        this.NAME=NAME;
        this.CAR= CAR;
        this.PRICE=PRICE;
        this.FRS=FRS;
        this.CARNO= CARNO;
        this.OWNER=OWNER;
        this.ONO=ONO;
        
    }
    
     public String getNAME(){
        return NAME;
    }
     public String getCAR(){
        return CAR;
    }
   
      public String getPRICE(){
        return PRICE;
    }
       public String getFRS(){
        return FRS;
    }
     public String getCARNO(){
        return CARNO;
    }
   
      public String getOWNER(){
        return OWNER;
    }
      public String getONO(){
          return ONO;
      }
}
