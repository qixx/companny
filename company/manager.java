/**
 * 
 */
package companys;

/**
 * @author lenovo
 *
 */
 class manager extends person
{
	private int bonus;
	int day;
	public int wages()
	{
		return wage+bonus;
	}
	public	void getsalary()
	{
		/*while(super.day<15)
			super.day=day++;*/
		if(day==15)
			System.out.println("�����ʣ�"+wages());
		else
			System.out.println("û��ʱ��");
	}
	public manager(String n,int w,int d,int b) 
	{
		name=n;
		wage=w;
		day=d;
		bonus=b;
		show();
	}
}
