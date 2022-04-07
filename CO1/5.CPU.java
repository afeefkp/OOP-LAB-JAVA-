
public class CPU {
	int price;
	class Processor{
		int no_of_cores;
		String manufacturer;
		public Processor(int x,String y){
			no_of_cores=x;
			manufacturer=y;
			System.out.println("no of cores: "+x);
			System.out.println("manufacturer: "+y);
		}
		
	}
	static class Ram{
		int memory;
		String manufacturer;
		public Ram(int a,String b){
			memory=a;
			manufacturer=b;
			System.out.println("memory: "+a);
			System.out.println("manufacturer: "+b);
		}
	}

	public static void main(String[] args) {
		CPU obj1=new CPU();
		CPU.Processor obj2=obj1.new Processor(56,"Intel");
		CPU.Ram obj3=new CPU.Ram(16, "Nvdia");
	

	}

}
