package Main;

import java.util.Scanner;

import Main.DTO.RegisterRequest;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ɾ �Է��ϼ���: ");
		String command = sc.nextLine();
		if(command.startsWith("new")) {
			// ������ü (Ŭ���� �ȿ� �ִ� ��ü)
			// dependency object
			/*
			String [] arg = command.split(" ");
			App a = new App();
			if(arg.length != 5){
				a.printHelp();
			}
			RegisterRequest req = new RegisterRequest();
			*/
			if(command.equals("new")) {
				System.out.println("ȸ�����");
			}else if(command.startsWith("change")) {
				System.out.println("����");
			}else if(command.startsWith("list")) {
				System.out.println("����Ʈ");
			}else if(command.startsWith("info")) {
				System.out.println("����");
			}else if(command.startsWith("exit")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
			}
		}
	}
	
	public static void printHelp() {
		System.out.println();
		System.out.println("��ɾ� ����: ");
		System.out.println("new �̸��� �̸� ��ȣ ��ȣȮ��");
		System.out.println("change �̸��� ������ ������");
		System.out.println("list");	
		System.out.println("info  �̸���");
	}
}