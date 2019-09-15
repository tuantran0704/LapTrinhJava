package Tuan1;
import java.util.Scanner;

public class Lab1 {
			static Scanner sr = new Scanner(System.in);
			
			//Nhập họ tên sinh viên , điểm trung bình
			public static void bai1()
			{
				System.out.print("Tên : ");
				String ten = sr.nextLine();
				System.out.print("\nĐiểm TB : ");
				double DTB = sr.nextDouble();
				System.out.println("Tên : " + ten + "\nĐiểm TB : " + DTB);
			}
			
			//Tính chu vi và diện tích , tìm cạnh nhỏ nhất của HCN
			public static void bai2()
			{
				System.out.print("Dài : ");
				double dai = sr.nextDouble();
				System.out.print("Rộng : ");
				double rong = sr.nextDouble();
				double P = (dai+rong)*2;
				double S = dai*rong;
				double CanhNhoNhat = Math.min(dai, rong);
				
				System.out.println("P: " + P + "\nS: " + S+ "\nCạnh Nhỏ Nhất : " + CanhNhoNhat);
			}
			
			//Tính thể tích khối lập phương
			public static void bai3()
			{
				System.out.print("Nhập Cạnh : ");
				double Canh = sr.nextDouble();
				double TheTich = Math.pow(Canh,3);
				System.out.println("Thể Tích Lập Phương: " + TheTich);
			}

			//Giải phương trình bậc 2
			public static void bai4(float a, float b, float c)
			{
				Scanner sr=new Scanner(System.in);
				System.out.println("Nhap a : ");
				a = sr.nextFloat();
				System.out.println("Nhap b : ");
				b = sr.nextFloat();
				System.out.println("Nhap c : ");
				c = sr.nextFloat();
				//Kiểm tra phương trình
				if (a == 0) {
		            if (b == 0) {
		                System.out.println("Phương trình vô nghiệm!!!");
		            }
		            else {
		                System.out.println("Phương tình có 1 nghiệm ");
		                System.out.println("x = " + (-c / b));
		            }
		            return;
		        }
				else {
					//Tính delta
					float delta = (float) (Math.pow(b,2)-4*a*c);
					float x1;
					float x2;
					//Tính nghiệm
					if (delta > 0) {
						x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
						x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
						System.out.println("Phương trình có 2 nghiệm riêng biệt : ");
						System.out.println("x1 = " + x1 + " và x2 = " + x2);
					} else if (delta == 0) {
						x1 = (-b / (2 * a));
						System.out.println("Phương trình có nghiệm kép : ");
						System.out.println("x1 = x2 = " + x1);
					} else {
						System.out.println("Phương trình vô nghiệm!!!");
					}
				}
			}
			
			public static void main(String[] args) {
				System.out.println("---------MENU---------");
				System.out.println("1. Nhap ho ten sinh vien , diem trung binh ");
				System.out.println("2. Tinh chu vi va dien tich , tim canh nho nhat cua HCN");
				System.out.println("3. Tinh the tich khoi lap phuong");
				System.out.println("4. Giai phuong trinh bac 2");
				System.out.println("5. Exit");
				
				int Choice = 0;
				while (Choice != 5) {
					System.out.print("Choice : ");
					Choice = sr.nextInt();
					switch (Choice) {
						case 1: {
							bai1();
							break;
						}
						case 2: {
							bai2();
							break;
						}
						case 3: {
							bai3();
							break;
						}
						case 4: {
							bai4(1, 3, 7);
							break;
						}
						default: {
							System.out.println("DONE!!!");
							break;
						}
					}
				}
			}
}

