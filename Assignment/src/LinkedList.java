public class LinkedList
{
	public int length=0;
	private Node head;
	public void addAtLast(int mul,int power)
	{
		if(mul==0)
			return;
		Node newNode=new Node(mul,power);
		if(this.head==null)
		{
				this.head=newNode;
				this.head.setNext(null);
		}
		else
		{
				Node temp=this.head;
				while(temp.getNext()!=null)
					temp=temp.getNext();
				temp.setNext(newNode);
		}
		this.simplify();
		this.length++;
	}
	public void reset()
	{this.head=null;}
	public boolean isEmpty()
	{return this.head==null;}
	public void display()
	{
		Node temp=this.head;
		String exp="";
		while(temp!=null)
		{
			if(temp.getMul()==0)
			{
				temp=temp.getNext();
				continue;
			}
			if(temp.getMul()<0)
				exp+="("+temp.getMul()+")";
			else if(temp.getMul()>0)
				exp+=temp.getMul();
			if(temp.getPower()==1)
				exp+="x";
			else if(temp.getPower()!=0)
				exp+="x^"+temp.getPower();
			exp+="+";
			temp=temp.getNext();
		}
		if(exp.charAt(exp.length()-1)=='+'||exp.charAt(exp.length()-1)=='-')
			exp=exp.substring(0,exp.length()-1);
		System.out.println(exp);
	}
	public int evaluate(int x)
	{
		int ans=0;
		Node temp=this.head;
		while(temp!=null)
		{
			ans+=temp.getMul()*Math.pow(x,temp.getPower());
			temp=temp.getNext();
		}
		return ans;
	}
	public void simplify()
	{
		Node temp=this.head;
		while(temp!=null)
		{
			Node temp2=temp.getNext();
			int mul=temp.getMul();
			while(temp2!=null)
			{
				if(temp.getPower()==temp2.getPower())
				{
					mul+=temp2.getMul();
					temp2.setMul(0);
					temp2.setPower(0);
				}
				temp2=temp2.getNext();
			}
			temp.setMul(mul);
			temp=temp.getNext();
		}
	}
	public static LinkedList add(LinkedList pol1,LinkedList pol2)
	{
		LinkedList sum=new LinkedList();
		Node temp1=pol1.head;
		while(temp1!=null)
		{
			sum.addAtLast(temp1.getMul(),temp1.getPower());
			temp1=temp1.getNext();
		}
		temp1=pol2.head;
		while(temp1!=null)
		{
			sum.addAtLast(temp1.getMul(),temp1.getPower());
			temp1=temp1.getNext();
		}
		return sum;
	}
	public static LinkedList subtract(LinkedList pol2,LinkedList pol1)
	{
		LinkedList sum=new LinkedList();
		Node temp1=pol2.head;
		while(temp1!=null)
		{
			sum.addAtLast(temp1.getMul(),temp1.getPower());
			temp1=temp1.getNext();
		}
		temp1=pol1.head;
		while(temp1!=null)
		{
			sum.addAtLast(temp1.getMul()*-1,temp1.getPower());
			temp1=temp1.getNext();
		}
		return sum;
	}
}
