package com.psl.beans;

public class Leave {
	
	private int ol,pl,lwp;
	
	public Leave() {
		ol=2;
		pl=2;
		lwp=2;
	}

	@Override
	public String toString() {
		return "[Optional Leave =" + ol + ", Privileged Leave =" + pl + ", Leave Without Pay=" + lwp + "]";
	}

	public int getOl() {
		return ol;
	}

	public void setOl(int ol) {
		this.ol = ol;
	}

	public int getPl() {
		return pl;
	}

	public void setPl(int pl) {
		this.pl = pl;
	}

	public int getLwp() {
		return lwp;
	}

	public void setLwp(int lwp) {
		this.lwp = lwp;
	}
	
	

}
