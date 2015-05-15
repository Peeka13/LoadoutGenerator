/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadoutgenerator;

/**
 *
 * @author samanthahohmann
 */
public class Loadout {
    private String mClassName, mPrimary, mSecondary, mMelee, mPda;
    
    public Loadout(String cName, String primary, String secondary, String melee,
            String pda)
    {
        mClassName = cName;
        mPrimary = primary;
        mSecondary = secondary;
        mMelee = melee;
        mPda = pda;
    }
    
    public String getClassName()
    {
        return mClassName;
    }
    
    public String getPrimary()
    {
        return mPrimary;
    }
    
    public String getSecondary()
    {
        return mSecondary;
    }
    
    public String getMelee()
    {
        return mMelee;
    }
    
    public String getPDA()
    {
        return mPda;
    }
}
