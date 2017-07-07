/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author Happy
 */
public class customer {
    private int cust_Id;
    private String In_Date;
    private String Out_Date; 
    private String cust_Name;
    
    public customer(int pcust_Id, String pIn_Date, String pOut_Date,String pCust_Name)
    {
        this.cust_Id=pcust_Id;
        this.In_Date=pIn_Date;
        this.Out_Date=pOut_Date;
        this.cust_Name=pCust_Name;
    }
    
    public int getcust_Id()
    {
        return cust_Id;
    }
    
    public String getIn_Date()
    {
        return In_Date;
    }
    
    public String getOut_Date()
    {
        return Out_Date;
    }
    
    public String getcust_Name()
    {
        return cust_Name;
    }
}
