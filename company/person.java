/**
 * 
 */
package companys;

/**
 * @author lenovo
 *
 */
class person
{
	protected String name;
	protected int wage;
	protected int month;
	protected int day;
	public person() {};
	public person(String name,int wage,int month,int day)
	{
		this.name=name;
		this.wage=wage;
		this.month=month;
		this.day=day;
	};
	public void getsalary()
	{
		if(day==15)
		System.out.println("发工资："+wage);
		else
			System.out.println("没到时间");
	}
	public void show()
	{
		System.out.print("姓名:"+name);
	}
	
}
