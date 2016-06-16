package inputoutput.ue.inout;

import java.io.Serializable;

public class bsp3Person implements Serializable{

		// TODO Auto-generated method stub

		public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
	}


	public String getAlter() {
		return Geburstort;
	}


	public void setAlter(String alter) {
		this.Geburstort = alter;
	}


		@Override
	public String toString() {
		return "bsp3Person [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + Geburstort + "]";
	}


		private String vorname;
		private String nachname;
		private String Geburstort;
		
		
		public bsp3Person(String vorname, String nachname, String alter) {
			super();
			this.vorname = vorname;
			this.nachname = nachname;
			this.Geburstort = alter;
		}
		
		
		
	}

