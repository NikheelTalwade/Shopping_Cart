class Items
{
	private int sno;
	private String iname;
	private int iquantity;

	Items( int sno,String iname, int iquantity)
	{
	 this.sno = sno;
	 this.iname = iname;
	 this.iquantity = iquantity;
	}
	
	public int getsno()
	{
	 return sno;
	}
	
	public String getiname()
	{
	 return iname;
	}
	
	public int getiquantity()
	{
	 return iquantity;
	}
	
	public String toString()
	{
	 return sno +"  "+ iname +"     "+ iquantity ;
	}
}