package com.xworks.association.external;

import com.xworks.association.internal.*;
import com.xworks.association.internal.Constant.PortType;
import com.xworks.association.internal.Warrenty;
import com.xworks.association.internal.Quanlity;

public class Projector {
    Warrenty warranty = new Warrenty();
    Lamp lamp = new Lamp(warranty);
    Quanlity quality = new Quanlity();
    Wire wire = new Wire(quality);
    Voltage voltage = new Voltage();
    Battery battery = new Battery(voltage);
    Remote remote = new Remote(battery);
    Port port = new Port();
    Material material = new Material();
    Button button = new Button(material);
    Capacitor capacitor = new Capacitor();
    Board board = new Board(capacitor);



    public void useProjector(){

        if(lamp != null){
            this.lamp.setCost(2000);
            this.lamp.setColor("orange");
            System.out.println("Lamp cost : "+this.lamp.getCost());
            System.out.println("Lamp color : "+this.lamp.getColor());
            this.lamp.glow();
        }

        if(wire != null){
            System.out.println("Wire length : "+this.wire.getLength());
            System.out.println("Wire cost : "+this.wire.gettype());
            this.wire.transferData();
        }

        if(remote != null){
            remote.setColor("Black");
            remote.setSize("M");
            System.out.println("Remote Color: "+remote.getColor());
            System.out.println("Remote Size : "+remote.getSize());
            remote.pressKey();
        }

        if(port != null){
            port.connected();
            port.setPT(PortType.USB);
            System.out.println("Port type : "+port.getPT());
        }

        if(button != null){
            button.setnoofButton(15);
            System.out.println("No of buttons : "+button.getNoOfButton());
            button.Function();
        }



    }

}
