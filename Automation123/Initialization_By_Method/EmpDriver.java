package Initialization_By_Method;

public class EmpDriver {
	public static void main(String[] args)
	{
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		Emp e4=new Emp();
		e3.comp_name="Global TRADE PVT. LTD";
		e1.emp_name="mohan singh";
		e1.eid=345;
		e2.emp_name="sohan singh";
		e2.eid=347;
		e3.emp_name="Mammohan singh";
		e3.eid=437;
		e4.emp_name="Jagmohan singh";
		e4.eid=431;
		
		System.out.println("=========EMploy1 Details============");
		System.out.println("Employ e1 obj address is: "+e1);
		System.out.println("Employ company name is: "+e1.comp_name);
		System.out.println("Employ name is: "+e1.emp_name);
		System.out.println("Employ id is: "+e1.eid);
		System.out.println("=========EMploy2 Details============");
		System.out.println("Employ e2 obj address is: "+e2);
		System.out.println("Employ company name is: "+e2.comp_name);
		System.out.println("Employ name is: "+e2.emp_name);
		System.out.println("Employ id is: "+e2.eid);
		System.out.println("=========EMploy3 Details============");
		System.out.println("Employ e3 obj address is: "+e3);
		System.out.println("Employ company name is: "+e3.comp_name);
		System.out.println("Employ name is: "+e3.emp_name);
		System.out.println("Employ id is: "+e3.eid);
		System.out.println("=========EMploy4 Details============");
		System.out.println("Employ e4 obj address is: "+e4);
		System.out.println("Employ company name is: "+e4.comp_name);
		System.out.println("Employ name is: "+e4.emp_name);
		System.out.println("Employ id is: "+e4.eid);
			
	}
}
