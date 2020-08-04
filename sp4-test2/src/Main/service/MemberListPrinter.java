package Main.service;

import java.util.Collection;

import Main.DTO.MemberDTO;
import Main.DTO.MemberDao;

public class MemberListPrinter {
	private MemberDao memberDao = new MemberDao();
	private MemberPrinter printer = new MemberPrinter();
	public void printAll() {
		Collection<MemberDTO> lists = memberDao.selectAll();
		System.out.println("�� ȸ�� ����: " + lists.size());
		for(MemberDTO dto : lists) {
			printer.print(dto);
		}
	}
}
