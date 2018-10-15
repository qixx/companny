/**
 * 
 */
package companys;

/**
 * @author lenovo
 *
 */
 class sharehold extends person
{
	private int profile;
	int month;
	int day;
	int wage=0;
	public sharehold(String n,int m,int d,int f) 
	{
		name=n;
		month=m;
		day=d;
		profile=f;
		show();
	}
	public double fh()
	{
		return 0.1*profile;
	}
	public void getsalary()
	{
		if(month==12&&day==31)
		System.out.println("发工资："+fh());
		else
			System.out.println("没到时间");
	}
}
