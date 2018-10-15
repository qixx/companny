/**
 * 
 */
package companys;

/**
 * @author lenovo
 *
 */
class employee extends person
{
	private String department;
	int day;
	public employee(String n,int w,int d,String de)
	{
		name=n;
		wage=w;
		day=d;
		department=de;
		while(super.day<15)
			super.day=day++;
		show();
		getsalary();
		System.out.print("²¿ÃÅ:"+department);
	}
}
