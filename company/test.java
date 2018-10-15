/**
 * 
 */
package companys;

/**
 * @author lenovo
 *
 */
public class test {

	public static void main(String[] args)
	{
		employee emp=new employee("wangli",5000,13,"»À ¬≤ø");
		manager ma=new manager("lima",6000,15,2000);
		ma.getsalary();
		sharehold sh=new sharehold("xiaomw",12,31,130000);
		sh.getsalary();
	}

}
