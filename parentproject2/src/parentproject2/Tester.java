package parentproject2;

public class Tester {
	public static void main(String[] args)
	  {
		
		
		//random num generator 
		int quantity1=(int) ((Math.random() * (7 - 3)) + 3);
		int quantity2=(int) ((Math.random() * (7 - 3)) + 3);
		int quantity3=(int) ((Math.random() * (7 - 3)) + 3);
		int quantity4=(int) ((Math.random() * (7 - 3)) + 3);
		int quantity5=(int) ((Math.random() * (7 - 3)) + 3);
		int quantity6=(int) ((Math.random() * (7 - 3)) + 3);

		Product p=new Product(5,"Target","bananana",quantity2);
		Clothing c=new Clothing(20,"Walmart","Sweatpants",quantity1,"Champion","Small");
		Electronics e=new Electronics(800,"Apple","Iphone",quantity3);
	
		Media med=new Media(15,"Netflix","GOT",quantity4,"Show");
		Men m=new Men(true,quantity5);
		Women w=new Women(false,quantity6);

		//System.out.print(w);
		
		Product arr[ ]= new Product[6];
		
arr[0]=p;
arr[1]=c;
arr[2]=e;
arr[3]=med;
arr[4]=m;
arr[5]=w;

int num=1;
int totalcost=0;

for(Product x:arr) {
	System.out.println("________________\nObject Number: "+num);
	System.out.println(x);
	double temp=totalCost(x);
	System.out.println("Total Price for this object: $"+temp);

totalcost+=temp;

	num++;
	
}





System.out.println("________________");
System.out.println("\n");

//header
System.out.printf("%-5s","Name");
System.out.printf("%17s","Company");
System.out.printf("%13s","Quantity");
System.out.printf("%7s","Cost");
System.out.printf("%13s%n","Total Cost");




System.out.printf("*********************************************************%n");

//1 internals
//System.out.print(p.getName()+"\t"+p.getCompany()+"\t  "+p.getQuantity()+"\t\t"+p.getPrice()+"\t"+totalCost(p));
System.out.printf("%-5s",p.getName());
System.out.printf("%14s",p.getCompany());
System.out.printf("%10s",p.getQuantity());
System.out.printf("%10s",p.getPrice());
System.out.printf("%10s%n",totalCost(p));





System.out.printf("%n");
//2
//System.out.print(c.getName()+"\t"+c.getCompany()+"\t  "+c.getQuantity()+"\t\t"+c.getPrice()+"\t"+totalCost(c));
System.out.printf("%-5s",c.getName());
System.out.printf("%13s",c.getCompany());
System.out.printf("%9s",c.getQuantity());
System.out.printf("%10s",c.getPrice());
System.out.printf("%10s%n",totalCost(c));
//3
//System.out.print(e.getName()+"\t\t"+e.getCompany()+"\t  "+e.getQuantity()+"\t\t"+e.getPrice()+"\t"+totalCost(e));
System.out.printf("%n");
System.out.printf("%-5s",e.getName());
System.out.printf("%15s",e.getCompany());
System.out.printf("%11s",e.getQuantity());
System.out.printf("%10s",e.getPrice());
System.out.printf("%10s%n",totalCost(e));
//4
//System.out.print(med.getName()+"\t\t"+med.getCompany()+"\t  "+med.getQuantity()+"\t\t"+med.getPrice()+"\t"+totalCost(med));

System.out.printf("%n");
System.out.printf("%-5s",med.getName());
System.out.printf("%18s",med.getCompany());
System.out.printf("%9s",med.getQuantity());
System.out.printf("%10s",med.getPrice());
System.out.printf("%10s%n",totalCost(med));

//5
//System.out.print(m.getName()+"\t\t"+m.getCompany()+"\t  "+m.getQuantity()+"\t\t"+m.getPrice()+"\t"+totalCost(m));
System.out.printf("%n");
System.out.printf("%-5s",m.getName());
System.out.printf("%17s",m.getCompany());	
System.out.printf("%10s",m.getQuantity());
System.out.printf("%10s",m.getPrice());
System.out.printf("%10s%n",totalCost(m));
System.out.printf("%n");
//6
//System.out.print(w.getName()+"\t\t"+w.getCompany()+"\t  "+w.getQuantity()+"\t\t"+w.getPrice()+"\t"+totalCost(w));
System.out.printf("%-5s",w.getName());
System.out.printf("%17s",w.getCompany());
System.out.printf("%10s",w.getQuantity());
System.out.printf("%10s",w.getPrice());
System.out.printf("%10s%n",totalCost(w));
System.out.printf("*********************************************************%n");
System.out.printf("%n");
//totals
System.out.printf("Total Cost For All objects:");
System.out.printf("%25d",totalcost);


	  }
	public static double totalCost(Product x) {
		Double totalPrice=x.getPrice()*(double)x.getQuantity();
		return totalPrice;
	}
}
