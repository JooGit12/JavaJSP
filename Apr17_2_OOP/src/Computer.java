public class Computer {
	String cpu;
	int ram;
	int hdd;
	
	public void show() {
		// 이 컴퓨터의 cpu라고 this.cpu
		System.out.println(this.cpu);
		// Java에서 this.은 생략가능
		System.out.println(ram);
		System.out.println(hdd);
	}
}
