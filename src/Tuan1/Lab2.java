package Tuan1;

import java.util.Scanner;

public class Lab2 {
	public static Scanner sr = new Scanner(System.in);

	// Phương trình bậc 1
	public static void PhuongTrinhBac1(float a, float b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương tình có vô số nghiệm!!!");
			} else {
				System.out.println("Phương trình vô nghiệm!!!");
			}
		} else {
			System.out.println("Phương trình có nghiệm = " + (-b / a));
		}
	}

	//Giải phương trình bậc 2
	public static void PhuongTrinhBac2(float a, float b, float c)
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

	//Tính tiền điện
	public static void TinhTienDien(int SoDien) {
		if (SoDien < 50) {
			System.out.println("Hóa đơn : " + SoDien * 1000);
		} else {
			System.out.println("Hóa đơn : " + (50 * 1000 + (SoDien - 50) * 1200));
		}
	}

	public static void main(String[] args) {
		System.out.println("-----------MENU----------");
		System.out.println("1. Giai phuong trinh bac 1");
		System.out.println("2. Giai phuong trinh bac 2");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Exit");
		
		int Choice = 0;
		while (Choice != 4) {
			System.out.print("Choice: ");
			Choice = sr.nextInt();
			switch (Choice) {
				case 1: {
					System.out.print("Nhap a: ");
					float a = sr.nextFloat();
					System.out.print("Nhap b: ");
					float b = sr.nextFloat();
					
					PhuongTrinhBac1(a,b);
					break;
				}
				case 2: {
					
					System.out.print("Nhap a: ");
					float a = sr.nextFloat();
					System.out.print("Nhap b: ");
					float b = sr.nextFloat();
					System.out.print("Nhap c: ");
					float c = sr.nextFloat();
				
					PhuongTrinhBac2(a,b,c);
					break;
				}
				case 3: {
					System.out.print("Nhap so dien : ");
					int SoDien = sr.nextInt();
				
					TinhTienDien(SoDien);
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