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
		System.out.println("�����ʣ�"+wage);
		else
			System.out.println("û��ʱ��");
	}
	public void show()
	{
		System.out.print("����:"+name);
	}
	
}
