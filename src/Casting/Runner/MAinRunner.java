package Casting.Runner;

import Casting.internal.ArmyVehical;
import Casting.internal.MRfTyre;
import Casting.internal.Rubber;
import Casting.internal.Tyre;

public class MAinRunner {
    public static void main(String[] args){
        Rubber rubber1=new Rubber();
        rubber1.expand();

        Rubber rubber=new Tyre();
        rubber.expand();


        Tyre tyre=new Tyre();
        tyre.expand();
        tyre.compress();

        MRfTyre mRfTyre=new MRfTyre();
        mRfTyre.expand();
        mRfTyre.compress();
        mRfTyre.radial();

        ArmyVehical armyVehical=new ArmyVehical();
        armyVehical.wheel(rubber);

    }



}
