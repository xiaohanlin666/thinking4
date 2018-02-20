package interfaces;

import generic.Parcel6;
import innerclasses.Contents;
import innerclasses.Destination;

public class Test extends Parcel6{
	public static void main(String[] args) {
		Parcel6 p=new Parcel6();
		Content2 c=p.getConAn1();
		Destination d=p.getDestin();
		System.out.println(c.x);
	}

}
